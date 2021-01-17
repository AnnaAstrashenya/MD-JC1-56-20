package tasks01;

/*
Составить программу для вычисления значений функции F(x) на отрезке [а, b] с
шагом h. Результат представить в виде таблицы, первый столбец которой – значения
аргумента, второй - соответствующие значения функции
 */

public class Task15 {
    public static void main(String[] args) {
        int a = 1;
        int b = 10;
        int h = 3;
        double x;
        double fx;

        x = a;

        while (x <= b) {
            double temp = x / 2;
            fx = 2 * Math.tan(temp) + 1;

            System.out.printf("%.2f  %.2f", x, fx);
            System.out.println();
            x = x + h;
        }

    }
}
