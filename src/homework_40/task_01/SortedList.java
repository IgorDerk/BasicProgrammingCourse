package homework_40.task_01;

import java.util.*;

public class SortedList {
    /*
    Task 1
Напишите метод, принимающий строку и возвращающий Список ее слов без повторений, отсортированный в порядке увеличения длин слов.

Если строки имеют одинаковую длину - сортировать в естественном порядке

public static void main(String[] args) {
        String testString = "Тестовая строка для удаления слов, которые повторяются. \"строка\" для удаления!";
        System.out.println(StringUtil.getUniqueSortedWords(testString));
    }
Copy
// Output:
[для, слов, строка, которые, Тестовая, удаления, повторяются]
     */
    public static void main(String[] args) {

        String testString = "Тестовая строка для удаления слов, которые повторяются. \"строка\" для удаления!";
        System.out.println(getUniqueSortedWords(testString));
    }

    public static List<String> getUniqueSortedWords(String testString) {
        // Удаляем все символы, кроме букв
        String newString = testString.replaceAll("[^a-zA-Z0-9а-яА-Я ]", "");

        // Преобразование строки в массив слов
        String[] words = newString.split(" ");

        // Преобразование массива words в список (List)
        // LinkedHashSet сохраняет уникальные значения
        Set<String> uniqueWordsSet = new LinkedHashSet<>(Arrays.asList(words));

        // Преобразование Set в List
        List<String> uniqueWordList = new ArrayList<>(uniqueWordsSet);

        //Сортируются слова сначала по длине , а затем по естественному порядку
        uniqueWordList.sort(Comparator.comparing(String::length).thenComparing(String::compareTo));

        return uniqueWordList;
    }

    ;


}

