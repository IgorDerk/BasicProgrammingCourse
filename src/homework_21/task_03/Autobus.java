package homework_21.task_03;
/*
Task 3 * (Опционально)
Переписать метод public String toString()в классе Autobus, используя StringBuilder для формирования строки.

 */

import homework_21.task_01.Autopilot;
import homework_21.task_01.BusDriver;
import homework_21.task_01.Passenger;

public class Autobus {


    private static int counter = 1;

    private final int id;

    private BusDriver driver;
    private Autopilot autopilot;

    private final int capacity;
    private int countPassenger;

    private final Passenger[] passengers;

    public Autobus(BusDriver busDriver, int capacity) {
        this.id = counter++;
        this.capacity = capacity;
        this.driver = busDriver;
        this.autopilot = new Autopilot("AP-v001");
        this.autopilot.setAutobus(this);
        this.passengers = new Passenger[capacity];
    }

    public void showListOfPassengers() {
        if (countPassenger == 0) {
            System.out.println("[]");
            return;
        }
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < countPassenger; i++) {
            sb.append(passengers[i].toString());
            sb.append((i < countPassenger - 1) ? ", " : "]");
        }
        System.out.println(sb.toString());

    }

    public boolean takePassenger(Passenger passenger) {
        if (passenger == null) return false;

        if (countPassenger < capacity) {
            if(isPassengerInBus(passenger)){
                System.out.printf("Пассажир id %d уже автобусе с id %d\n", passenger.getId(),this.id);
                return false;
            }
            passengers[countPassenger] = passenger;
            countPassenger++;
            System.out.printf("Пассажир id %d завершил посадку в автобус с id %d\n", passenger.getId(),this.id);
            return true;

        }
        System.out.printf("В автобусе id %d свободных мест нет!\n", this.id);
        return false;
    }

    private boolean isPassengerInBus(Passenger passenger) {
        for (int i = 0; i < countPassenger; i++) {
            if (passengers[i].getId() == passenger.getId()){
                return true;
            }
        }
        return false;
    }

    public void updateAutopilotVersion(String softwareVersion) {
        this.autopilot.setSoftwareVersion(softwareVersion);
    }

    public void intstallNewAutopilot(String softwareVersion) {
        this.autopilot.setAutobus((homework_21.task_01.Autobus) null);
        this.autopilot = new Autopilot(softwareVersion);
        this.autopilot.setAutobus(this);
    }

    public void setDriver(BusDriver driver) {
        this.driver = driver;
    }

    public int getId() {
        return id;
    }

    public BusDriver getDriver() {
        return driver;
    }

    public Autopilot getAutopilot() {
        return autopilot;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCountPassenger() {
        return countPassenger;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Autobus: {");
        sb.append("id: ").append(id);
        sb.append(", capacity: ").append(capacity);
        sb.append("; driver: ").append(driver);
        sb.append("}");

        return sb.toString();


    }
}
