package homework_20.task_02;

public class Bicycle extends Vehicle {
    private boolean hasBell;

    public Bicycle(String name, String brand, String model, boolean hasBell) {
        super(name, brand, model);
        this.hasBell = hasBell;
    }


    public String bicycleInfo() {
        return super.toString() + ", есть звонок: " + (hasBell ? "Да" : "Нет");
    }
}
