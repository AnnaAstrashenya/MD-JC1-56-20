package tasks01;
/*
Создать программу ввода целых чисел как аргументов командной строки, подсчета
их суммы и вывода результата на консоль.
 */

public class Task12 {
    public static void main(String[] args) {
        // Здесь должен быть код

        int s = 0;
        for (int i = 0; i < args.length; i++) {
            int a = Integer.parseInt(args[i]);
            s = s + a;
        }
        System.out.println(s);

    }
}
