package homework_42.task_02;
/*
Task 2
Подсчет слов по длине
Напишите программу, которая подсчитывает количество слов определенной длины в заданном тексте (строке).

Инструкции:
Используйте HashMap<Integer, Integer>, где ключом является длина слова, а значением — количество слов этой длины.
Прочитайте текст и обновите карту соответствующим образом.
Выведите результаты подсчета.
 */

import java.util.HashMap;
import java.util.Map;

public class WordLengthCounter {
    public static void main(String[] args) {
        String text = "Ночь, улица, фонарь, аптека, Бессмысленный и тусклый свет. Живи еще хоть четверть века  - Все будет так. Исхода нет.";

        Map<Integer, Integer> wordLengthMap = countWordByLength(text);

        for (Map.Entry<Integer, Integer> entry : wordLengthMap.entrySet()) {
            System.out.println("Длина " + entry.getKey() + ": " + entry.getValue() + " слов(о)");
        }
    }

    // Метод для подсчета количества слов по длине
    private static Map<Integer, Integer> countWordByLength(String text) {

        Map<Integer, Integer> wordLengthMap = new HashMap<>();

        String[] words = text.split("\\s+");

        for (String word : words) {

            word = word.replaceAll("^[^a-zA-Zа-яА-Я]+|[^a-zA-Zа-яА-Я]+$", "");

            // Проверяем длину слова
            int length = word.length();
            if (length > 0) {
                // System.out.println("Слово: \"" + word + "\", длина: " + length);

                wordLengthMap.put(length, wordLengthMap.getOrDefault(length, 0) + 1);
            }
        }
        return wordLengthMap;
    }
}