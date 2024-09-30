package homework_14;

/*
Task 2
Сумма четных чисел
Напишите метод, который вычисляет сумму всех четных чисел в массиве.
 */
public class Task_02 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int sum = sumEvenNumbers(array);

        System.out.println("Сумма четных чисел: " + sum);
    }

    public static int sumEvenNumbers(int[] array) {
        if (array == null || array.length == 0) {
            return Integer.MIN_VALUE; // Хорошего решения на этой стадии нет. Компромиссный вариант
        }
        
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            int num = array[i];
            if (num % 2 == 0) {
                sum += num;
            }
        }
        
        return sum;


    }
}
