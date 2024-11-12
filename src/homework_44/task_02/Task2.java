package homework_44.task_02;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/*
Task 2
Имеется список строк. Используя Stream API, найдите строку с максимальной длиной.
 */
public class Task2 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>(List.of("apple", "banana", "cherry", "blueberry", "strawberry"));

        Optional<String> longestString = strings.stream()
                .max((s1, s2) -> Integer.compare(s1.length(), s2.length()));

        // ifPresentOrElse(consumer, emptyAction): выполняет действие consumer, если значение присутствует,
        // иначе выполняет emptyAction
        longestString.ifPresentOrElse(
                str -> System.out.println("Самая длинная строка: " + str),
                () -> System.out.println("Никаких строк найдено не было!")
        );

    }

}
