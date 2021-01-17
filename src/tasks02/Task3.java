package tasks02;

/*
    Дана последовательность действительных чисел а1 а2 ,..., аn . Выяснить, будет ли она возрастающей.
 */

public class Task3 {
    public static void main(String[] args) {

        double[] mas;
        mas = new double[]{11.1, 13, 14, 15.2, 1, 25, 30, 34.2, 45, 53.1};
        check(mas);
    }

    public static void check(double[] array) {
        boolean a = false;
        double min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (min < array[i]) {
                min = array[i];
                a = true;
            } else {
                a = false;
                break;
            }
        }

        if (a) {
            System.out.println("Последовательность возрастающая");
        } else {
            System.out.println("Последовательность не возрастающая");
        }
    }

}
