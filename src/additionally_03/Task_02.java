package additionally_03;

/*
Task 2
Объявите 4 переменных типа int со значениями 0, 1, 2, 3.
Объявите ещё одну переменную int и сохраните в неё сумму этих переменных, деленную на 4. Получается, у вас будет среднее арифметическое этих чисел в одной переменной.
Выведите на экран значение переменной.
Сколько программа отбросила в дробной части?
 */
public class Task_02 {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c = 2;
        int d = 3;
        int arithmeticExpression = (a + b + c + d) / 4;
        int rest = (a + b + c + d) % 4;
        System.out.println(arithmeticExpression);
        System.out.println(rest);
    }
}
