import java.util.Scanner;

public class calificaciones {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca su calificación (1-10): ");
        int calification = teclado.nextInt();

        if (calification >= 9) {
            System.out.println("Su calificación es: Sobresaliente");
        } else {
            if (calification >= 7 && calification < 9) {
                System.out.println("Su calificación es: Notable");
            } else {
                if (calification >= 5 && calification < 7) {
                    System.out.println("Su calificación es: Bien");
                } else {
                    System.out.println("Su calificacion es: Suspenso");
                }
                teclado.close();
            }
        }
    }
}