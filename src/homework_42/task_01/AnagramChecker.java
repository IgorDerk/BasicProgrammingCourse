package homework_42.task_01;
/*
Task 1
Напишите программу, которая проверяет, являются ли две заданные строки анаграммами (то есть содержат ли они одинаковые буквы в разном порядке).

Инструкции:
Используйте HashMap<Character, Integer> для подсчета количества каждого символа в строках.
Сравните две карты, чтобы определить, являются ли строки анаграммами.
P.S.
Метод equals() для карт в Java сравнивает карты на основе их содержимого — пар ключ-значение — независимо от порядка ключей.

Это означает, что если две карты содержат одинаковые пары ключ-значение, то метод equals() вернет true, даже если порядок добавления или хранения этих пар различается.
 */

import java.util.HashMap;
import java.util.Map;

public class AnagramChecker {
    public static void main(String[] args) {
        String string1 = "listen";
        String string2 = "silent";

        boolean result = areAnagrams(string1, string2);
        if (result){
            System.out.println("Strings \"" + string1 + "\" and \"" + string2 + "\" are anagrams.");
        } else {
            System.out.println("Strings \"" + string1 + "\" and \"" + string2 + "\" are not anagrams.");
        }

    }

    // Метод для проверки, являются ли две строки анаграммами
    private static boolean areAnagrams(String string1, String string2) {

        if (string1.length() != string2.length()){
            return false;
        }

        // Две карты для подсчета символов
        Map<Character, Integer> map1 = createFrequenceMap(string1);
        Map<Character, Integer> map2 = createFrequenceMap(string2);

        return map1.equals(map2);

    }

    // Метод для создания карты частот символов
    private static Map<Character, Integer> createFrequenceMap(String string){

        Map<Character, Integer> frequencyMap = new HashMap<>();

        for (char character : string.toCharArray()){

            frequencyMap.put(character, frequencyMap.getOrDefault(character, 0) + 1);
        }
        return frequencyMap;
    }
}
