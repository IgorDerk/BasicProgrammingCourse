package additionally_04;

/*
Task 3 * (Опционально)
Потеря данных при преобразовании
Напишите программу, которая:

Объявляет переменную long с именем bigNumber и присваивает ей значение 15000000000 (15 миллиардов).
Преобразует bigNumber в int с помощью явного преобразования и сохраняет результат в переменную int с именем smallNumber.
Выводит значение smallNumber на экран.
Обратите внимание на полученный результат и подумайте, почему он отличается от ожидаемого.
 */
public class Task_03 {
    public static void main(String[] args) {
        long bigNumber = 15_000_000_000L;
        int smallNumber = (int) bigNumber;
        System.out.println(smallNumber);



    }
}
