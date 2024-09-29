package homework_08;

import java.util.Random;

/*
Task 6
Создать массив целых чисел произвольной длины от 5 до 15. Заполнить массив случайными значениями от -50 до 50.

Вывести на экран:

Минимальное значение в массиве
Максимальное значение в массиве
Среднее арифметическое всех значений в массиве
 */
public class Task_06 {
    public static void main(String[] args) {
        Random rand = new Random();

        // Создать массив целых чисел произвольной длины от 5 до 15.
        int length = rand.nextInt(11) + 5;
       // int length = 5 + rand.nextInt(11); //[5...15]
        int[] number = new int[length];
        System.out.println("Длина массива: " + number.length);

        // Заполнить массив случайными значениями от -50 до 50.
        int i = 0;
        //int arrayLength = array.length; // Получить длину массива (кол. элементов массива)
        while (i < length) { // i != length
            number[i] = rand.nextInt(101) - 50;
            i++;
        }

        // Вывести на экран:

        System.out.println("Массивы: ");
        i = 0;
        System.out.print("[");
        while (i < length) {
           // System.out.print(number[i] + ((i < length -1) ? ", " : "]\n")); // тернарный
            System.out.print(number[i] );
            if (i < length -1){
                System.out.print(", ");
            }else {
                System.out.println("]");
            }
            i++;
        }
        System.out.println();

        // Минимальное значение в массиве
        int min = number[0];
        i = 0;
        while (i < number.length) {
            if (number[i] < min) {
                min = number[i];

            }
            i++;
        }
        System.out.println("Минимальное значение в массиве: " + min);

        // Максимальное значение в массиве
        int max = number[0];
        int j = 0;
        while (j < number.length){
            if(number[j] > max){
                max = number[j];
            }
            j++;
        }

        System.out.println("Максимальное значение в массиве: " + max);

        // Среднее арифметическое всех значений в массиве
        int sum = 0;
        int y = 0;
        while (y < number.length){
            sum += number[y];
            y++;
        }
        System.out.println("Сумма всех значений в массиве: " + sum);
        double average = (double) sum / number.length;
        System.out.println("Среднее арифметическое всех значений в массиве: " + average);


        // Вариант решения от преподавателя
        i = 0;
        while (i < length){
            sum += number[i];
            if (number[i] < min) min = number[i];
            if (number[i] > max) max = number[i];

            i++;
        }
        System.out.println("min: " + min);
        System.out.println("max: " + max);
        System.out.println("avarage: " + sum / (double) length);
    }
}
