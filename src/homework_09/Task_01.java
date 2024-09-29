package homework_09;

/*
Task 1
Написать метод, принимающий массив целых чисел и распечатывающий массив в обратной последовательности.

{1, 4, 3, 6, 7} -> распечатывает [7, 6, 3, 4, 1]
Copy
Перегрузить метод, если в него приходит индекс, то часть массива слева до этого индекса распечатывается в обычном порядке, а начиная с этого индекса в обратном:

{1, 4, 3, 6, 7} + индекс 2 - > распечатывает [1, 4, 7, 6, 3]
Copy
Еще одна перегрузка: метод принимает массив и булевый флаг. Если флаг == true -> печатает массив в обратном порядке Если флаг == false -> печатает массив в прямом порядке
 */
public class Task_01 {
    public static void main(String[] args) {

        int[] array = {1, 4, 3, 6, 7};
        printArray(array);

        printArray(array, 1);

        printArray(array, true);



    }

    public static void printArray(int[] array) {
        int i = array.length - 1;
        System.out.print("[");
        while (i >= 0) {
            System.out.print(array[i--]);
            if (i >= 0) System.out.print(", ");
        }
        System.out.println("]");
    }

    public static void printArray(int[] array, int index) {
        System.out.print("[");
        int i = 0;
        while (i <= index) {
            System.out.print(array[i++]);
            if (i <= index) System.out.print(", ");
        }

        int j = array.length - 1;
        while (j > index) {
            System.out.print(", " + array[j--]);
        }
        System.out.println("]");
    }

    public static void printArray(int[] array, boolean flag) {
        System.out.print("[");
        if (flag) {
            int i = array.length - 1;
            while (i >= 0) {
                System.out.print(array[i--]);
                if (i >= 0) {
                    System.out.print(", ");

                }
            }

                } else {

                    int j = 0;
                    while (j < array.length){
                        System.out.print(array[j++]);
                        if (j < array.length) System.out.print(", ");
                    }

                }
                System.out.print("]");
            }
        }



