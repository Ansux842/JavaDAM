import java.util.Scanner;

public class ejercicioFor2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("¿Cuantos productos se vendieron hoy? ");
        int totalProductos = teclado.nextInt();

        int totalVentas = 0;
        for (int i = 1; i <= totalProductos; i++) {
            System.out.print("Introduzca el precio del producto " + i + ": ");
            int precio = teclado.nextInt();
            totalVentas += precio;
        }

        System.out.println("El total de ventas de hoy es: " + totalVentas);
        
        teclado.close();
    }
}
