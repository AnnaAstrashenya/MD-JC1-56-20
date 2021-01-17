package tasks02;

/*
    Дана последовательность действительных чисел а1 ,а2 ,..., ап.
    Заменить все ее члены, большие данного Z, этим числом.
    Подсчитать количество замен.
 */

public class Task6 {
    public static void main(String[] args) {
        double[] array;
        array = new double[]{14.2, -4, 1.7, 0.8, 6, 18, 29};
        double z = 13;
        int count = 0;

        printMas(array);

        for (int i = 0; i < array.length; i++) {

            if (z <= array[i]) {
                array[i] = z;
                count = count + 1;
            }
        }

        printMas(array);

        System.out.println("Количество замен = " + count);
    }

    public static void printMas(double[] mas) {
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
        System.out.println();
    }
}
