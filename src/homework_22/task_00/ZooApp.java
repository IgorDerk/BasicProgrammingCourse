package homework_22.task_00;
/*
Task 0
Воспроизвести код, написанный на уроке.
 */
public class ZooApp {
    public static void main(String[] args) {
        Cat cat = new Cat();

        cat.voice();
        System.out.println(cat.toString());
        cat.eat();

        System.out.println("\n===============");

        Dog dog = new Dog();
        dog.voice();
        System.out.println(dog.toString());

        System.out.println("\n===============");

        Hamster hamster = new Hamster();
        System.out.println(hamster.toString());
        hamster.voice();

        System.out.println("\n =========");
        Test test = new Test();

        System.out.println(test.toString());

        System.out.println(hamster);

    }
}
