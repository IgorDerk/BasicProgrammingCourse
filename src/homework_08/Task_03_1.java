package homework_08;
/*
Task 3
Используйте цикл while для решения задачи:

Распечатайте все числа от 1 до 100, которые делятся на 5 без остатка.

Task 3.1 * (Опционально)
Распечатайте только первые 7 чисел от 1 до 100, которые делятся на 5 без остатка.
 */

public class Task_03_1 {
    public static void main(String[] args) {
        int i = 1;
        int count = 0;

        while (i <= 100 && count < 7) {

            if (i % 5 == 0) {
                System.out.print(i + ", ");
                count++;
                i += 5;
            } else {
                i++;
            }

        }
    }
}
