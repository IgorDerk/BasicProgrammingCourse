package lesson_06;

import java.util.Random;

public class BooleanExample {
    public static void main(String[] args) {
        boolean bol1 = true;
        bol1 = false;

        int x = 10;
        int y = 5;

        // Сравнение на равенство
        boolean b1 = x == y; // X равен Y -> 10 равно 5 -> false
        System.out.println(x + " == " + y + " -> " + b1);

        // Не равенство
        // X не равен  Y
        b1 = x != y; // 10 не равно 5 -> true
        System.out.println(x + " != " + y + " -> " + b1);

        // болше ">"
        // X больше чем Y
        b1 = x > y; // 10 > 5 -> true
        System.out.println(x + " > " + y + " -> " + b1);

        y = 10;
        b1 = x > y; // 10 больше 10 -> false
        System.out.println(x + " > " + y + " -> " + b1);

        // Больше или равно ">="
        b1 = y >= y; // 10 больше или равно 10 -> true
        System.out.println(x + " >= " + y + " -> " + b1);

        // Меньше "<"
        x = 7;
        b1 = x < y; // 7 меньше чем 10 -> кгу
        System.out.println(x + " < " + y + " -> " + b1);

        // Меньше или равно "<="
        b1 = x <= y; // 7 меньше или равно 10 -> true
        System.out.println(x + " <= " + y + " -> " + b1);

        b1 = true != false; // смысл: (2 == 2) != (2 != 3)
        System.out.println(b1);

        String str = "Java is the best";
        boolean contains = str.contains("Java"); // Строка str содержит в себе подстроку "Java"
        System.out.println("str.contains(\"Java\"): " + contains);

        System.out.println("============ \n");

        //Логическое Не

        boolean b2;
        b2 = !false; // получим true
        System.out.println("!false: " + b2);

        b2 = !(4 == 5);
        System.out.println("!(4 == 5): " + b2);

        // Логическое и "&"
        // Чтобы оба условия былм истинными
        // Рим столица Италии и Берлин столица Голандии
        // Если хотябы в одной части будет false ->  в результате мы получим false
        b2 = true & true;
        System.out.println("true & true: " + b2);
        b2 = (2 < 5) & (11 == 10); // true & false -> false
        System.out.println("(2 < 5) & (11 == 10): " + b2);

        // Введите число от 0 до 100
        int x1 = 50;
        boolean b3 = x1 > 0 & x1 < 100;
        System.out.println("b3: " + b3);

        // Логическое или "|"
        // Когда хотябы одно условие истинно
        boolean b4 = true | false;
        System.out.println("true | false -> " + b4);
        System.out.println("false | false -> " + (false | false));

        // Введите или четное число или число, которое делится на 5 без остатка
        // Четное число -  число, которое делится на 2 без остатка

        // Генерация случайного числа
        Random random = new Random();
        // В диапазоне от 0 до X
        int rand = random.nextInt(100); // (0...x-1) -> (0...99) включительно
        System.out.println("rand: " + rand);
        boolean isEven = rand % 2 == 0;
        boolean isGoodNumber = (rand % 2 == 0) | (rand % 5 == 0);
        System.out.println("isEven: " + isEven);
        System.out.println("isGoodNumber: " + isGoodNumber);

        // Логичиское исключающее ИЛИ (XOR) "^"
        // Возвращает true если две части разные
        // Если оба операнда одинаковы (оба true или оба false), результат будет false.
        boolean b5 = true ^ false;
        System.out.println("true ^ false: " + b5);
        b5 = false ^ true;
        System.out.println("false ^ true: " + b5);
        b5 = true ^ true;
        System.out.println("true ^ true: " + b5); // Oба операнда одинаковы (оба true), результат будет false
        b5 = false ^ false;
        System.out.println("false ^ false: " + b5); // оба операнда одинаковы (оба false), результат будет false

        System.out.println("============== \n");

        // Логическое И &&
        // Выдает true только если обе части выражения равны true
        boolean b6 = true && false;
        System.out.println("true && false: " + b6);
        b6 = true && true;
        System.out.println("true && true: " + b6);
        b6 = (2 > 5) && (11 == 11);
        System.out.println("(2 > 5) && (11 == 11): " + b6);

        int a = 10;
        int b = 0;

        boolean b7 = (b != 0) && (a / b > 2);
        System.out.println("(b != 0) && (a / b > 2): " + b7); // Правая часть не считается, т.к. в левой false

      /*  boolean b8 = (a / b > 2) && (b != 0);
        System.out.println("(a / b > 2 ) && (b != 0): " + b8);

       */

        // Логическое ИЛИ "||"
        // Выдает true если хотябы бы одна часть выражения равна true
        boolean b9 = true || (a / b > 2);
        System.out.println("b8: " + b9);

        System.out.println("====== приоритет логческих операций ===== \n");

        System.out.println(true ^ true & false); // у & приоритет выше
        // 1. true & false
        System.out.println(true ^ false);
        // 2. true ^ false
        System.out.println(true);

        System.out.println();

        System.out.println(true ^ true && false);
        // 1. true ^ true
        System.out.println( false && false);
        // 2. false && false
        System.out.println(false);

        System.out.println(" ========= \n");

        System.out.println(true | false | (25>100) & !true ^ (26==5));

        // | & ^ | && || - приоритетность

    }
}
