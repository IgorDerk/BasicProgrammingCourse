package homework_20.task_02;

public class Car extends Vehicle {
    private final int numDoors;

    public Car(String name, String brand, String model, int numDoors) {
        super(name, brand, model);
        this.numDoors = numDoors;
    }


    public String carInfo() {
        return super.toString() + ", двери: " + numDoors;
    }

}
