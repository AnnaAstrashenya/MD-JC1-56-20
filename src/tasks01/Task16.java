package tasks01;

import java.util.Scanner;
/*
    Вычислить длину окружности и площадь круга одного и того же заданного радиуса R
 */

public class Task16 {
    public static void main(String[] args) {
        double r = 0;
        double s;
        double l;

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите действительное число: ");
        while (!sc.hasNextDouble()) {
            sc.nextLine();
            System.out.println("Введите действительное число: ");
        }
        r = sc.nextDouble();

        l = 2 * Math.PI * r;
        System.out.println("Длина окружности = " + l);

        s = 2 * Math.PI * r * r;
        System.out.println("Площадь круга = " + s);

    }

}
