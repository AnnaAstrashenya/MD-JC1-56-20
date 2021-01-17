package tasks02;
/*
    Дана последовательность натуральных чисел а1 , а2 ,..., ап.
    Создать массив из четных чисел этой последовательности.
    Если таких чисел нет, то вывести сообщение об этом факте
 */

public class Task4 {
    public static void main(String[] args) {
        int n = 0;

        int[] array = new int[]{11, 4, 8, 9, 1, 12, 7,9,18};
        printMas(array);

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                n++;
            }
        }


        int[] array1 = new int[n];
        int j = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                array1[j] = array[i];
                j++;
            }
        }
        printMas(array1);

        if (array1.length == 0) {
            System.out.println("В последовательности нет четных чисел");
        }
    }


    public static void printMas(int[] mas) {
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
        System.out.println();
    }

}

