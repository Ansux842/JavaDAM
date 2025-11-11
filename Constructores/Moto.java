package Constructores;

//definir la clase moto con un constructor
public class Moto {
    String marca;
    String modelo;
    int anio;
    int km;

    // constructor con parametros
    Moto(String marca, String modelo, int anio, int km) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.km = km;
    }

    // metodo para mostrar los datos de la moto
    void mostrarInfo2() { 
        System.out.println("La marca de la moto es: " + marca);
        System.out.println("El modelo de la moto es: " + modelo);
        System.out.println("El año de la moto es: " + anio);
        System.out.println("El kilometraje de la moto es: " + km);
    }
}