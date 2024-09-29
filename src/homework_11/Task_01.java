package homework_11;

/*
Task 1
Написать метод, который считает сумму всех элементов в массиве.
 */
public class Task_01 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        int sum = sumAllElements(array);

        System.out.println("Cумма всех элементов в массиве: " + sum);

    }


    public static int sumAllElements(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
}