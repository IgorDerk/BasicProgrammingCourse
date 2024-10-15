package homework_24.task_01;

public class Triathlete implements Swimmer, Runner{
    @Override
    public void run() {
        System.out.println("I'm running");
    }

    @Override
    public void swim() {
        System.out.println("I'm swimming");

    }
}
