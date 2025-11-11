import java.util.Scanner;
public class ejswitch {
public static void main(String[] args) {
Scanner ejercicioMes = new Scanner(System.in);
    System.out.println("Introduzca un número");
int numberMonth = ejercicioMes.nextInt();
    switch (numberMonth) {
        case 1: case 3: case 5: case 7: case 8: case 10: case 12:
            System.out.println("El mes tiene 31 dias");
            break;
        case 4: case 6: case 9: case 11:
            System.out.println("El mes tiene 30 dias");
            break;
        case 2:
            System.out.println("El mes tiene 28 o 29 días");
            break;
        default:
            System.out.println("El mes es erroneo");
            break;
    }    
    ejercicioMes.close();
    }
}