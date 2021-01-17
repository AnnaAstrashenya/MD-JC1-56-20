package tasks02_dop;
/*
    Требуется определить факториал числа, которое ввел пользователь.
 */

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        int a = 0;
        int fc = 1;

        Scanner sc = new Scanner(System.in);

        System.out.print("Введите любое натуральное число больше 0: ");
        while (!sc.hasNextInt()) {
            sc.nextLine();
            System.out.print("Введите любое натуральное число больше 0: ");
        }
        a = sc.nextInt();

        if (a > 0 & a % 1 == 0) {
            for (int i = 1; i <= a; i++) {
                fc = fc * i;
            }
            System.out.println("Факториал введенного числа = " + fc);
        } else {
            System.out.println("Вы ввели неподходящее число");
        }

    }
}


