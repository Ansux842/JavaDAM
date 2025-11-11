import java.util.Scanner;

public class Envio {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("""
                Elija el método de envío:
                -------------------------
                1. Estandar
                2. Rápido
                3. Expres
                -------------------------
                Escriba el tipo de envio:
                """);

        String metodoEnvio = teclado.nextLine();
        switch (metodoEnvio) {
            case "1":
                System.out.println("Entrega en 5-7 días hábiles");
                break;
            case "2":
                System.out.println("Entrega en 2-3 días hábiles");
                break;
            case "3":
                System.out.println("Entrega en 1 día hábil");
                break;
            default:
                System.out.println("Método de envío no reconocido");
                break;
        }
        teclado.close();
    }
}