package homework_43.task_02;
/*
Task 2
Дан список строк.

Используя Stream API, отфильтруйте строки, которые начинаются на определенную букву (например, "A"), удалите дубликаты и отсортируйте их в алфавитном порядке.

Результат сохраните в новый список строк.
 */
import java.util.List;
import java.util.stream.Collectors;

public class StringFilter {
    public static void main(String[] args) {
        List<String> strings = List.of("Apple", "Banana", "Avocado", "Apricot", "apple", "Avocado", "Almond", "Berry");
        List<String> filteredStrings = filterAndSortStrings(strings, "A");
        System.out.println(filteredStrings); // Пример вывода: [Almond, Apricot, Avocado, Apple]
    }

    public static List<String> filterAndSortStrings(List<String> strings, String letter) {
        return strings.stream()
                .filter(str -> str.startsWith(letter))
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }
}
