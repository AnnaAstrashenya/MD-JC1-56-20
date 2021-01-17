package tasks02_dop;

/*
    Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить,
    пройдет ли кирпич через отверстие.
 */

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        double a;
        double b;
        double x;
        double y;
        double z;

        a = rectangle("Введите a: ");
        b = rectangle("Введите b: ");

        x = brick("Введите x: ");
        y = brick("Введите y: ");
        z = brick("Введите z: ");

        if (a > x && b > z) {
            System.out.println("Пройдет");

        } else if (a > z && b > x) {
            System.out.println("Пройдет");
        } else if (a > y && b > z) {
            System.out.println("Пройдет");
        } else if (a > z && b > y) {
            System.out.println("Пройдет");
        } else if (a > y && b > x) {
            System.out.println("Пройдет");
        } else if (a > x && b > y) {
            System.out.println("Пройдет");
        } else {
            System.out.println("Не пройдет");
        }

    }

    public static double rectangle(String string) {
        double v;
        Scanner sc = new Scanner(System.in);
        System.out.print(string);
        while (!sc.hasNextDouble()) {
            sc.nextLine();
            System.out.print(string);
        }
        v = sc.nextDouble();
        return v;
    }

    public static double brick(String string) {
        double w;
        Scanner sc = new Scanner(System.in);
        System.out.print(string);
        while (!sc.hasNextDouble()) {
            sc.nextLine();
            System.out.print(string);
        }
        w = sc.nextDouble();
        return w;
    }


}
