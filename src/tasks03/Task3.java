package tasks03;/*Дана матрица размера m x n. Вывести ее элементы в следующем порядке:
первая строка справа налево,вторая строка слева направо,
третья строка справа налево и так далее.
*/

public class Task3 {
    public static void main(String[] args) {
        int m = 5;
        int n = 4;
        int[][] array = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16},
                {17, 18, 19, 20},
        };

        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < array[i].length; j++) {
                    System.out.print(array[i][j] + " ");
                }
            } else {
                for (int j = (array[i].length - 1); j >= 0; j--) {
                    System.out.print(array[i][j] + " ");
                }
            }
            System.out.println();
        }


    }
}
