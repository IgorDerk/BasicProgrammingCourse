package homework_38.task_01;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorApp {
    public static void main(String[] args) {
        Sportsman[] sportsman = new Sportsman[5];
        sportsman[0] = new Sportsman("Alex Johnson", 28, 95);
        sportsman[1] = new Sportsman("Maria Lopez", 24, 88);
        sportsman[2] = new Sportsman("Liam Chen", 31, 92);
        sportsman[3] = new Sportsman("Emma Brown", 22, 79);
        sportsman[4] = new Sportsman("James O'Connor", 26, 85);


        // Отсортируйте его с использованием естественного порядка, определенного в Comparable
        System.out.println("Сортировка с использованием естественного порядка, определенного в Comparable");
        System.out.println(Arrays.toString(sportsman));
        System.out.println();

        // Сортировка с использованием естественного порядка, данного класса Comparator
        System.out.println("Сортировка с использованием естественного порядка, данного класса Comparator");
        SportsmanScoreComparator sportsmanScoreComparator = new SportsmanScoreComparator();
        Arrays.sort(sportsman, sportsmanScoreComparator);
        System.out.println(Arrays.toString(sportsman));
        System.out.println();

        // Сортировка с использованием анонимного класса Comparator для сортировки по третьему полю (например, age)
        System.out.println("Сортировка с использованием анонимного класса Comparator для сортировки по age)");
        Arrays.sort(sportsman, new Comparator<Sportsman>() {
            @Override
            public int compare(Sportsman sportsman1, Sportsman sportsman2) {
                return Integer.compare(sportsman1.getAge(), sportsman2.getAge());
            }
        });
        System.out.println(Arrays.toString(sportsman));


    }
}
