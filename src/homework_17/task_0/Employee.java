package homework_17.task_0;

/*
Task 0
Написать класс Employee (Работник)

У него должны быть поля имя, возраст, зарплата

Инкапсулировать класс.

Написать метод info() выводящий информацию о работнике.
 */
public class Employee {
    private String name;
    private int age;
    private double salary;

    Employee(String name, int age, double salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    String info(){
        return String.format("Employee: %s, age: %d, salary: %.2f", name,age,salary);
    }





}


