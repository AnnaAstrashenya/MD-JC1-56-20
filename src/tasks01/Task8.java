package tasks01;

import java.util.Scanner;

/*
Программа вводит два числа a и b, если a=b, то вывести на экран слова «скоро Новый
Год!», в противном случае ввести третье число с и вывести на экран 3 строки :
-значение выражения a+b+c
-значение выражения 𝑎2 + 𝑏2
-«моя любимая футбольная команда»
 */

public class Task8 {
    public static void main(String[] args) {

        double a = 10;
        double b = 3;
        double c = 4;
        double s;
        double d;

        if (a == b) {
            System.out.println("Скоро Новый год!");
        } else {
            s = a + b + c;
            d = a * a + b * b;
            System.out.println("значение выражения а+b+с = " + s);
            System.out.println("значение выражения a2 + b2 = " + d);
            System.out.println("Моя любимая футбольная команда");
        }

    }
}

