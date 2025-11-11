public class ejemplosArray {
    public static void main(String[] args) {
        //definir un array con nombres de usuarios
        String[] usuarios = {"Carlos", "María", "Juan", "Irene"};

        //Mostrar los nombres de los usuarios
        for (int i = 0; i < usuarios.length; i++) {
            System.out.println("Usuario " + (i + 1) + ": " + usuarios[i]);
        }
    }
}