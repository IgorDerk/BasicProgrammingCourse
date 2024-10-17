package homework_25.task_01;

/*
Task 1
Параметризовать наш класс "Magic Array", добавив в него обобщение типа (generic).

Реализовать в классе параметризованный интерфейс MyList (код интерфейса прикреплен к уроку)
 */
public class MagicArrayGenApp {
    public static void main(String[] args) {
        MagicArrayGen<String> magicArray = new MagicArrayGen<>();

        magicArray.add("Hello");
        magicArray.add("World");
        magicArray.addAll("Hallo", "World", "Java");


        System.out.println("MagicArray: " + magicArray);
        System.out.println("Size: " + magicArray.size());
        System.out.println("Index of 'World': " + magicArray.indexOf("World"));
        System.out.println("Last index of 'Java': " + magicArray.lastIndexOf("Java"));
        System.out.println("Contains 'Java': " + magicArray.contains("Java"));
        magicArray.remove("World");
        System.out.println("After removing 'World': " + magicArray);
        magicArray.remove(1);
        System.out.println("After removing index '1': " + magicArray);
        System.out.println("Is the array empty: " + magicArray.isEmpty());
        System.out.println("First element: "  + magicArray.get(1));
        magicArray.set(0, "Bye");
        System.out.println("After set (0, Bye): " + magicArray);






    }
}
