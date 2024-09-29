package lesson_07;

public class SwitchExaple {
    public static void main(String[] args) {

        int x = 7;

        if (x == 5) {
            System.out.println("if: x равен 5");
        } else if (x == 7) {
            System.out.println("else if: x равен 7");
        } else {
            System.out.println("else: что-то другое");
        }
        switch (x) {
            case 8:
                System.out.println("switch x равен 8");
                break;
            case 5:
                System.out.println("switch x равен 5");
                break;
            case 7:
                System.out.println("switch x равен 7");
                break;
            case 11:
                System.out.println("switch x равен 11");
                break;
            default:
                System.out.println("switch: что-то другое");
        }
        System.out.println("За пределами switch");
    }
}
