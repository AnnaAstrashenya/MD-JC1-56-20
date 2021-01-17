package tasks03;
/*
Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 */

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        int n = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите любое четное число больше 0: ");

        while (!sc.hasNextInt()) {
            sc.nextLine();
            System.out.print("Введите любое четное число больше 0: ");
        }
        n = sc.nextInt();

        if (n % 2 != 0) {
            System.out.println("Ошибка");
            return;
        }

        int[][] array = new int[n][n];

        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {                                             //условие для чётной строки
                int k = 1;
                for (int j = 0; j < array[i].length; j++) {
                    array[i][j] = k;
                    System.out.print(array[i][j] + " ");
                    k++;
                }
            } else {                                                  // условие для нечетной строки
                int k = n;
                for (int j = 0; j < array[i].length; j++) {
                    array[i][j] = k;
                    System.out.print(array[i][j] + " ");
                    k--;
                }
            }
            System.out.println();
        }


    }
}
