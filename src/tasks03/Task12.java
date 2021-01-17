package tasks03;/*
Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число
единиц равно номеру столбца.
 */

public class Task12 {
    public static void main(String[] args) {
        int m = 8;
        int n = 7;
        int[][] array = new int[m][n];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = 0;

                if (j > i) {
                    array[i][j] = 1;
                }

                System.out.print(array[i][j] + " ");
            }

            System.out.println();
        }

    }
}
