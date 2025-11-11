package ArrayList;
import java.util.HashSet;
import java.util.Set;

public class EjemploConjuntos {
    public static void main(String[] args) {
        Set<String> conjunto = new HashSet<>();

        // Agregamos elementos al conjunto
        conjunto.add("Rojo");
        conjunto.add("Verde");
        conjunto.add("Naranja");
        conjunto.add("Azul");
        conjunto.add("Rojo"); 
       

        // Mostramos el conjunto
        System.out.println("El conjunto es: " + conjunto);

        //Verificar elementos
        System.out.println("El conjunto contiene 'Rojo':" + conjunto.contains("Rojo") );

        //Tamaño del conjunto
        System.out.println("El tamaño del conjunto es: " + conjunto.size());

        //Eliminar un elemento
        System.out.println("Eliminando el 'Azul'");
        conjunto.remove("Azul");

        // Mostramos el conjunto final
        System.out.println("El conjunto es: " + conjunto);


    }
}