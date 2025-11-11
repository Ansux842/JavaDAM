package ModelosCoches;

public class Persona {
    private String nombre;
    private String pass;
    private int dni;

    // Constructor
    public Persona(String nombre, String pass) {
        this.nombre = nombre;
        this.pass = pass;
    }

    // Getter de nombre
    public String getNombre() {
        return nombre;
    }

    // Setter de pass
    public void setPass(String pass) {
        this.pass = pass;
    }

    // Getter de pass (NO RECOMENDADO para contraseñas en entornos reales)
    public String getPass() {
        return pass;
    }

    public static void main(String[] args) {
        Persona p = new Persona("Carlos", "password");
        System.out.println(p.getNombre()); // Imprime: Carlos

        p.setPass("12345");
        System.out.println(p.getPass()); // Imprime: 12345
    }
}