import java.util.Scanner;

public class tiempo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca su nota: ");
        String tiempo = teclado.nextLine();
        switch (tiempo) {

            case "Soleado":
                System.out.println("Hoy hace sol");
                break;

            case "Nublado":
                System.out.println("Hoy esta nueblado");
                break;

            default:
                System.out.println("Esta lloviendo");
        }
        teclado.close();
    }
}