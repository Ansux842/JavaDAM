import java.util.Scanner;

public class nota {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca su nota: ");
        int nota = teclado.nextInt();
        switch (nota) {
            case 10:
            case 9:
                System.out.println("Sobresaliente");
                break;

            case 8:
            case 7:
                System.out.println("Notable");
                break;

            case 6:
            case 5:
                System.out.println("Bien");
                break;

            default:
                System.out.println("Suspenso");
        }
        teclado.close();
    }
}