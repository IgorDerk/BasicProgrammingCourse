package homework_39.task_01;

import java.util.ArrayList;
import java.util.List;


    public class Test {


        public static <T> List<T> findCommonElements(List<T> list1, List<T> list2) {
            List<T> commonElements = new ArrayList<>(list1); // Создаем копию list1
            commonElements.retainAll(list2); // Оставляем только элементы, присутствующие в обоих списках
            return commonElements; // Возвращаем список с общими элементами
        }

        public static void main(String[] args) {
            List<Integer> list1 = List.of(1, 2, 3, 4, 5);
            List<Integer> list2 = List.of(3, 4, 5, 6, 7);

            List<Integer> common = findCommonElements(list1, list2);
            System.out.println("Общие элементы: " + common);
        }
    }


