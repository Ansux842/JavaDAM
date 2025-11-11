import java.util.Scanner;
public class positivonegativo0 {
    public static void main(String[] args) {
        Scanner ejercicio = new Scanner(System.in);
        System.out.println("Introduzca un número:");
        int x=ejercicio.nextInt();
        if (x > 0) {
           System.out.println("El numero introducido es positivo");

        }
        else if (x < 0) {
            System.out.println("El numero introducido es negativo");

        }
        else {
            System.out.println("El número introducido es 0");
        }
        ejercicio.close();
    }
}