package homework_22.task_00;

public class Cat extends Animal {

    public void eat() {
        System.out.println("Cat eat");
    }

    @Override
    public void voice() {
        System.out.println("Cat say MEOW!!!");
    }

    @Override
    public String toString() {
        return "Cat toString";
    }

    public void voice (String str){
        System.out.println("Cat say" + str);
    }
}


