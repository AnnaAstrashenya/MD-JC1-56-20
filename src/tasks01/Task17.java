package tasks01;

/*
Вычислить значение функции
 */

public class Task17 {
    public static void main(String[] args) {
        double x = 12;
        double fx;
        double temp;

        if (x <= -3) {
            System.out.println("Результат равен: 9");
        } else if (x > 3) {
            temp = x * x + 1;
            fx = 1 / temp;
            System.out.println("Результат равен: " + fx);
        } else {
            System.out.println("Ваше число не подходит ни под одно условие");
        }
    }
}
