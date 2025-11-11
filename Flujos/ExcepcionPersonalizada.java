// Definición de la excepción personalizada

class ValorNoValidoException extends Exception {

    public ValorNoValidoException() {

        super("El valor ingresado no es válido.");

    }

 

    public ValorNoValidoException(String mensaje) {

        super(mensaje);

    }

}

 

// Clase principal

public class ExcepcionPersonalizada {

    public static void validarNumero(int numero) throws ValorNoValidoException {

        if (numero < 0) {

            throw new ValorNoValidoException("El número no puede ser negativo.");

        }

        System.out.println("Número válido: " + numero);

    }

 

    public static void main(String[] args) {

        try {

            validarNumero(-5);

        } catch (ValorNoValidoException e) {

            System.out.println("Error: " + e.getMessage());

        }

    }

}