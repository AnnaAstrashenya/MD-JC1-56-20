package tasks02;

/*
    Дана последовательность чисел а1 ,а2 ,..., ап.
    Указать наименьшую длину числовой оси, содержащую все эти числа.
 */
public class Task5 {
    public static void main(String[] args) {
        double[] array;
        array = new double[]{11, -4, 7, 15, 6, 8, 9};
        double max = array[0];
        double min = array[0];
        double dl;

        printMas(array);

        for (int i = 0; i < array.length; i++) {

            if (min >= array[i]) {
                min = array[i];
            }

            if (max <= array[i]) {
                max = array[i];
            }
        }

        dl = Math.abs(min) + Math.abs(max);
        System.out.println("Минимальная длина отрезка = " + dl);
    }

    public static void printMas(double[] mas) {
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
        System.out.println();
    }
}
