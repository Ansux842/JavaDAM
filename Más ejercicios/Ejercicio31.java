import java.util.Scanner;

public class Ejercicio31 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double[] numeros = new double[10];
        double suma = 0;
        double max;
        double min;

        // Paso 1: Entrada de datos.
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce un número para la posición " + (i + 1) + ": ");
            numeros[i] = teclado.nextDouble();
        }

        // Paso 2: Inicializar max y min con el primer elemento.
        max = numeros[0];
        min = numeros[0];

        // Paso 3: Calcular suma, máximo y mínimo.
        for (double numero : numeros) {
            suma += numero;

            if (numero > max) {
                max = numero;
            }
            if (numero < min) {
                min = numero;
            }
        }

        // Paso 4: Calcular promedio.
        double promedio = suma / numeros.length;

        // Paso 5: Mostrar resultados.
        System.out.println("El promedio de los números es: " + promedio);
        System.out.println("El valor máximo es: " + max);
        System.out.println("El valor mínimo es: " + min);

        teclado.close();
    }
}