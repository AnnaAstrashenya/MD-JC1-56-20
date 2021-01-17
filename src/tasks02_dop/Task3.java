package tasks02_dop;

/*
    Дана величина А, выражающая объем информации в байтах. Перевести А в более крупные
единицы измерения информации.
 */

public class Task3 {
    public static void main(String[] args) {

        double a = 103441134;
        double kb;
        double mb;
        double gb;


        if (a > 0) {

            kb = a / 1024;
            System.out.printf("%.2f байт =  %.2f килобайт", a, kb);
            System.out.println();

            mb = kb / 1024;
            System.out.printf("%.2f байт =  %.2f мегабайт", a, mb);
            System.out.println();

            gb = mb / 1024;
            System.out.printf("%.2f байт =  %.4f гигабайт", a, gb);
            System.out.println();

        } else {
            System.out.println("Введено неверное число");
        }
    }
}
