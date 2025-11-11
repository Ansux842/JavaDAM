package Constructores;

// Clase principal
public class Main {
    public static void main(String[] args) {
        // Crear Objeto basado en un Constructor
        Coche miCoche = new Coche("Honda", "Civic", 2023, 0);
        Coche miCoche2 = new Coche("Toyota", "Corolla", 2022, 60000);
        Coche miCoche3 = new Coche("Ferrari", "F8", 2021, 10000);
        Moto miMoto = new Moto("Honda", "CBR", 2021, 25000);

        // Llamar al metodo mostrarInfo
        miCoche.mostrarInfo();
        System.out.println("");
        
        miCoche2.mostrarInfo();
        System.out.println("");

        miCoche3.mostrarInfo();
        System.out.println("");

        miMoto.mostrarInfo2();
    }
}