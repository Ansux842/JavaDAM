package Clases;

public class ClaseExterna {
    private class ClasePrivada {
        public void mostrarMensaje() {
            System.out.println("Hola, soy un mensaje de una clase privada");
        }
    }
    
    public void crearClasePrivada() {
        ClasePrivada objeto = new ClasePrivada();
            objeto.mostrarMensaje();
    }
}