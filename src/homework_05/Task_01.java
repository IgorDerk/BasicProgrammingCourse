package homework_05;

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
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите Ваше имя:");
        String name = scanner.nextLine();
        String result = name.trim();
        System.out.println(result.length());

        char firstChar = result.charAt(0);
        char lastChar = result.charAt(result.length() - 1);
        System.out.println("firstChar: " + firstChar + " : " + (int) firstChar);
        System.out.println("lastChar: " + lastChar + " : " + (int) lastChar);
        System.out.println("firstChar: " + firstChar);
        System.out.println("lastChar: " + lastChar);

        System.out.println("first number of the name: " + (int) firstChar);
        System.out.println("last number of the name: " + (int) lastChar);


    }
}
