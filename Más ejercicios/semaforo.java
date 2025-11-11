import java.util.Scanner;

public class semaforo {
    public static void main(String[] args) {
        Scanner semaforo = new Scanner(System.in);
        System.out.print("Introduzca un color (Verde, amarillo o rojo): ");
    String luz=semaforo.nextLine();
        if (luz.equalsIgnoreCase("Verde")) {
           System.out.println("Puede avanzar");
        }
        else if (luz.equalsIgnoreCase("Amarillo")) {
            System.out.println("Prepare para detenerse");

        }
        else if (luz.equalsIgnoreCase("Rojo")) {
           System.out.println("Debe detenerse"); 
        }
        else{
            System.out.println("Color no reconocido. Intente de nuevo.");
        }
        semaforo.close();
    }
}