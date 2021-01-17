package tasks02_dop;

/*
    Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и
    если да, то будет ли он прямоугольным.
 */

public class Task6 {
    public static void main(String[] args) {
        int a = 30;
        int b = 60;
        int c = 180 - a - b;

        if (c > 0) {
            System.out.println("Существование такого треугольника возможно");
            if (a == 90 | b == 90 | c == 90) {
                System.out.println("Этот треугольник прямоугольный");
            }
        } else {
            System.out.println("Такого треугольника не существует");
        }

    }
}
