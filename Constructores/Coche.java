package Constructores;

//definir la clase coche con un constructor
public class Coche {
    String marca;
    String modelo;
    int anio;
    int km;

    // constructor con parametros
    Coche(String marca, String modelo, int anio, int km) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.km = km;
    }

    // metodo para mostrar los datos del coche
    void mostrarInfo() { 
        System.out.println("La marca del coche es: " + marca);
        System.out.println("El modelo del coche es: " + modelo);
        System.out.println("El año del coche es: " + anio);
        System.out.println("El kilometraje del coche es: " + km);
    }
}