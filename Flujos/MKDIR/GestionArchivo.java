import java.io.File;

public class GestionArchivo {
    public static void main(String[] args) {
        File archivo = new File("MKDIR/ejemplo.txt");

        try {
            if (archivo.createNewFile()) {
                System.out.println("Archivo creado: " + archivo.getName());
            } else {
                System.out.println("El archivo ya existe.");
            }
        } catch (Exception e) {
            System.out.println("ERROR AL CREAR EL ARCHIVO " + e.getMessage());
        }

        // Eliminar archivo
        // if (archivo.delete()) {
        //     System.out.println("El archivo ha sido eliminado: " + archivo.getName());
        // }
        // else {
        //     System.out.println("El archivo no pudo ser eliminado");
        // }
    }
}