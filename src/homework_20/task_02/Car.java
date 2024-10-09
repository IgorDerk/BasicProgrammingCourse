package homework_20.task_02;

public class Car extends Vehicle{
private int numDoors;
    public Car(String name, String brand, String model, int numDoors) {
        super(name, brand, model);
        this.numDoors = numDoors;
    }

    public int getNumDoors() {
        return numDoors;
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }

    public  String carInfo(){
        return super.toString() + ", двери: " + numDoors;
    }

}
