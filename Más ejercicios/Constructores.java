public class Constructores {
    
    public class Persona {
        String nombre;
        int edad;

        // Constructor

        public Persona (String nombre, int edad){
            this.nombre = nombre;
            this.edad = edad;
            System.out.println("Hola, soy " + nombre + " y tengo " + edad + " años");
        }
    }
}
