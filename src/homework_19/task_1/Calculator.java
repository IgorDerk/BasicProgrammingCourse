package homework_19.task_1;

/*
Task 1
Дополните Класс "Калькулятор" из предыдущего домашнего задания
Класс Calculator, который будет предоставлять

- базовые арифметические операции: сложение, вычитание, умножение и деление (сделано в прошлом ДЗ)
- Вычисление длины окружности и площади круга по ее радиусу

Класс должен содержать:

- Статические методы для каждой математической операции, принимающие два аргумента и возвращающие результат операции ((сделано в прошлом ДЗ))
- Методы для вычисления длины окружности и площади круга, принимающий радиус и возвращающий результат.
- Константу (число Пи)
 */
public class Calculator {

    public static final double PI = 3.141519;


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


    public static double circleLength(double radius) {
        if (radius < 0) {
            System.out.println("Ошибка: радиус не может быть отрицательным!!!");
            return Integer.MIN_VALUE;

        }
        return 2 * PI * radius;
    }

    public static double areaCircle(double radius) {
        if (radius < 0) {
            System.out.println("Ошибка: радиус не может быть отрицательным!!!");
            return Integer.MIN_VALUE;

        }
        return PI * (radius * radius);
    }

}
