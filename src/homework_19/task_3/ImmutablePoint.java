package homework_19.task_3;
/*
Task 3
Неизменяемый объект
Создайте класс ImmutablePoint:

•	Объявите final поля x и y типа int.
•	Инициализируйте их через конструктор.
•	Попытайтесь создать методы-сеттеры для изменения значений x и y.
•	Объясните, почему значения полей не могут быть изменены после создания объекта.
 */
public class ImmutablePoint {
    public  final int x;
    public  final int y;

    public ImmutablePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

}
