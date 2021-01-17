package tasks03;
//Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.

public class Task1 {
    public static void main(String[] args) {
        int[][] array = new int[][]{
                {12, 3, 18, 20},
                {1, -8, 16, 4},
                {4, 6, 11, 0},
                {78, 1, 3, 9}
        };

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j == i) {
                    System.out.print(array[i][j] + ",");
                }

            }

        }


    }
}