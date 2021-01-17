package tasks02_dop;
/*
    Найти НОД двух целых положительных чисел.
 */

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите любое целое число больше 0: ");
        while (!sc.hasNextInt()) {
            sc.nextLine();
            System.out.print("Введите любое целое число больше 0: ");
        }
        a = sc.nextInt();

        System.out.print("Введите любое целое число больше 0: ");
        while (!sc.hasNextInt()) {
            sc.nextLine();
            System.out.print("Введите любое целое число больше 0: ");
        }
        b = sc.nextInt();

        if ((a == 0 | b == 0) & (a % 1 == b % 1)) {
            System.out.println("Недопустимое значение");
            return;
        }

        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        System.out.println("НОД = " + a);


    }
}
