package tasks01;

import java.util.Scanner;
/*
Программа запрашивает количество чисел, вводит целые числа в соответствии с
заявленным количеством ,определяет, сколько чисел больше 15 или <2, чему равна
сумма чисел, которые делятся на 5 с остатком 4. Результат вывести на экран.
 */

public class Task11 {
    public static void main(String[] args) {
        int numbers = 0;

        int count1 = 0;
        int count2 = 0;
        int count3 = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Введите количество целых чисел = ");
        while (!sc.hasNextInt()) {
            sc.nextLine();
            System.out.print("Введите количество целых чисел = ");
        }
        numbers = sc.nextInt();

        for (int i = 0; i < numbers; i++) {
            int number = (int) (Math.random() * 100);
            System.out.println(number);

            if (number % 5 == 4) {
                count1 = count1 + number;
            }

            if (number > 15) {
                count2++;
            }

            if (number < 2) {
                count3++;
            }
        }

        System.out.println("Чисел больше 15: " + count2);
        System.out.println("Чисел меньше 2:" + count3);
        System.out.println("Сумма чисел, которые делятся на 5 с остатком 4: " + count1);

    }
}
