import java.util.Scanner;

public class EntradaEstandar {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.print("Ingrese su nombre: ");
        String nombre = teclado.nextLine();
        System.out.println("Hola " + nombre + "!");
        teclado.close();
    }
}
