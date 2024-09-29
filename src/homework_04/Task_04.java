package homework_04;

/*
Task 4 * (Опционально)
Напишите программу на Java, которая преобразует ваше имя, записанное маленькими буквами, в верхний регистр.

Для каждой буквы имени создайте отдельную переменную типа char, инициализированную соответствующей буквой в нижнем регистре.

Затем преобразуйте каждую букву в верхний регистр, используя только арифметические операции (без использования библиотечных функций), и выведите результат.

Пример программы:

public class Main {
    public static void main(String[] args) {
        char ch1 = 'h';
        char ch2 = 'a';
        char ch3 = 'n';
        char ch4 = 'n';
        char ch5 = 'a';

        // Ваш код
    }
}
Copy
Output:

HANNA
Copy
Пояснение
Переменные ch1, ch2, ch3, ch4 и ch5 должны быть преобразованы из нижнего регистра в верхний с использованием только арифметических операций.
Вывод результата должен быть в виде строки с именем в верхнем регистре.
 */
public class Task_04 {
    public static void main(String[] args) {

        char ch1 = 'i';
        char ch2 = 'g';
        char ch3 = 'o';
        char ch4 = 'r';

        ch1 -= 32; // (char) (ch1 - 32);
        ch2 -= 32;
        ch3 -= 32;
        ch4 -= 32;


        System.out.println(ch1 + ch2 + ch3 + ch4);
        System.out.println("" + ch1 + ch2 + ch3 + ch4);
        System.out.println("My name is " + ch1 + ch2 + ch3 + ch4);
        System.out.printf("My name is %s%s%s%s %n", ch1, ch2, ch3, ch4);


    }
}
