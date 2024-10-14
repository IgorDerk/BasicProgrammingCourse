package lesson_23;



public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    void eat() {
        System.out.println("Кот " + name + " очень любит кушать!!!");
    }

    @Override
    void move() {
        System.out.println("Кот передвигается");
    }
}