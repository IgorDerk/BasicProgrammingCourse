package homework_08;
/*
Task 1
Найдите произведение всех чисел от 1 до 15 включительно.

Результат выведите на экран
 */

public class Task_01 {
    public static void main(String[] args) {
        long product = 1;

        int i = 1;
        while (i <= 15){
            System.out.println("Произведение чисел " + i + " и " +  product +  " = " + (product*i));
            product *= i++;
            //i++;
        }
    }
}
