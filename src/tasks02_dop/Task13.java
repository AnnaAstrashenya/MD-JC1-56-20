package tasks02_dop;

import java.util.Scanner;
/*
    Напишите программу, где пользователь вводит любое целое положительное число. А
    программа суммирует все числа от 1 до введенного пользователем числа.
 */

public class Task13 {
    public static void main(String[] args) {
        int a = 0;
        int sum = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Введите любое целое положительное число: ");
        while (!sc.hasNextInt()) {
            sc.nextLine();
            System.out.print("Введите любое целое положительное число: ");
        }
        a = sc.nextInt();

        if ((a > 0 && a % 1 == 0)) {

            for (int i = 0; i < a; i++) {
                sum = sum + i;
            }
            System.out.println("Сумма чисел до введенного числа = " + sum);
        } else {
            System.out.println("Введено неверное число");
        }
    }
}
