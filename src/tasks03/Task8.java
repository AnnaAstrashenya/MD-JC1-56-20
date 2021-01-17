package tasks03;/*
Сформировать квадратную матрицу порядка n по заданному образцу(n - четное)
 */

public class Task8 {
    public static void main(String[] args) {
        int n = 8;
        int[][] array = new int[n][n];

        for (int i = 0; i < array.length; i++) {
            int m = i+1;
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = m;
                if (j >= n) {
                    array[i][j] = 0;
                }
                System.out.print(array[i][j] + " ");
                m++;
            }
            n--;
            System.out.println();
        }


    }
}
