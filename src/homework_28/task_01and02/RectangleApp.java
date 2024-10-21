package homework_28.task_01and02;

public class RectangleApp {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(5.0, 3.0);
        Rectangle rectangle2 = new Rectangle(5.0, 3.0);
        Rectangle rectangle3 = new Rectangle(4.0, 2.0);
        Rectangle rectangle4 = new Rectangle();
        System.out.println(rectangle1);
        System.out.println(rectangle2);
        System.out.println(rectangle3);
        System.out.println(rectangle4);

        System.out.println("rectangle1.equals(rectangle2): " + rectangle1.equals(rectangle2));
        System.out.println("rectangle1.equals(rectangle3): " + rectangle1.equals(rectangle3));
        System.out.println("rectangle1.equals(rectangle4): " + rectangle1.equals(rectangle4));
    }
}
