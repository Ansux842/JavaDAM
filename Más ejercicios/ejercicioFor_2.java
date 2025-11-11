import java.util.Scanner;

public class ejercicioFor_2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("¿Cuantos productos se vendieron hoy? ");
        int totalProductos = teclado.nextInt();
        int totalVentas = 0;

        for (int i = 1; i <= totalProductos; i++) {

            System.out.print("Introduzca el precio del producto: ");
            int precio = teclado.nextInt();
            totalVentas += precio;
            
        }
        System.out.println("El precio total de las ventas de hoy es de: " + totalVentas);
        teclado.close();
    }
}