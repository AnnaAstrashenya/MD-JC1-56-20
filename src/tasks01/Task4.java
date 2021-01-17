package tasks01;
/*
    Напишите программу нахождения гипотенузы и площади прямоугольного
    треугольника по двум катетам
 */

public class Task4 {

    public static void main(String[] args) {
        double a;
        double b;
        double c;
        double p;
        double s;

        a = 10;
        b = 15;

        c = Math.sqrt(a * a + b * b);
        s = 0.5 * a * b;
        p = a + b + c;

        System.out.println("Периметр прямоугольного треугольника = " + p);
        System.out.println("Площадь прямоугольного треугольника = " + s);
    }
}

