package homework_07;

import java.util.Scanner;

/*
Task 3 (Повышенной сложности, опционально)
Программа предлагает пользователю ввести четырехзначное число.
Ввод осуществляется только в формате строки (String).
Если введенное значение не является четырехзначным числом, должно выводиться сообщение об ошибке, и программа завершает работу.
Проверить, является ли число "счастливым билетом". Для этого нужно сравнить сумму первых двух цифр с суммой последних двух цифр.
Примеры:

Число 1450 -> (1+4) = 5; (5+0) = 5; 5 равно 5 - число счастливое.
Число 1654 -> (1+6) = 7; (5+4) = 9; 7 не равно 9 - число НЕ является счастливым.
 */
public class Task_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите четырехзначное число");
        String input = scanner.nextLine();

        // "length != 4 " проверяет, что длина строки состоит из 4х символов
        // "!input.matches("\\d+")" проверяет, что строка содержит цифру больше одной

      /*  if (input.length() != 4 || !input.matches("\\d+")) {
            return; // Оператор return при ошибке завершает выполнение метода main
        } */

        if (input.length() != 4) {
            System.out.println("Вы ввели не четырехзначное число");
        } else {
            System.out.println((int) input.charAt(0));

            int code1 = input.charAt(0) - 48;
            System.out.println(code1);

            if (input.charAt(0) + input.charAt(1) == input.charAt(2) + input.charAt(3)) {
                System.out.println("Число счастливое ");

            } else {
                System.out.println("Не счастливый");
            }

            if(input.charAt(0) < 48 || input.charAt(0) > 57){
                System.out.println("Все пропало");
                System.exit(0);
            }

            if(input.charAt(1) < 48 || input.charAt(1) > 57){
                System.out.println("Все пропало");
                System.exit(0);
            }

            if(input.charAt(2) < 48 || input.charAt(2) > 57){
                System.out.println("Все пропало");
                System.exit(0);
            }

            if(input.charAt(3) < 48 || input.charAt(3) > 57){
                System.out.println("Все пропало");
                System.exit(0);
            }

            // Option2
            if (input.length() == 4){
                int inputDigit = Integer.parseInt(input);
                System.out.println("inputDigit: " + inputDigit);

                int digit0 = inputDigit % 10;
                inputDigit = inputDigit /10;

                int digit1 = inputDigit % 10;
                inputDigit = inputDigit / 10;

                int digit2 = inputDigit % 10;
                int digit3 = inputDigit / 10;

                System.out.printf("Числа %d, %d, %d, %d", digit0, digit1,digit2,digit3);

                if (digit0 + digit1 == digit2 + digit3){
                    System.out.println(" Вариант 2. Число счастлиаое");
                } else {
                    System.out.println( " Не счастливое");
                }

            } else {
                System.out.println("Длина строки не 4 символа");
            }


            // Счастливый билет
            int firstDigit = Character.getNumericValue(input.charAt(0)); // Character.getNumericValue извлекает цифры из строки
            int secondDigit = Character.getNumericValue(input.charAt(1));
            int thirdDigit = Character.getNumericValue(input.charAt(2));
            int fourthDigit = Character.getNumericValue(input.charAt(3));

            int firstSum = firstDigit + secondDigit;
            int secondSum = thirdDigit + fourthDigit;

            if (firstSum == secondSum) {
                System.out.println("Число счастливое ");
            } else {
                System.out.println("Число не счастливое ");
            }

        }
    }}
