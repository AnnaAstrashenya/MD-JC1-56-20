package tasks02_dop;

/*
    Составить программу: определения наименьшего из двух чисел а и b.
 */

public class Task5 {
    public static void main(String[] args) {
        double a = 11;
        double b = 5;

        double c = Math.min(a, b);
        System.out.println("Наименьшее число " + c);
    }
}
