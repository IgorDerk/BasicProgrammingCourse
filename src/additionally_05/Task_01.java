package additionally_05;

import java.util.Scanner;

/*
Task 1
Напишите программу, которая будет просить у пользователя ввести его имя с клавиатуры.
Используя Scanner, сохраните имя в переменную типа String.
Выведите на экран количество символов в имени пользователя.
Создайте две переменные типа char: одна должна хранить первый символ имени, другая — последний.
Выведите на экран десятичный код (код символа в десятичной системе счисления) первого и последнего символа имени.
 */
public class Task_01 {

    public static void main(String[] args) {
        System.out.println("Введите имя ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Kоличество символов в имени " + name.length());

        // Создайте две переменные типа char: одна должна хранить первый символ имени, другая — последний.
        char firstChar = name.charAt(0);
        char lastChar = name.charAt(name.length() - 1);


        System.out.println(firstChar + " | " + (int) firstChar);
        System.out.println(lastChar + " | " + (int) lastChar);


    }
}
