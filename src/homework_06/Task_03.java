package homework_06;

import java.util.Scanner;

/*
Task 3
Попросите пользователя ввести целое число с клавиатуры.
Ваша программа должна вывести строку в формате:
Число: 6 четное: true; кратно 3: true; четное и кратное 3: true
Число: 3 четное: false; кратно 3: true; четное и кратное 3: false
Copy
Проверьте работу вашей программы, вводя разные числа. Убедитесь в правильности выдаваемой строки.
 */
public class Task_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое число!");
        int input = sc.nextInt();
        sc.nextLine();

        boolean evenBy6 = input % 2 == 0;
        boolean multipleOf3 = input % 3 == 0;
        boolean evenMultipleOf3 = evenBy6 && multipleOf3;

        System.out.printf("Число: %d четное: %b; кратно 3: %b; четное и кратное 3: %b %n ", input, evenBy6, multipleOf3, evenMultipleOf3);
        System.out.printf("Число: %d четное: %s; кратно 3: %s; четное и кратное 3: %s \n ", input, evenBy6, multipleOf3, evenMultipleOf3);
        System.out.println("Число: " + input + " четное: " +
                evenBy6 + " ; кратно 3: " + multipleOf3 + " ; \nчетное и кратное 3: " + evenMultipleOf3);

        System.out.println();
        System.out.print("1");
        System.out.print("2");
        System.out.print("3");

    }
}
