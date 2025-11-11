 package ArrayList;
import java.util.HashMap;
import java.util.Map;

public class EjemploMapas {
    public static void main(String[] args) {
        Map<Integer, String> mapa = new HashMap<>();

        // Agregar elementos al mapa
        mapa.put(1, "Juan");
        mapa.put(2, "Carlos");
        mapa.put(3, "Irene");
        mapa.put(4, "Sergio");

        //Mostrar tabla (mapa) completa
        System.out.println("Lista de nombres al principio: " + mapa);

        //Obtener el valor por la clave
        System.out.println("Valor del índice 1: " + mapa.get(1));

        //Verificar si existe una clave
        System.out.println("¿Existe el índice 2? " + mapa.containsKey(2));

        //Eliminar un elemento
        System.out.println("Eliminando el índice 2");
        mapa.remove(2);

        //Mostrar tabla (mapa) final
        System.out.println("Lista de nombres al final: " + mapa);
    } 
}
