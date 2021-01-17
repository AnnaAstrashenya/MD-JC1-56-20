package tasks02_dop;
/*
    Вычислить значения функции на отрезке [а,b] c шагом h
 */

public class Task11 {
    public static void main(String[] args) {
        double a = 1;
        double b = 10;
        double h = 3;
        double x = 0;
        double y = 0;

        x = a;

        while (x < b) {
            if (x > 2) {
                y = x;
            }

            if (x <= 2) {
                y = -x;
            }
            System.out.println("Значение функции = " + y);
            x = x + h;
        }
    }
}
