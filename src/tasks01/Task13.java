package tasks01;

import java.util.Scanner;
/*
Вычислить значение выражения по формуле (все переменные принимают
действительные значения)
 */

public class Task13 {
    public static void main(String[] args) {
        double a = 0;
        double b = 0;
        double c = 0;
        double d = 0;

        double kor;
        double temp1;
        double count1;
        double count2;

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите действительное число a = ");
        while (!sc.hasNextDouble()) {
            sc.nextLine();
            System.out.println("Введите действительное число a = ");
        }
        a = sc.nextDouble();

        System.out.println("Введите действительное число b = ");
        while (!sc.hasNextDouble()) {
            sc.nextLine();
            System.out.println("Введите действительное число b = ");
        }
        b = sc.nextDouble();

        System.out.println("Введите действительное число c = ");
        while (sc.hasNextDouble()) {
            sc.nextLine();
            System.out.println("Введите действительное число c = ");
        }
        c = sc.nextDouble();

        System.out.println("Введите действительное число d = ");
        while (!sc.hasNextDouble()) {
            sc.nextLine();
            System.out.println("Введите действительное число d = ");
        }
        d = sc.nextDouble();

        kor = Math.sqrt(b * b + 4 * a * c);
        temp1 = (b + kor) / (2 * a);
        count1 = temp1 + Math.pow(a, 3) * c + b;
        System.out.println("Результат уравнения 1 = " + count1);

        count2 = (a / c) * (b / d) - (a * b - c) / (c / d);
        System.out.println("Результат уравнения 2 = " + count2);

    }
}
