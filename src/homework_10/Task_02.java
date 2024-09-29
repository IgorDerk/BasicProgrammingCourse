package homework_10;
/*
Task 2
Написать метод, принимающий на вход массив строк.
Метод должен вернуть массив, состоящий из самой короткой и самой длинной строки изначального массива.
 */
public class Task_02 {
    public static void main(String[] args) {
        String[] array = {"One", "Three", "Four", "Five"};

        String[] result = findString(array);

        System.out.print("Результат: {");
        System.out.print(result[0] + ", " + result[1]);
        System.out.println("}");

    }

    public static String[] findString(String[] array) {
        if (array == null || array.length == 0) {
            return new String[]{"", ""}; // Возвращает пустые строки, если массив пуст
        }


        String shortest = array[0];
        String longest = array[0];

        for(int i = 1; i < array.length; i++){
            if (array[i].length() <= shortest.length()){
                shortest = array[i];
            }
            if (array[i].length() >= longest.length()){
                longest = array[i];
            }
        }
        return new String[]{shortest, longest};


    }

}
