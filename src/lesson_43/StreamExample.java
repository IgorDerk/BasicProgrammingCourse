package lesson_43;

import homework_39.task_01.ListApp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {

    public static void main(String[] args) {


        /*

         */

        //task1();
        //task2();
        //task3();
       //task4();
        task5();


    }

    private static void task5() {
        List<Cat> cats = getListCats();
        List<String> catNames = cats.stream()
                .filter(cat -> cat.getWeight() > 4)
               // .map(cat -> cat.getName())
                .map(Cat::getName)
                .collect(Collectors.toList());

        System.out.println(catNames);
    }

    private static void task4() {
        List<Cat> cats = getListCats();
        Stream<String> namesStream = cats.stream()
                .map(cat -> cat.getName());

        List<String> catNames = cats.stream()
                .map(Cat::getName)
                .collect(Collectors.toList());

        System.out.println(catNames);
       // System.out.println(cats);
    }

    private static void task3() {
        List<Cat> cats = getListCats();
        Stream<Cat> stream = cats.stream()
                .filter(cat -> cat.getName().length() > 4);

        List<Cat> longNameCats = stream.collect(Collectors.toList());

        System.out.println("longNameCats: " + longNameCats);


    }

    private static void task2() {
        List<Cat> cats = getListCats();
        Stream<Cat> catStream = cats.stream()
                .filter(cat -> cat.getWeight() > 4);
        List<Cat> fatCats = catStream.collect(Collectors.toList());


        // fatCats = catStream.filter(cat -> cat.getWeight() > 5).collect(Collectors.toList());

        System.out.println(fatCats);
    }

    private static List<Cat> getListCats() {
        return List.of(
                new Cat("Bear", 5, "braun"),
                new Cat("Python", 7, "green"),
                new Cat("Tiger", 3, "gray"),
                new Cat("Panda", 4, "black")


        );
    }

    private static void task1() {
        List<Integer> integers = List.of(-1, 12, 0, 5, 1, -15, 24, 0);
        // Список, содержащий положительные числа
        // Список должен быть отсортирован в порядке возрастания

        List<Integer> result = new ArrayList<>();
        for (Integer i : integers) {
            if (i > 0) result.add(i);
        }
        result.sort(Comparator.naturalOrder());
        System.out.println(result);

        List<Integer> integerList = integers.stream()
                .filter(i -> i > 0)
                .sorted()
                .collect(Collectors.toList());

        System.out.println("integerList: " + integerList);

        // integers.stream().filter(i -> i > 0).sorted().collect(Collectors.toList());


    }

}