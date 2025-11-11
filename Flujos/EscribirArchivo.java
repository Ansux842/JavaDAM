import java.io.FileWriter;
import java.io.IOException;

public class EscribirArchivo {
    public static void main(String[] args) {
        try (FileWriter escribe = new FileWriter("MKDIR/ejemplo.txt")) {
            escribe.write ("Hola, este es un archivo de prueba. \n");
            escribe.write ("Esto es una segunda línea. \n");
            escribe.write ("Y esto es una tercera línea. \n");
            System.out.println("Archivo escrito correctamente.");
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo." + e.getMessage());
        }
    }
}