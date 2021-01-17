package tasks02_dop;

/*
    1. Вычислить значение выражения по формуле (все переменные принимают действительные
значения):
(𝑏 + √(𝑏2 + 4𝑎𝑐))/2a − 𝑎3𝑐 + 𝑏(-2)

 */

public class Task1 {
    public static void main(String[] args) {
        double a = 4;
        double b = 2.1;
        double c = 3.4;
        double temp;
        double rez;

        temp = Math.sqrt(b * b + 4 * a * c);
        rez = (b + temp) / (2 * a) - Math.pow(a, 3) + Math.pow(b, -2);
        System.out.println("Значение выражения равно= " + rez);
    }

}
