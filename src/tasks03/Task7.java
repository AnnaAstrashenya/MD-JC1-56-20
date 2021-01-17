package tasks03;/*
Сформировать квадратную матрицу порядка n по заданному образцу(n - четное)
 */

public class Task7 {
    public static void main(String[] args) {
        int n = 6;
        int[][] array = new int[n][n];
        int m = 1;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = m;
                if (j >= n) {
                    array[i][j] = 0;
                }
                System.out.print(array[i][j] + " ");
            }
            n--;
            m++;
            System.out.println();
        }

    }
}
