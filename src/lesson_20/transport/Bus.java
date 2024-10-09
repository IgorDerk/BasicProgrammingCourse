package lesson_20.transport;

public class Bus extends Vehicle{

    private int capacity;
    private int countPassengers;

    public Bus(String model, int year, int capacity) {
        super(model, year);
        this.capacity = capacity;
    }

    public boolean takePassenger(){
       if (countPassengers < capacity){
           countPassengers++;
           System.out.println("Пассажир зашел в автобус " + this.getModel());
           return true;
       }
        System.out.printf("В автобусе %s больше нет мест. Сейчас %d пасажиров\n", this.getModel(),countPassengers);
       return false;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCountPassengers() {
        return countPassengers;
    }
}
