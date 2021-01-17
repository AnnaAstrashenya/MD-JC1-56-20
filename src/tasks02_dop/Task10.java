package tasks02_dop;

/*
    С помощью оператора while напишите программу вывода всех четных чисел в диапазоне
    от 2 до 100 включительно.
 */

public class Task10 {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            while (i % 2 == 0) {
                System.out.print(i + " ");
                i++;
            }
        }
    }
}
