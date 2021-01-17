package tasks01;

import java.util.Scanner;

/*
    Программа запрашивает у пользователя a,b,c ,вычислить значение выражения
 */

public class Task6 {
    public static void main(String[] args) {
        double a, b, c, s;
        a = 0;
        b = 0;
        c = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Введите a = ");
        while (!scan.hasNextDouble()) {
            scan.nextLine();
            System.out.println("Введите a = ");
        }
        a = scan.nextDouble();

        System.out.println("Введите b = ");
        while (!scan.hasNextDouble()) {
            scan.nextLine();
            System.out.println("Введите b = ");
        }
        b = scan.nextDouble();

        System.out.println("Введите c = ");
        while (!scan.hasNextDouble()) {
            scan.nextLine();
            System.out.println("Введите c = ");
        }
        c = scan.nextDouble();

        double temp = b * b - 1;
        s = a * a - ((b - c) * (b - c)) + Math.log(temp);
        System.out.println("Результат выражения:" + s);
    }
}
