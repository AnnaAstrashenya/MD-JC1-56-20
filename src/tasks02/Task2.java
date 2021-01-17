package tasks02;


/* В целочисленной последовательности есть нулевые элементы.
   Создать массив из номеров этих элементов.
 */

public class Task2 {
    public static void main(String[] args) {
        int[] array;
        int n = 0;

        array = new int[]{11, 0, 7, 0, 6, 0, 9, 21, 0};
        printMas(array);

        for (int i = 0; i < array.length; i++) {

            if (array[i] == 0) {
                n = n + 1;
                int j = 0;
                int[] array1 = new int[n];
                array1[j] = i;
                System.out.print(array1[j] + " ");
            }
        }
    }

    public static void printMas(int[] mas) {
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
        System.out.println();
    }

}
