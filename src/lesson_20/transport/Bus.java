package lesson_20.transport;

public class Bus extends Vehicle{

    private int capacity;
    private int countPassengers;

    public Bus(String model, int year, int capacity) {
        super(model, year);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCountPassengers() {
        return countPassengers;
    }
}
