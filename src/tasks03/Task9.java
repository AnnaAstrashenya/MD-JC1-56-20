package tasks03;/*
Дан линейный массив
Получить действительную квадратную матрицу порядка n
 */

public class Task9 {
    public static void main(String[] args) {
        int[] array = new int[]{2, 4, 5};
        int k = array.length;                                    // длина одномерного массива = размер массива массивов
        int[][] arrayNew = new int[k][k];                        // создание массива массивов
        int l = 1;                                               // счетчик степени

        for (int i = 0; i < arrayNew.length; i++) {
            int n = 0;                                          // индекс элементов одномерного массива
            for (int j = 0; j < arrayNew[i].length; j++) {
                int elem = array[n];
                arrayNew[i][j] = (int) Math.pow(elem, l);
                System.out.print(arrayNew[i][j] + " ");
                n++;
            }
            l++;
            System.out.println();
        }


    }
}
