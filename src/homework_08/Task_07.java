package homework_08;

/*
Task 7
Дан массив целых чисел. Поменять местами элементы с максимальным и минимальным значениями.

Пример:

{ 5, 6, -25, 0, 31, -15 } -> { 5, 6, 31, 0, -25, -15 }
 */
public class Task_07 {
    public static void main(String[] args) {
        int[] array = {5, 6, -25, 0, 31, -15};

        // От преподавателя
        int minIndex = 0;
        int min = array[minIndex];

        int maxIndex = 0;
        int max = array[maxIndex];

        int i = 0;
        while (i < array.length){
            if (array[i] < min){
                min = array[i];
                minIndex = i;
            }
            if (array[i] > max){
                max = array[i];
                maxIndex = i;
            }
            i++;
        }
        System.out.println("min " + min + " index: " + minIndex);
        System.out.println("max " + max + " index: " + maxIndex);

        int temp1 = array[maxIndex];
        array[maxIndex] = array[minIndex];
        array[minIndex] = temp1;
         i = 0;
         while (i < array.length){
             System.out.print(array[i++] + ", ");
         }


         // мой код
       /* System.out.println("Все массивы: ");

                 i = 0;
        while (i < array.length) {
            System.out.print(array[i] + " ");
            i++;
        }
        System.out.println();

        // Минимальное значение в массиве
        int min = array[0];
        int minIndex = 0;
        i = 0;
        while (i < array.length) {
            if (array[i] < min) {
                min = array[i];
                minIndex = i;

            }
            i++;
        }
        System.out.println("Минимальное значение в массиве: " + min);

        // Максимальное значение в массиве
        int max = array[0];
        int maxIndex = 0;
        int j = 0;
        while (j < array.length) {
            if (array[j] > max) {
                max = array[j];
                maxIndex = j;
            }
            j++;
        }

        System.out.println("Максимальное значение в массиве: " + max);

        int temp = array[minIndex];
        array[minIndex] = array[maxIndex];
        array[maxIndex] = temp;

        System.out.println("Массивы после замены: ");
        int k = 0;
        while (k < array.length) {
            System.out.print(array[k] + " ");
            k++;
        }
*/

    }
}
