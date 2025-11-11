import java.io.*;

public class LeerImagen {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("imagen.jpeg")) {
            byte[] datos = fis.readAllBytes();
            System.out.println("Imagen leída con éxito, tamaño: " + datos.length + " bytes");
        } catch (IOException e) {
            System.out.println("Error al leer la imagen: " + e.getMessage());
        }
    }
}