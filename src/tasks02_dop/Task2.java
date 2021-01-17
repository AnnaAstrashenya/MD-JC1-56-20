package tasks02_dop;

/*
    Вычислить значение выражения по формуле (все переменные принимают действительные
значения): a/c * b/d - (a * b - c)/cd
*/

public class Task2 {
    public static void main(String[] args) {
        double a = 2.1;
        double b = 1.2;
        double c = 3.2;
        double d = 2.3;
        double temp1;
        double temp2;
        double temp3;
        double temp4;
        double rez;

        temp1 = a / c;
        temp2 = b / d;
        temp3 = a * b - c;
        temp4 = c * d;

        rez = temp1 * temp2 - temp3 / temp4;
        System.out.println("Результат уравнения = " + rez);
    }
}
