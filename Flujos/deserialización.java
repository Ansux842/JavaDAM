import java.io.*;

//Clase serializable
class Persona implements Serializable {
    private static final long serialVersionUID = 1L;
    String nombre;
    int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
}

public class deserialización {
    public static void main(String[] args) {
        //Creamos un objeto de la clase Persona
        Persona persona1 = new Persona ("Sergio", 31);

        //lectura del objeto desde el archivo
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("persona.dat"))) {
            Persona pLeida = (Persona) ois.readObject();
            System.out.println("Nombre: " + pLeida.nombre + " Edad: " + pLeida.edad);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al deserializar el objeto: " + e.getMessage());
        }
    }
}