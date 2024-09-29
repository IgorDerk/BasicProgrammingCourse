package lesson_08;

import java.util.Random;

public class ArraysExample {
    public static void main(String[] args) {
        int[] arrays;
        String[] strings;
        // int array1[]; // нерекомендуемый способ объявления массива

        arrays = new int[4]; // создали массив типа int с 4 ячейками
        strings = new String[10]; // создали массив строк на 10 ячейки
        int[] arrays2 = new int[8];// Объявление и инициализация на 8 ячеек
        boolean[] booleans = new boolean[3]; // false, false, false

        /*
        Значение по умолчанию.
        1. Для всех числоаых типов (в тоим числе тип char) это будет 0 (0.0)
        2. Для boolean - false
        3. Для всех ссылочных типов данных - null (null - ничто)
         */

        int value = arrays[0]; // Получить из массива значение, находящееся в ячейке с индексом 0
        System.out.println("value: " + value);
        System.out.println("arrays2[3]: " + arrays2[3]);
        System.out.println("strings[9]: " + strings[9])
        ;
        System.out.println("booleans[1]: " + booleans[1]);

        // Распечатать так все массивы не получится
        System.out.println("arrays: " + arrays); // ссылка на адрес в ячейке памяти в Heap (куче)


        // Явная инициализация
        int[] numbers = new int[]{45, 56, -16, 0, 159};
        int[] ints = {-10, 54, 32333, 444};

        int val = numbers[0];
        System.out.println("val: " + val);
        System.out.println("numbers[4]: " + numbers[4]);

        numbers[2] = 100; // присвоение нового значения

        System.out.println("Ввывести все значения массива");
        int j = 0;
        while (j < numbers.length) {
            System.out.print(numbers[j++] + "; ");
        }
        System.out.println();

        // Создать массив на 10 элементов со случайными числами от 0 до 100
        Random random = new Random();

        int[] nums = new int[10];
        int k = 0;
        System.out.print("[");
        while (k < nums.length) {
            nums[k] = random.nextInt(101);
            System.out.print(nums[k] + ", ");
            k++;
        }
        System.out.println("]");


        // Найти минимальное значение в массиве
        int min = nums[0];
        int i = 0;
        while (i < nums.length) {
            if (nums[i] < min) {
                min = nums[i];
            }
            i++;
        }
        System.out.println("Минимальное значение в массиве: " + min);
    }
}
