package Dia25_Excepciones;

public class ejemploTryCatch {
    public static void main(String[] args) {
        try {
            int resultado = 10 / 0; // Esto producirá un error de división por cero
            System.out.println("El resultado es igual a: " + resultado);

        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Este bloque se ejecuta siempre.");
        }
    }
}
