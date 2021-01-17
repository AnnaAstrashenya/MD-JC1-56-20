package tasks01;

import java.util.Scanner;

/*
Программа запрашивает количество чисел, затем вводит целые числа в соответствии
с указанным количеством. Определяет количество четных, сумму кратных 3-м и
количество чисел, модуль которых <3
 */
public class Task9 {

    public static void main(String[] args) {

        int numbers = 0;
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите количество целых чисел = ");

        while (!sc.hasNextInt()) {
            sc.nextLine();
            System.out.println("Введите количество целых чисел = ");
        }
        numbers = sc.nextInt();

        for (int i = 0; i < numbers; i++) {
            int number;
            System.out.println("Введите целое число: ");
            if (sc.hasNextInt()) {
                number = sc.nextInt();

                if (number % 2 == 0) {
                    count1++;
                }

                if (number % 3 == 0) {
                    count2 = count2 + number;
                }

                if (Math.abs(number) < 3) {
                    count3++;
                }
            } else {
                System.out.println("Ошибка");
            }
        }
        System.out.println("Количество четных чисел = " + count1);
        System.out.println("Сумма чисел кратных 3-м = " + count2);
        System.out.println("Количество чисел, чей модуль меньше 3 = " + count3);

    }
}
