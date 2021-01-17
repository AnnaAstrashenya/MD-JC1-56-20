package tasks02_dop;

/*
Вычислить значение функции
 */

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        double x = 0;
        double fx;

        Scanner sc = new Scanner(System.in);

        System.out.print("Введите x: ");
        while (!sc.hasNextDouble()) {
            sc.nextLine();
            System.out.print("Введите x: ");
        }
        x = sc.nextDouble();

        if (x <= 3) {
            fx = x * x - 3 * x + 9;
        } else {
            fx = 1 / (Math.pow(x, 3) + 6);
        }
        System.out.println("Значение f(x) = " + fx);
    }
}
