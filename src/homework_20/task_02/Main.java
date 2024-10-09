package homework_20.task_02;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Машина", "Toyota ", "Corolla", 5);
        System.out.println(car.carInfo());

        Bicycle bicycle = new Bicycle("Велосипед", "Cube ", "Stereo ONE44", false);
        System.out.println(bicycle.bicycleInfo());
    }
}
