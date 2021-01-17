package tasks01;

import java.util.Scanner;
/*
Программа вводит количество чисел N, а затем N вещественных чисел. Программа
усекает вещественные числа и определяет, сколько среди усеченных чисел четных
и >15.
 */

public class Task10 {
    public static void main(String[] args) {

        int numbers = 0;
        int count1 = 0;
        int count2 = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите количество чисел = ");
        while (!sc.hasNextInt()) {
            sc.nextLine();
            System.out.println("Введите количество чисел = ");
        }
        numbers = sc.nextInt();

        for (int i = 0; i < numbers; i++) {
            double number;
            number = Math.random() * 100;

            int newNumber = (int) number;       //усекаю до целого
            System.out.println(newNumber);

            if (newNumber % 2 == 0) {
                count1++;
            }

            if (newNumber > 15) {
                count2++;
            }
        }
        System.out.println("Количество четных чисел: " + count1);
        System.out.println("Количество чисел>15: " + count2);
    }
}
