package tasks02;

/*
    В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
 */

public class Task1 {
    public static void main(String[] args) {
        int k = 3;
        int sum = 0;

        int array[] = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (1 + (Math.random()) * 100); // заполнение массива натуральными числами до 100
            System.out.print(array[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < array.length; i++) {
            if (array[i] % k == 0) {
                sum = sum + array[i];
            }
        }
        System.out.println("Сумма чисел кратных k = " + sum);


    }
}
