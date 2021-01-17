package tasks02_dop;
/*
    Вывести на экран соответствий между символами и их численными обозначениями в
    памяти компьютера (Таблицу ASCII).
 */

public class Task12 {
    public static void main(String[] args) {
        for (int i = 32; i < 257; i++) {
            System.out.println("Символ " + (char) i + " " + "Значение ASCII " + i);
        }

    }
}
