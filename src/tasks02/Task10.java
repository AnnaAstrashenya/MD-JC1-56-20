package tasks02;

/*
    Даны действительные числа 𝑎1, 𝑎2, … , 𝑎2𝑛.
    Найти max

 */

import java.util.Random;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        int n = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите целое число n = ");
        while (!sc.hasNextInt()) {
            sc.nextLine();
            System.out.println("Введите целое число n = ");
        }
        n = sc.nextInt();

        Random random = new Random();
        double[] mas = new double[2 * n];

        for (int i = 0; i < mas.length; i++) {
            mas[i] = random.nextDouble() * 100; // заполнение массива
            System.out.print(mas[i] + " ");
        }

        System.out.println();

        double maxTwo = mas[0] + mas[2 * n - 1];

        for (int i = 0, j = 2 * n - 1; i < j; i++, j--) {
            if (maxTwo <= (mas[i] + mas[j])) {
                maxTwo = (mas[i] + mas[j]);
            }

        }
        System.out.println("Наибольшая из пар = " + maxTwo);

    }
}
