package homework_09;
/*
Task 5
Написать метод, который принимает массив строк. Вывести на экран все символы самой длинной строки из массива.

Пример:

{ "One", "Two", "Twenty" } ->

T
w
e
n
t
y
 */
public class Task_05 {
    public static void main(String[] args) {
        String[] array = { "One", "Two", "Twenty" };

        printString(array);

    }

    public static void printString (String[] array){
        String longestString = array[0];

        int index = 1;
        while (index < array.length){
            if(array[index].length() > longestString.length()){
                longestString = array[index];
            }
            index++;
        }

        int charIndex = 0;
        while (charIndex < longestString.length()){
            System.out.println(longestString.charAt(charIndex));
            charIndex++;
        }
    }
}
