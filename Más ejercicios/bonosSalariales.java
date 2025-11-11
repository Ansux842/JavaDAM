import java.util.Scanner;

public class bonosSalariales {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca su calificacion de rendimiento (0-100): ");
        int rendimiento = teclado.nextInt();
        if (rendimiento >= 90) {
            System.out.println("Ha obtenido un bono del 20% del salario.");
        } else {
            if (rendimiento > 75 && rendimiento <= 89) {
                System.out.println("Ha obtenido un bono del 10% del salario.");
            } else {
                if (rendimiento > 60 && rendimiento <= 74) {
                    System.out.println("Ha obtenido un bono del 5% del salario.");
                } else {
                    System.out.println("Sin bono");
                }
                // Preguntar por cerrar el Scanner
                teclado.close();
            }
        }
    }

}