public class PruebaArray {
    public static void main(String[] args) {
        Double[] preciosConValores = { 19.99, 45.50, 12.75, 89.90 };
        Double total = 0.0;

        for (double suma : preciosConValores) {
            total += suma;
        }

        System.out.println("El precio total de los productos es: " + total);
        
    }
}