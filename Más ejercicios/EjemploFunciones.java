import java.util.Scanner;

public class EjemploFunciones {

    Scanner teclado = new Scanner(System.in);
    
    // Esta es una función simple que no toma parámetros y no devuelve ningún valor
    public void saludar() {
        System.out.println("¡Hola, mundo!");
    }

    // Esta es una función que toma un parámetro (nombre) y no devuelve ningún valor
    public void saludar(String nombre) {
        System.out.println("¡Hola, " + nombre + "!");
    }

    // Esta es una función que toma dos parámetros (a y b) y devuelve un valor (la suma de a y b)
    public int sumar(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        EjemploFunciones ejemplo = new EjemploFunciones();

        // Llamada a la función sin parámetros
        ejemplo.saludar();

        // Llamada a la función con un parámetro
        ejemplo.saludar("Sergio");

        // Llamada a la función que devuelve un valor
        int resultado = ejemplo.sumar(5, 3);
        System.out.println("La suma es: " + resultado);
    }
}
