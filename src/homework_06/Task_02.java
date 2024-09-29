package homework_06;

import java.util.Random;

/*
Task 2
Создайте две переменные типа int.

В первую переменную запишите случайное значение от 0 до 50.
Во вторую переменную случайное значение от 0 до 100.
(опционально) Во вторую переменную случайное значение от -20 до 30.
Проверьте:

равны ли переменные,

не равны ли они,

больше ли a, чем b,

и меньше ли b, чем a.

Выведите результат на экран.
 */
public class Task_02 {
    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt(51);
        int b = random.nextInt(101); // Cлучайное значение от 0 до 100
        b = random.nextInt(51) -20;

        int c = random.nextInt(100) + 1; // от 1 до 100
        System.out.println("Cлучайное значение a от 0 до 50 -> " + a);
        System.out.println("Cлучайное значение b от -20 до 30 -> " + b);
        System.out.println("Cлучайное значение с от 1 до 100 -> " + c);
        System.out.println();

        // Проверить
        System.out.println("===Сheck===");
        //равны ли переменные
        boolean check1 = a == b;
        System.out.println("a == b -> " + check1);

        // не равны ли они
        boolean check2 = a !=b;
        System.out.println("a !=b -> " + check2);

        // больше ли a, чем b
        boolean check3 = a > b;
        System.out.println("a > b -> " + check3);

        // меньше ли b, чем a
        boolean check4 = b < a;
        System.out.println("b < a -> " + check4);




    }
}
