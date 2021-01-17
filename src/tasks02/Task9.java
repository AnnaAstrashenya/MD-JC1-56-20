package tasks02;

/*
    Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
положительных и нулевых элементов.
 */

public class Task9 {
    public static void main(String[] args) {
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;

        double[] array;
        array = new double[]{111, 0, 2, -31, 6, -8, 42, 5, 8, -3};
        printMas(array);

        for (int i = 0; i < array.length; i++) {

            if (array[i] > 0) {
                count1 = count1 + 1;
            } else if (array[i] < 0) {
                count2 = count2 + 1;
            } else {
                count3 = count3 + 1;
            }
        }
        System.out.println("Количество действительных чисел больше 0 = " + count1);
        System.out.println("Количество действительных чисел меньше 0 = " + count2);
        System.out.println("Количество действительных чисел равных 0 = " + count3);

    }

    public static void printMas(double[] mas) {
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
        System.out.println();
    }

}
