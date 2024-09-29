package homework_05;

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
        System.out.println("Task 2");
        String str1 = "Java";
        String str2 = "is";
        String str3 = "a";
        String str4 = "powerful";
        String str5 = "language";
        String str6 = " ";

        String concatStr1 = str1.concat(str6) + str2.concat(str6) + str3.concat(str6) + str4.concat(str6) + str5;
        String concatStr2 = String.join(str6, str1, str2, str3, str4, str5);
        String concatStr3 = str1.concat(str6).concat(str2).concat(str6).concat(str3).concat(str6).concat(str4).concat(str6).concat(str5);
        System.out.println("The first way: " + concatStr1 + ". " + "The length of this line is " + concatStr1.length() + " characters.");
        System.out.println("The second way: " + concatStr2 + ". " + "The length of this line is " + concatStr2.length() + " characters.");
        System.out.println("The third way: " + concatStr3 + ". " + "The length of this line is " + concatStr3.length() + " characters.");
        System.out.println();

        /*
        Task 2.2 * (Опционально)
        Замените в результирующей строке слово "powerful" на "super".
        Создайте переменную типа boolean с ответом на вопрос: содержит ли строка подстроку "age"?
        Выведите на экран значение этой переменной.
         */
        System.out.println("Task 2.2");
        String str7 = "super";
        String concatStrNew = concatStr1.replace(str4, str7);
        String concatStrNew1 = concatStr1.replace("powerful", "super");
        String concatStrNew2 = concatStr1.replace(str4, "super");
        System.out.println("Тew line after replacement: " + concatStrNew);
        System.out.println("Тew line after replacement: " + concatStrNew1);
        System.out.println("Тew line after replacement: " + concatStrNew2);
        System.out.println("================== \n");

        // Поиск вхождний в строке
        String replaceMe = "AbAbAbAb";
        String replace0 = replaceMe.replaceFirst("b", "d");
        String replace1 = replaceMe.replace("b", "c");
        String replace2 = replaceMe.replaceAll("Ab", "Bv"); // Для замены регулярных выражений
        System.out.println("replace0: " + replace0);
        System.out.println("replace1: " + replace1);
        System.out.println("replace1: " + replace2);
        System.out.println("================== \n");

        // Поиск вхождения по индексу
        int index = concatStr1.indexOf("powerful"); // если не нашел, то выдает -1
        System.out.println("index: " + index);

        System.out.println("=============== \n");

        int indexAb1 = replaceMe.indexOf("Ab");
        System.out.println("indexAb1: " + indexAb1);
        int indexAb2 = replaceMe.lastIndexOf("Ab");
        System.out.println("indexAb2: " + indexAb2);

        System.out.println("=============== \n");

        System.out.println("Содержит строка concatStrNew подстроку age? ");
        String age = "age";
        boolean containsAge = concatStrNew.contains(age);
        System.out.println(containsAge);


    }
}
