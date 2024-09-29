package homework_07;

import java.util.Scanner;

/*
Task 1
Необходимо написать программу, которая предлагает пользователю ввести число на выбор: 1, 2 или 3.

Программа должна сказать, какое число ввёл пользователь: Один, Два, или Три (текстом)
 */
public class Task_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число на выбор: 1, 2 или 3");
        int input = scanner.nextInt();
        scanner.nextLine();

        String number1 = "один";
        String number2 = "два";
        String number3 = "три";

        if (input == 1) {
            System.out.println("Вы ввели число: " + number1);
        } else if (input == 2) {
            System.out.println("Вы ввели число: " + number2);
        } else if (input == 3)
            System.out.println("Вы ввели число: " + number3);
        else {
            System.out.println("Я таких чисел не знаю");

        }

        switch (input) {
            case 1:
                System.out.println("Вы ввели число: " + number1);
                break;
            case 2:
                System.out.println("Вы ввели число: " + number2);
                break;
            case 3:
                System.out.println("Вы ввели число: " + number3);
            default:
                System.out.println("Я таких чисел не знаю");

        }


    }
}
