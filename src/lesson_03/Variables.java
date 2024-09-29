package lesson_03;

public class Variables {

    public static void main(String[] args) {

        int myFirstVariable; // Обьявление/ декларация
        myFirstVariable = 1; // Первое приисвоение значение переменной называется инициализация.

        int mySecondVariable = 25; // Обьявление и инициализация в одной строке.

        System.out.println(mySecondVariable);

        mySecondVariable = 50; // Присвоение нового значения

        System.out.println(mySecondVariable);

        System.out.println("Значение переменной: " + mySecondVariable);

        // byte, short, long

        byte byteVariable = 125; // Обьявление и инициализация переменной типа byte
        byteVariable = 45;
        System.out.println("Значение переменной: " + byteVariable);

        short shortVar;
        shortVar = 31000; // инициализация переменной (присвоение значения)
        System.out.println("Schort value: " + shortVar);

        // Любое число в коде воспринимается компилятором как число типа int
        long longVar = 20_000_000_148_000_000L; // знак _ не влияет на значение переменной. Используется для читабительности.
        // L в конце числа - явным образом указать, что число в формате long
        System.out.println("Long variable: " + longVar);

        double doubleVar = 10.5421;
        System.out.println("Double variable: " + doubleVar);

        float floatVar = 11.65f; //Нужно явно указать буквой f, что число в формате float
        System.out.println("Float variable: " + floatVar);

    }
}
