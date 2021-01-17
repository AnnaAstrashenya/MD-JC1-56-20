package tasks02;

/*
    Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.
 */

public class Task8 {
    public static void main(String[] args) {
        int[] array;
        array = new int[]{11, 0, 7, 2, 6, 4, 9};
        printMas(array);

        for (int i = 0; i < array.length; i++) {

            if (array[i] > i) {
                System.out.print(array[i] + " ");
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
