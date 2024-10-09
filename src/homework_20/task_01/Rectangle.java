package homework_20.task_01;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String name) {
        super(name);

    }

    public void setDimensions(double width, double height) {
        this.width = width;
        this.height = height;

    }

    public  double calculateArea() {
        if (width < 0 || height < 0 ){
            System.out.println("Ошибка: параметр стороны не может быть отрицательным!!!");
            return Integer.MIN_VALUE;
        }
        return width * height;
    }

//

}




