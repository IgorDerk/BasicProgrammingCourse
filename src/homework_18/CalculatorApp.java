package homework_18;

public class CalculatorApp {
    public static void main(String[] args) {
        System.out.println("addition: " + Calculator.addition(32, 4));
        System.out.println("subtraction: " + Calculator.subtraction(67, 4));
        System.out.println("multiplication: "  + Calculator.multiplication(34, 4));
        System.out.println("division: " + Calculator.division(45, 5));
        System.out.println("division: " + Calculator.division(45.5, 5.5));
    }
}
