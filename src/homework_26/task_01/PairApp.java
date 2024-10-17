package homework_26.task_01;

public class PairApp {
    public static void main(String[] args) {
        Pair<String> pair = new Pair<>("Hello ", "World ");
        System.out.print(pair.getFirst()); // Вывод: Hello
        System.out.println(pair.getSecond()); // Вывод: World

        pair.swap();

        System.out.print(pair.getFirst()); // Вывод: World
        System.out.println(pair.getSecond()); // Вывод: Hello
    }
}
