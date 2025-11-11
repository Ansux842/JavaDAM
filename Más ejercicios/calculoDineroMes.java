public class calculoDineroMes {
    public static void main(String[] args) {
        double sueldo = 2000;
        double gastoLuzGas = 80;
        double gastoComida = 50;
        double gastoAlquiler = 600;
        double gastoVarios = 500;
        double gastoRopa = 100;
        double totalgastos = sueldo+ gastoLuzGas+ gastoComida+ gastoAlquiler + gastoVarios +gastoRopa;
        double dineroRestante = 300;
    
        String resumen = ("""
                ============================================
                        RESUMEN FINANCIERO DEL MES
                ============================================
                Sueldo mensual:                 $ %.2f
                Gasto en Luz/Gas:               $ %.2f
                Gasto en Comida:                $ %.2f
                Gasto en Alquiler:              $ %.2f
                Gasto en Varios:                $ %.2f
                Gasto en Ropa:                  $ %.2f
                Sueldo total:                   $ %.2f
                 --------------------------------------------
                DINERO RESTANTE:                $ %.2f
            """) .formatted(sueldo, gastoLuzGas, gastoComida, gastoAlquiler, gastoVarios, gastoRopa, totalgastos, dineroRestante);
    System.out.println(resumen);
}
}