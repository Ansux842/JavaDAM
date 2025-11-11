import java.util.Scanner;
public class ejmeses{
public static void main(String[] args) {
    Scanner ejmonth = new Scanner(System.in);
    System.out.println("Introduzca un numero entre 1 y 4");
int numberMonth = ejmonth.nextInt();
    switch (numberMonth) {
        case 1:
            System.out.println("El mes es enero");
            break;
        case 2:
            System.out.println("El mes es febrero");
            break;
        case 3:
            System.out.println("El mes es marzo");
            break;
        case 4:
            System.out.println("El mes es abril");
            break;
        default:
            System.out.println("Ningun mes");
    }    
    ejmonth.close();
    }
}