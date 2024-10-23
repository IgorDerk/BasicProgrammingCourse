package additionally_05;

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
        System.out.println("Введите строку чётной длины");
        String strUser = scanner.nextLine();
        int indexMiddle = strUser.length() / 2 - 1;

        char firstLetter = strUser.charAt(indexMiddle);
        char secondLetter = strUser.charAt(indexMiddle + 1);
        System.out.println("" + firstLetter + secondLetter);

        String subStr = strUser.substring(indexMiddle, indexMiddle + 2);
        System.out.println(subStr);
    }

}
