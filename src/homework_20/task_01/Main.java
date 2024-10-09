package homework_20.task_01;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle("Прямоугольник");
        rectangle.displayInfo();
        rectangle.setDimensions(6, 4);
        System.out.println("Площадь прямоугольника: " + rectangle.calculateArea());

        Circle circle = new Circle("Круг");
        circle.displayInfo();
        circle.setRadius(12);
        System.out.println("Площадь круга: " + circle.calculateArea());


    }
}
