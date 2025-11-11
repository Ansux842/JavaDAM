package ArrayList;
import java.util.ArrayList;

public class EjemploArrayList {
    public static void main(String[] args) {
        
        // Crear un arraylist
        ArrayList<String> nombres = new ArrayList<>();

        // Agregar elementos a la lista
        nombres.add("Carlos");
        nombres.add("Juan");
        nombres.add("Irene");
        nombres.add("Sergio");

        //Mostrar la lista completa
        System.out.println("Lista completa: " + nombres);

        //Obtener un elemento por su posición
        System.out.println("El tercer nombre es: " + nombres.get(2));

        //Modificar un elemento
        System.out.println("Cambiar el primer nombre: " + nombres.set(0, "Maribel"));

        //Eliminar un elemento
        nombres.remove("Juan");
        System.out.println("Lista después de eliminar a Juan: " + nombres);

        //Tamaño de la lista
        System.out.println("El tamaño de la lista actualmente es: " + nombres.size());

        //Verificar si existe un elemento
        if (nombres.contains("Sergio")) {
            System.out.println("Sergio está en la lista");
        } else {
            System.out.println("Sergio no está en la lista");
        }

        //Recorrer la lista con un un bucle for each
        System.out.println("Lista final de nombres: ");

        for (String lista : nombres) {
            System.out.println("- " + lista);
            
        }
    }
}