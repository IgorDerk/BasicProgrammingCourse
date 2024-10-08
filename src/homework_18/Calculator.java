package homework_18;

/*
Task 1
Класс "Калькулятор"
Создайте класс Calculator, который будет предоставлять

 - базовые арифметические операции: сложение, вычитание, умножение и деление
Класс должен содержать:

 - Статические методы для каждой математической операции, принимающие два аргумента и возвращающие результат операции.
 */
public class Calculator {


    public static int addition(int a, int b) {

        return a + b;
    }


    public static int subtraction(int a, int b) {
        return a - b;
    }

    public static int multiplication(int a, int b) {
        return a * b;
    }

    public static int division(int a, int b) {
        if (b == 0) {
            System.out.println("Ошибка: деление на ноль недопустимо!!!");
            return Integer.MIN_VALUE;
        }
        return a / b;
    }


    public static double division(double a, double b) {
        return a / b;
    }

}


