package tasks03;

/*
Сформировать квадратную матрицу порядка n по заданному образцу(n - четное)
 */
public class Task5 {
    public static void main(String[] args) {
        int n = 6;
        int[][] array = new int[n][n];
        int k = array.length -1;
        int m = 1;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(j== k){
                    array[i][j] = m;
                    k--;
                }
                System.out.print(array[i][j] + " ");
            }
            m++;
            System.out.println();
        }

    }
}
