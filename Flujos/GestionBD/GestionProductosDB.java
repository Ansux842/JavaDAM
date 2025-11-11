import java.sql.*;
import java.util.Scanner;
import javax.sql.*;

class Productos {

    class Producto {
        int id;
        String nombre;
        double precio;

        public Producto(int id, String nombre, double precio) { 
            this.id = id;
            this.nombre = nombre;
            this.precio = precio;
        }
    }
    
    public class GestionProductosDB {
        private static final String URL = "jdbc:mysql://localhost:3306/tienda";
        private static final String USUARIO = "root";
        private static final String PASSWORD = "";
        private static Scanner teclado = new Scanner(System.in);

        public static void main(String[] args) {
            int opcion;
            do {
                System.out.println("\n---- Menú de productos ----");
                System.out.println("\n 1. Agregar productos");
                System.out.println("\n 2. Ver productos");
                System.out.println("\n 3. Actualizar productos");
                System.out.println("\n 4. Salir");
                System.out.print("\n Seleccione una opción: ");
                opcion = teclado.nextInt();
                teclado.nextLine(); // Limpiar el buffer

                switch (opcion) {
                    case 1:
                        agregarProducto();
                        break;
                    case 2:
                        verProductos();
                        break;
                    case 3:
                        actualizarProducto();
                        break;
                    case 4:
                        System.out.println("Hasta luego");
                        return;
                    default:
                        System.out.println("Opción no válida. Seleccione una opción correcta");
                        break;
                }
            } while (opcion != 4);
        }
    
        // Método para agregar un producto a la base de datos
        private static void agregarProducto() {
            System.out.print("Ingrese el nombre del producto: ");
            String nombre = teclado.nextLine();
            System.out.print("Ingrese el precio del producto: ");
            double precio = teclado.nextDouble();
            teclado.nextLine(); // Consumir la nueva línea
    
            String sql = "INSERT INTO productos (nombre, precio) VALUES (?, ?)";
    
            try (Connection conn = DriverManager.getConnection(URL, USUARIO, PASSWORD);
                 PreparedStatement pstmt = conn.prepareStatement(sql)) {
                pstmt.setString(1, nombre);
                pstmt.setDouble(2, precio);
                pstmt.executeUpdate();
                System.out.println("Producto agregado correctamente.");
            } catch (SQLException e) {
                System.out.println("Error al agregar producto: " + e.getMessage());
            }
        }
    
        // Método para mostrar los productos almacenados en la base de datos
        private static void verProductos() {
            String sql = "SELECT * FROM productos";
    
            try (Connection conn = DriverManager.getConnection(URL, USUARIO, PASSWORD);
                 Statement stmt = conn.createStatement();
                 ResultSet rs = stmt.executeQuery(sql)) {
                System.out.println("\n--- Lista de Productos ---");
                while (rs.next()) {
                    int id = rs.getInt("id");
                    String nombre = rs.getString("nombre");
                    double precio = rs.getDouble("precio");
                    System.out.println(id + ". " + nombre + " - " + precio + " euros");
                }
            } catch (SQLException e) {
                System.out.println("Error al recuperar productos: " + e.getMessage());
            }
        }
    
        // Método para modificar un producto existente en la base de datos
        private static void actualizarProducto() {
            System.out.print("Ingrese el ID del producto a modificar: ");
            int id = teclado.nextInt();
            teclado.nextLine(); // Consumir la nueva línea
    
            System.out.print("Nuevo nombre del producto (deje en blanco para no cambiar): ");
            String nuevoNombre = teclado.nextLine();
            System.out.print("Nuevo precio del producto (ingrese -1 para no cambiar): ");
            double nuevoPrecio = teclado.nextDouble();
            teclado.nextLine(); // Consumir la nueva línea
    
            String sql = "UPDATE productos SET nombre = COALESCE(NULLIF(?, ''), nombre), precio = CASE WHEN ? >= 0 THEN ? ELSE precio END WHERE id = ?";
    
            try (Connection conn = DriverManager.getConnection(URL, USUARIO, PASSWORD);
                 PreparedStatement pstmt = conn.prepareStatement(sql)) {
                pstmt.setString(1, nuevoNombre);
                pstmt.setDouble(2, nuevoPrecio);
                pstmt.setDouble(3, nuevoPrecio);
                pstmt.setInt(4, id);
                int filasActualizadas = pstmt.executeUpdate();
                if (filasActualizadas > 0) {
                    System.out.println("Producto actualizado correctamente.");
                } else {
                    System.out.println("No se encontró un producto con ese ID.");
                }
            } catch (SQLException e) {
                System.out.println("Error al actualizar producto: " + e.getMessage());
            }
        }
    }
}