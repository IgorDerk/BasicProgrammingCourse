package homework_43.task_03;

import java.util.List;
import java.util.stream.Collectors;

public class PersonFilter {

    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Alice", 30, "Berlin"),
                new Person("Bob", 20, "Berlin"),
                new Person("Charlie", 35, "Munich"),
                new Person("Diana", 40, "Berlin"),
                new Person("Eve", 28, "Hamburg")
        );

        List<Person> filteredPeople = filterPeople(people, 25, "Berlin");
        filteredPeople.forEach(System.out::println);

    }

    public static List<Person> filterPeople(List<Person> people, int ageThreshold, String city) {
        return people.stream()
                .filter(person -> person.getAge() > ageThreshold)
                .filter(person -> person.getCity().equalsIgnoreCase(city))
                .collect(Collectors.toList());
    }

}