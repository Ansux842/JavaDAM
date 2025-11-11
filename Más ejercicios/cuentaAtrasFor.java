public class cuentaAtrasFor {
    public static void main(String[] args) {
        for (int i = 10; i >= 0; i--) {
            System.out.println("Cuenta atras: " + i);
            if (i == 0) {
                System.out.println("Final!");
            }
        }
    }
}
