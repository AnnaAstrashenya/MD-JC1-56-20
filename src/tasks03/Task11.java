package tasks03;/*
Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в
которых число 5 встречается три и более раз.
 */

public class Task11 {
    public static void main(String[] args) {
        int array[][] = new int[10][20];

        for (int i = 0; i < array.length; i++) {
            int m = i;
            int k = 0;
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 15);
                if (array[i][j] == 5) {
                    k++;
                }
                System.out.print(array[i][j] + " ");
            }

            if (k >= 3) {
                m = i;
                System.out.print("Число 5 встречаеся 3 или более раз в строке: " + m);
            }

            System.out.println();
        }

    }
}
