package additionally_05;

/*
Task 2
Создайте строки:
"Java"
"is"
"a"
"powerful"
"language"
Склейте эти строки двумя разными способами, чтобы получить строку: "Java is a powerful language".
Выведите на экран получившуюся строку и её длину.
 */
public class Task_02 {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "is";
        String str3 = "a";
        String str4 = "powerful";
        String str5 = "language";
        String space = " ";

        String firstString = str1.concat(space).concat(str2).concat(space).concat(str3).concat(space).concat(str4).concat(space).concat(str5);
        String secondString = String.join(space, str1, str2, str3, str4, str5);
        String thirdString = str1 + space + str2 + space + str3 + space + str4 + space + str5;

        System.out.println(firstString);
        System.out.println(secondString);
        System.out.println(thirdString);

        /*Выведите на экран получившуюся строку и её длину.
        Task 2.2 * (Опционально)
                Замените в результирующей строке слово "powerful" на "super".
                Создайте переменную типа boolean с ответом на вопрос: содержит ли строка подстроку "age"?
                Выведите на экран значение этой переменной.
         */
        System.out.println(firstString + ". Длина строки: " + firstString.length());
        System.out.println(secondString + ". Длина строки: " + secondString.length());
        System.out.println(thirdString + ". Длина строки: " + thirdString.length());

        String replace = firstString.replace("powerful", "super");
        System.out.println("Новая фраза: " + replace);
        System.out.println("Новая фраза: " + secondString.replace("powerful", "super"));

        boolean bool = firstString.contains("age");
        System.out.println("Содержит ли строка подстроку \"age\". Ответ!: " + bool);

        String replaceMe = "AbAbAbAc";
        String replace1 = replaceMe.replaceFirst("Ab", "C");
        String replace2 = replaceMe.replace("Ab", "D");

    }
}
