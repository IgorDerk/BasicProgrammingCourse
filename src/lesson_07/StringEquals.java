package lesson_07;

public class StringEquals {
    public static void main(String[] args) {
        int x = 10;

        String str1 = "Java"; // Ccылочный тип, в перменной хранится ссылка на объект String
        String str2 = "Java";
        String str3 = "JaVa";
        String str4 = new String("Java");

        System.out.println(str1 + " | " + str2 + " | " + str3 + " | " + str4);

        // У примитивных типах сравниваются значения
        // У String сравниваются ссылки на участки памяти
        boolean b1 = (str1 == str2);
        System.out.println("str1 == str2: " + b1); // true
        System.out.println("str1 == str3: " + (str1 == str3)); // false
        System.out.println("str1 == str4: " + (str1 == str4)); // false

        // String Pool
        System.out.println("=========== \n");


        // ВАЖНО!!!
        // Для сравнения их значений мы ДОЛЖНЫ исползовать метод equals

        boolean b2 = str1.equals(str2); // Сравнение по значению (не по ссылке)

        System.out.println("str1.equals(str2) -> " + b2);
        System.out.println("str1.equals(str4) -> " + str1.equals(str4));
        System.out.println("str1.equals(str3) -> " + str1.equals(str3));
        System.out.println("str1.equalsIgnoreCase(str3) -> " + str1.equalsIgnoreCase(str3)); // Сравнение по значению игнорируя регистор
        System.out.println(str1 + " .equalsIgnoreCase(" + str3 + ") -> " + str1.equalsIgnoreCase(str3)); // Сравнение по значению игнорируя регистор
    }
}
