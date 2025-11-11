import java.util.Scanner;

public class areaGeometrica {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca que figura quiere calcular: ");
        String figura = teclado.nextLine();

        switch (figura.toLowerCase()) {
            case "Cuadrado":
                System.out.print("Introduzca el valor del lado: ");
                double lado = teclado.nextDouble();
                double areaCuadrado = lado * lado;
                System.out.println("El area del cuadrado es: " + areaCuadrado);
                break;

            case "rectangulo":
                System.out.print("Introduzca la longitud del lado mayor: ");
                double ladoMayor = teclado.nextDouble();
                System.out.print("Introduzca la longitud del lado menor: ");
                int ladoMenor = teclado.nextInt();
                double areaRectangulo = ladoMayor * ladoMenor;
                System.out.println("El área del rectangulo es: " + areaRectangulo);
                break;

            case "circulo":
                System.out.print("Introduzca el radio: ");
                double radio = teclado.nextDouble();
                double areaCirculo = Math.PI * radio * radio;
                System.out.println("El área del circulo es: " + areaCirculo);
                break;

            default:
                System.out.println("Introduzca una figura válida.");
                break;
        }
        teclado.close();
    }
}