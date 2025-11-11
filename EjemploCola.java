package ArrayList;
import java.util.*;
public class EjemploCola {
    public static void main(String[] args) {
        Queue<String> cola = new LinkedList<>();
        //Agregar elementos
        cola.offer("Cliente 1");
        cola.offer("Cliente 2");
        cola.offer("Cliente 3");

        System.out.println("Tamaño de la cola al principio: " + cola.size());
        
        //Mostrar la cola
        System.out.println("Cola completa: " + cola);

        //Sacar un elemento de la cola
        System.out.println("Sacando el primer elemento de la cola: " + cola.poll());

        //Ver elemento sin quitarlo
        System.out.println("Siguiente cliente: " + cola.peek());

        //Mostrar si la cola esta vacía
        System.out.println("¿La cola está vacía? " + cola.isEmpty());

        //Tamaño de la cola
        System.out.println("Tamaño de la cola al final: " + cola.size());
    }
}