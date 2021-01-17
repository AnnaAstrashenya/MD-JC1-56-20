package tasks03;// Дана матрица. Вывести k-ю строку и p-й столбец матрицы

public class Task2 {
    public static void main(String[] args) {
        int k = 0;              // K-я строка для вывода на печать
        int r = 1;              //r-й столбец для вывода на печать
        int[][] array = {
                {0, 4, 9},
                {11, 2, 8},
                {3, 1}
        };

        for (int i = 0; i < array.length; i++) {
            if (i == k) {                                         //вывод строки
                for (int j = 0; j < array[i].length; j++) {
                    System.out.print(array[i][j] + " ");
                }
            }
        }
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j == r) {                                  //вывод столбца
                    System.out.println(array[i][j]);
                }
            }
        }


    }
}
