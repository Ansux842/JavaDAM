package ArrayList;
import java.util.Stack;

public class EjemploPila {
    public static void main(String[] args) {
        Stack<String> pila = new Stack<>();

        // Agregamos elementos a la pila
        pila.push("Libro A");
        pila.push("Libro B");
        pila.push("Libro C");
        pila.push("Libro D");
        pila.push("Libro E");

        //Mostrar la pila completa
        System.out.println("Lista completa: " + pila);

        //Sacar un elemento de la pila
        System.out.println("Sacando un elemento de la pila: " + pila.pop());

        // Ver el elemento superior de la pila
        System.out.println("El elemento superior de la pila es: " + pila.peek());

        // Verificar si la pila está vacía
        System.out.println("¿La pila está vacia? " + pila.isEmpty());

        //Obtener un elemento por su posición (en este caso, por su índice)
        System.out.println("El tercer libro es: " + pila.get(2));

        //Eliminar un elemento
        pila.remove("Libro B");
        System.out.println("Lista después de eliminar Libro B: " + pila);

        //Tamaño de la lista
        System.out.println("El tamaño de la lista actualmente es: " + pila.size());

        //Recorrer la lista con un un bucle for each
        System.out.println("Lista final de libros: ");

        for (String lista : pila) {
            System.out.println("- " + lista);
    }
}
}
