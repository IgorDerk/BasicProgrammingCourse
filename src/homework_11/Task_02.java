package homework_11;
/*
Task 2
Написать метод, который находит среднее значение элементов в массиве (среднее арифметическое).
 */
public class Task_02 {
    public static void main(String[] args) {
int[] array = {1,2,3,4,5,6};
double average = calculateAverage(array);
        System.out.println("Среднее арифметическое: " + average);
    }

    public static double calculateAverage(int[] numbers){
        if (numbers == null || numbers.length == 0){
            return  Integer.MIN_VALUE;
        }
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            sum += number;
        }

        return (double) sum/ numbers.length;
    }
}
