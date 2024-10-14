package homework_22.task_00;

public class CastingExample {
    public static void main(String[] args) {

        Animal animal = new Cat();

        animal.voice();
        Dog dog = new Dog();
        Animal animal2 = new Dog();
        Animal animal3 = new Hamster();

        Animal[] animals = new Animal[3];
        animals[0] = animal;
        animals[1] = animal2;
        animals[2] = animal3;

        for (int i = 0; i < animals.length; i++) {
            animals[i].voice();

        }

        Cat catLink;
        Animal animalLink = new Cat();

        catLink = (Cat) animalLink;
        catLink.eat();


        System.out.println("\n==================");

        for (int i = 0; i < animals.length; i++) {
            System.out.println("sout" + animals[i]);

            System.out.println(animals[i].getClass() + "instanceof Cat: " + (animals[i] instanceof Cat));


            Animal current = animals[i];

            if (animals[i] instanceof Cat) {
                System.out.println(i + "-й индекс может быть безопасным к Cat");
                Cat tempCat = (Cat) current;
                tempCat.eat();
            }

            System.out.println("==================\n");

        }


    }
}
