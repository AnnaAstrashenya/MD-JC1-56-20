package tasks01;

import java.util.Scanner;
/*
Даны три действительных числа. Возвести в квадрат те из них, значения которых
неотрицательны, и в четвертую степень — отрицательные.
 */

public class Task14 {
    public static void main(String[] args) {
        double a = 0;

        double count1 = 0;
        double count2 = 0;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Введите действительное число: ");

            while (!sc.hasNextDouble()) {
                sc.nextLine();
                System.out.println("Введите действительное число: ");
            }
            a = sc.nextDouble();

            if (a >= 0) {
                count1 = a * a;
                System.out.println(count1);
            } else {
                count2 = Math.pow(a, 4);
                System.out.println(count2);
            }
        }

    }
}
