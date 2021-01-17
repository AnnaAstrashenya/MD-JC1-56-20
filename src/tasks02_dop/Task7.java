package tasks02_dop;

/*
    Подсчитать количество отрицательных среди чисел а, b, с.
 */

public class Task7 {
    static int count = 0;

    public static void main(String[] args) {
        double a = -3;
        double b = 9;
        double c = 6;

        if (a < 0) {
            count++;
        }
        if (b < 0) {
            count++;
        }
        if (c < 0) {
            count++;
        }

        System.out.println("Количество отрицательных чисел среди a,b,c = " + count);

    }
}
