package homework_15;
/*Task 1
Посмотрите вокруг себя.
Напишите три класса, описывающие какие-то сущности вокруг Вас.

Не забудьте использовать абстракцию.

Например, опишите студента, преподавателя и, допустим, врача.

Вы можете выбрать свои сущности для описания.
*/

public class Technic {
    String name;
    double  size;
    double weight;

    public Technic(String name, double size, double weight){
        this.name = name;
        this.size = size;
        this.weight = weight;
    }


    public void turnedOn(){
        System.out.println("Я включился!");
    }
    public void show(){
        System.out.println("Я показываю!");
    }

    public void turnedOff(){
        System.out.println("Я выключился!");
    }
}
