package homework_04;

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
        System.out.println("smallNumber: " + smallNumber);

        /*
         Такой результат, потому что тип int 32 битное число, а тип long 64 битное,
         при преобразовании типа long в int, старшие 32 бита отбрасываются,
          а остаются младшие 32, из-за чего происходит искажение результата.

         */

        byte b1 = 127;
        b1 ++;
        System.out.println("b1 +1: " + b1);
b1 --;
        System.out.println("b1 -1: " + b1);

        b1 =(byte) (b1 +5);
        System.out.println("b1 +5: " + b1);


    }
}
