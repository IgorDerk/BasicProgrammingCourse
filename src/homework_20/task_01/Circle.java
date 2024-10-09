package homework_20.task_01;

public class Circle extends Shape {
    private double radius;
    public static final double PI = 3.141519;

    public Circle(String name) {
        super(name);
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        if (radius < 0) {
            System.out.println("Ошибка: радиус не может быть отрицательным!!!");
            return Integer.MIN_VALUE;
        }
        return PI * radius * radius;
    }
}
