package homework_40.task_02;

import java.util.HashSet;
import java.util.Set;

public class SetUtils {
    //Метод возвращает множество, содержащее все уникальные элементы из обоих множеств (объединение множеств).
    public static Set<String> union(Set<String> set1, Set<String> set2) {
        Set<String> result = new HashSet<>(set1);
        result.addAll(set2);
        return result;
    }

    //  Метод возвращает множество, содержащее только элементы, которые присутствуют в обоих исходных множествах (пересечение множеств).
    public static Set<String> intersection(Set<String> set1, Set<String> set2) {
        Set<String> result = new HashSet<>(set1);
        result.retainAll(set2);
        return result;
    }

    // Метод возвращает множество элементов, которые есть в первом множестве, но отсутствуют во втором (разность множеств).
    public static Set<String> difference(Set<String> set1, Set<String> set2){
        Set<String> result = new HashSet<>(set1);
        result.removeAll(set2);
        return result;
    }
}
