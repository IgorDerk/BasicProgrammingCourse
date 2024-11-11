package homework_43.task_01;
/*
Task 1
Напишите метод, принимающий список чисел и возвращающий новый, отфильтрованный список.

В новом списке должны быть только те числа из старого списка, которые соответствуют всем условиям: четные, больше 10 и меньше 100

Для фильтрации используйте Stream API
 */

import java.util.List;
import java.util.stream.Collectors;

public class NumberFilter {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(5, 12, 44, 102, 8, 99, 55, 66, 120);
        List<Integer> filteredNumbers = filterNumbers(numbers);
        System.out.println(filteredNumbers);
    }
    public static List<Integer> filterNumbers(List<Integer> numbers) {
        return numbers.stream()
                .filter(num -> num % 2 == 0)
                .filter(num -> num > 10)
                .filter(num -> num < 100)
                .collect(Collectors.toList());
    }
}
