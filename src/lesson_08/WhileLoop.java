package lesson_08;

public class WhileLoop {
    public static void main(String[] args) {
        /*
        while (условие) {
        Тело цикла
        Код, который будет повторяться
        }
         */
        // Вывести от 1 до 5

        int number = 1;
        while (number <= 5) { // условие (предикат) цикла
            System.out.println(number);// Действие: вывод числа
            number++; // number = number + 1;

        }
        System.out.println("Цикл закончен. Выполняем продолжение программы.");

        // Бесконечный цикл
     /*   int y = 5;
        while (y < 10){
            System.out.println(y);

        }*/

        // Бесконечный цикл
       /* while (true){
            System.out.println("Hello World");

        } */

        // Распечатать от 100 до 90 на уменьшение
        int i = 100;
        while (i >= 90) {
            System.out.println(i--);
            //    i--; i = i -1
        }

        // Найти сумму чисел от 1 до 100
        /*
        1. Перебрать числа от 1 до 100
        2. Каждое число добавить в какую-то переменную, накапливающую сумму чисел
         */
        i = 1;
        int sum = 0;
        while (i <= 100) {
            sum += i; // Добавить текущее значение i к сумме
            i++;
        }
        System.out.println("Сумма чисел от 1 до 100: " + sum);


        // Четные от 0 до 20
        i = 0;
        while (i <= 21) {
            if (i % 2 == 0) {
                System.out.println(i);
                // i += 2;
            }
            i++;
        }
        System.out.println();

        // Распечатать каждый символ строки в отдельной строчке
        String str = "Hello";
        i = 0;
        while (i <= str.length() - 1) {
            char ch = str.charAt(i);
            System.out.println(ch);
            i++;
        }
        System.out.println();

        i = 0;
        while (i < str.length()) {
            System.out.println(str.charAt(i++));
        }


    }
}
