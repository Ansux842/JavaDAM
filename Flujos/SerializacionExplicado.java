import java.io.*; // Importa todas las clases necesarias para la serialización y deserialización

// Clase serializable
class Persona implements Serializable { // Declara la clase Persona que implementa Serializable para permitir la serialización
    private static final long serialVersionUID = 1L; // Define un identificador de versión para la clase serializable
    String nombre; // Declara un campo de instancia para almacenar el nombre de la persona
    int edad; // Declara un campo de instancia para almacenar la edad de la persona

    public Persona(String nombre, int edad) { // Constructor de la clase Persona
        this.nombre = nombre; // Inicializa el campo nombre con el valor proporcionado
        this.edad = edad; // Inicializa el campo edad con el valor proporcionado
    }
}

public class SerializacionExplicado { // Declara la clase principal SerializacionExplicado
    public static void main(String[] args) { // Método principal, punto de entrada de la aplicación
        // Creamos un objeto de la clase Persona
        Persona persona1 = new Persona("Sergio", 31); // Crea una instancia de Persona con nombre "Sergio" y edad 31

        // Escritura del objeto en un archivo
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("persona.dat"))) { // Crea un ObjectOutputStream para escribir el objeto en un archivo
            oos.writeObject(persona1); // Escribe el objeto persona1 en el archivo
            System.out.println("Objeto serializado correctamente."); // Imprime un mensaje indicando que la serialización fue exitosa
        } catch (IOException e) { // Captura cualquier excepción de E/S que ocurra durante la serialización
            System.out.println("Error al serializar el objeto: " + e.getMessage()); // Imprime un mensaje de error si ocurre una excepción
        }

        // Lectura del objeto desde el archivo
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("persona.dat"))) { // Crea un ObjectInputStream para leer el objeto desde el archivo
            Persona pLeida = (Persona) ois.readObject(); // Lee el objeto desde el archivo y lo convierte de nuevo a un objeto Persona
            System.out.println("Nombre: " + pLeida.nombre + " Edad: " + pLeida.edad); // Imprime los datos del objeto deserializado
        } catch (IOException | ClassNotFoundException e) { // Captura cualquier excepción de E/S o de clase no encontrada que ocurra durante la deserialización
            System.out.println("Error al deserializar el objeto: " + e.getMessage()); // Imprime un mensaje de error si ocurre una excepción
        }
    }
}