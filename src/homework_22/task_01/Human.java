package homework_22.task_01;

/*
Task 1
Напишите иерархию классов человек -> спортсмен-любитель -> спортсмен-профи

У человека есть метод бежать (run()). Обычный человек бежит со скоростью 10 км, любитель 15, профи - 25;

Также у наших спортсменов есть необходимость в отдыхе. Человек нужен отдых после пробежки 15 минут, любитель 10, профи 5

В методе бежать - вызвать метод, который будет выводить количество минут, необходимых для отдыха спортсменам
 */
public class Human {

    private  int runSpeed;
    private  int restTime;

    private String typeRunner = "Human";

    public Human() {
        this(10, 15);
    }

    public Human(int speedRunner, int restTime) {
        this.runSpeed = speedRunner;
        this.restTime = restTime;
    }

    public void run() {
        System.out.printf("%s  бежит со скоростью  %d км/ч\n", typeRunner, runSpeed);
        rest();
    }

    public void rest() {

        System.out.printf("%s нужно для отдыха %d минут\n", typeRunner, restTime);

    }

    public int getRunSpeed() {
        return runSpeed;
    }

    public void setRunSpeed(int speedRunner) {
        this.runSpeed = speedRunner;
    }

    public int getRestTime() {
        return restTime;
    }

    public void setRestTime(int restTime) {
        this.restTime = restTime;
    }

    public String getTypeRunner() {
        return typeRunner;
    }

    public void setTypeRunner(String typeRunner) {
        this.typeRunner = typeRunner;
    }
}
