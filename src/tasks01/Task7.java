package tasks01;

import java.util.Scanner;
/*
Программа вводит два числа a и b, если а > b, то программа вводит третье число с и
находит сумму b+c. Если а=b, то программа печатает слово «Конец». Если а<b, то
программа вводит третье число с, находит сумму a+b+c, выводит на экран сумму
a+b+c и слова «Новый год!».
 */

public class Task7 {
    public static void main(String[] args) {
        double a = 10;
        double b = 16;
        double c = 5;
        double s;


        if (a > b) {
            s = b + c;
            System.out.println(s);
        }

        if (a == b) {
            System.out.println("Конец");
        }

        if (a < b) {
            s = a + b + c;
            System.out.println(s);
            System.out.println("Новый год!");
        }


    }
}
