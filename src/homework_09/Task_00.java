package homework_09;
/*
    Task 0
Написать метод, принимающий на вход строку. Метод должен вывести на экран число, соответсвующее количеству символов в строке.

Например: Если в метод пришла строка "hello" - метод должен вывести число 5 (так как в строке hello 5 символов)

i

 */
public class Task_00 {
    public static void main(String[] args) {

        myString("Hello");

    }

    public  static void myString(String str){


        System.out.println("В строке " + str.length() + " символов.");
    }
}
