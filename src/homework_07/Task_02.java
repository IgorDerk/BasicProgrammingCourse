package homework_07;

import java.util.Random;

/*
Task 2
Запишите в 4 переменные случайные числа от 0 до 100.
Выведите все 4 числа на экран.
Программа должна определить максимальное из этих четырех чисел и вывести результат на экран.
Output:
Максимальное число: 33
 */
public class Task_02 {
    public static void main(String[] args) {

        Random random = new Random();

        int number1 = random.nextInt(101);
        int number2 = random.nextInt(101);
        int number3 = random.nextInt(101);
        int number4 = random.nextInt(101);

        System.out.println(("Число 1: " + number1 + " | Число 2: " + number2 + " | Число 3: " + number3 + " | Число 4: " + number4));
        System.out.printf("Число 1: %d | Число 2: %d | Число 3: %d | Число 4: %d\n", number1, number2, number3, number4);
        int max = number1;
        if (number2 > max) max = number2;
        if (number3 > max) max = number3;
        if (number4 > max) max = number4;

        System.out.println("Максимальное число: " + max);

        if (number2 > max) {
            max = number2;
        }
        if (number3 > max) {
            max = number3;
        }
        if (number4 > max) {
            max = number4;
        }

        System.out.println("Максимальное число: " + max);

    }
}
