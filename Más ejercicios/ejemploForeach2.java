public class ejemploForeach2 {
        public static void main(String[] args) {
            //Creamos el array "numeros"
            int[] numeros = {1, 2, 3, 4, 5};
            //Se crea la variable "extraeNumeros" y saca los datos del array "numeros"
            for (int extraeNumeros : numeros) {
                System.out.println("Número: " + extraeNumeros);
            }
            //Cuando ya no quedan datos en el array termina el bucle y muestra el siguiente mensaje.
            System.out.println("Terminó el contenido del array");
        }
}