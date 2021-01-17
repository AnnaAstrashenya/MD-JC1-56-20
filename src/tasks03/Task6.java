package tasks03;

/*
Сформировать квадратную матрицу порядка n по заданному образцу(n - четное)
 */
public class Task6 {
    public static void main(String[] args) {
        int n = 8;
        int[][] array = new int[n][n];
        int k = array.length - 1;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == 0 | i == k) {                           // условие для первой и последней строки
                    array[i][j] = 1;
                } else {
                    if (j == 0 || j == k) {                     // условие для остальных строк
                        array[i][j] = 1;
                    }
                }
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }
}
