package lesson_07;

public class Block {
    public static void main(String[] args) {

        int x = 10;

        {
            int y = 5;
            x = x + y;

            System.out.println("x: " + x);
            System.out.println("y: " + y);
        }

        // {} - область видимости
        // x = x + y; // переменная y  недоступна вне своего блока

        // Новая перемменная с именем y
        int y = 124;
        System.out.println("New y: " + y);
    }
}
