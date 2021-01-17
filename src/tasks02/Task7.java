package tasks02;

/*
    Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.
 */

public class Task7 {
    public static void main(String[] args) {
        double[] array;
        array = new double[]{111, 29, 2, 31, 6, 8, 42};
        double max = array[0];
        double min = array[0];
        int j = 0;
        int k = 0;

        printMas(array);

        for (int i = 0; i < array.length; i++) {

            if (min >= array[i]) {
                min = array[i];
                j = i;
            }

            if (max <= array[i]) {
                max = array[i];
                k = i;
            }
        }
        array[j] = max;
        array[k] = min;

        printMas(array);
    }

    public static void printMas(double[] mas) {
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
        System.out.println();
    }
}
