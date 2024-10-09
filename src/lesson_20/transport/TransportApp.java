package lesson_20.transport;

public class TransportApp {
    public static void main(String[] args) {
        Bus bus = new Bus("Bus X1", 2020, 10);
        System.out.println(bus.toString());

        bus.start();
        bus.stop();

        System.out.println("bus.getModel(): " + bus.getModel());
        System.out.println("bus.getCapacity(): " + bus.getCapacity());


    }
}
