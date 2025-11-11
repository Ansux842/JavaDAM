public class ejemploForeach {
    public static void main(String[] args) {
        String[] nombres = new String[] { "Sergio", "Irene", "Juan", "Pedro", "Luis", "Claudia", "Jose", "María", "Jaime", "Celia" };
        //Esta es la forma de escribir el comando foreach
        // for (tipo variable : coleccion) {}
        for (String itemActual : nombres) {
            System.out.println("Los nombres del grupo: " + itemActual);
        }
    }
}