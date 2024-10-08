package lesson_18;

public class Car {
    public static int totalCarProduced;

    private String model;
    private int powerPS;

    public Car(String model, int powerPS) {
        this.model = model;
        this.powerPS = powerPS;
        totalCarProduced++; // Увеличиваем общее количество автомобилей при создании нового объекта (автомобиля)
    }

    public String toString() {
        // Нельзя создать статическую переменную внутри какого-то метода
        //   static String result = "Hello";
        return String.format("Auto - model: %s, power: %d. " +
                "Всего выпушено машин: %d", model, powerPS, totalCarProduced);
    }

    public static void testStatic() {
        // В статике нельзя использовать this - обращение к текущему объекту
        // this.model
        System.out.println("Hello from static method");
    }

    public int getPowerPS() {
        return powerPS;
    }

    public void setPowerPS(int powerPS) {
        this.powerPS = powerPS;
    }

    public void test(final int number) {
        // number++;
        int x = number + 10;
        x++;
    }

    public void test(final int[] numbers) {
        // numbers = new int[100];
        int[] newNambers = numbers;
        numbers[0] = 10000;
    }


}
