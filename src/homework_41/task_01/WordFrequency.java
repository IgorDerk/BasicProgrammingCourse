package homework_41.task_01;

import java.util.HashMap;
import java.util.Map;

public class WordFrequency {

    public static Map<String, Integer> getWordFrequency(String text) {

        Map<String, Integer> wordFrequencyMap = new HashMap<>();

        if (text == null || text.isEmpty()) {
            return wordFrequencyMap;
        }

        String newString = text.replaceAll("[^a-zA-Z0-9а-яА-Я ]", "").toLowerCase();

        String[] words = newString.split(" ");

        for (String word : words) {

            Integer count = wordFrequencyMap.get(word);

            if (count == null) {
                count = 0;
            }
            wordFrequencyMap.put(word, count + 1);
        }

        return wordFrequencyMap;
    }

    public static void main(String[] args) {
        String text = "Строка для проверки количества вхождений слов" +
                ".\n Строка для проверки и теста. и количества слов для проверки";

        Map<String, Integer> wordFrequency = getWordFrequency(text);
        wordFrequency.forEach((k, v) -> System.out.println("'" + k + "': " + v + "; "));
    }
}