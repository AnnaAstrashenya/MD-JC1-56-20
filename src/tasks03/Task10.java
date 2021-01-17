package tasks03;/*
   Найти положительные элементы главной диагонали квадратной матрицы.
 */

public class Task10 {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3, 4, 1},
                {5, -6, 7, 8, 1},
                {9, -10, -11, 1, 2},
                {13, 14, 15, 16, 7},
                {17, 8, 9, -2, -1},
        };

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j & (array[i][j] < 0)) {
                    System.out.println(array[i][j]);
                }
            }
        }

    }
}
