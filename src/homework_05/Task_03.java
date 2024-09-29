package homework_05;

import java.util.Scanner;

/*
Task 3* (Опционально)
Попросите пользователя ввести строку чётной длины с клавиатуры.
Распечатайте два средних символа строки.
Например:

Для строки "string" результат будет "ri".
Для строки "code" результат будет "od".
Для строки "Practice" результат будет "ct".
 */
public class Task_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку чётной длины:");
        String string = scanner.nextLine();
        int middleChar1 = string.length() / 2 - 1;
        int middleChar2 = string.length() / 2;
        char first = string.charAt(middleChar1);
        char second = string.charAt(middleChar2);
        String middleString = String.valueOf(string.charAt(middleChar1)) + string.charAt(middleChar2);
        System.out.println("first: " + first);
        System.out.println("second: " + second);
        System.out.println("middleString: " + middleString);

        String subStr = string.substring(middleChar1, middleChar1 + 2);
        System.out.println("subStr: " + subStr);


    }
}
