package homework_10;
/*
Task 1
Написать метод со следующим функционалом:

На вход метод принимает массив целых чисел и число - длину нового массива. Метод должен создать и распечатать массив заданной в параметрах длинны. В начало массива должны быть скопированы элементы из входящего массива:

{0, 1, 2, 3, 4, 5, 6} -> copyOforiginal(original, 3) -> вывод на печать {0, 1, 2}
Copy
{0, 1, 2} -> copyOforiginal(original, 5) -> вывод на печать {0, 1, 2, 0, 0}
Copy
originals.copyOf() использовать нельзя. Суть задачи - написать собственную реализацию этого метода
 */
public class Task_01 {
    public static void main(String[] args) {
        int[] array1 = {0, 1, 2, 3, 4, 5, 6};
        int[] array2 = {0, 1, 2};

        copyOforiginal(array1, 3);
        copyOforiginal(array2, 5);
    }

    public static void copyOforiginal (int[] original, int newLength){
    
        int[] newArray = new int[newLength];
        
        int i = 0;
        while (i < original.length && i < newArray.length){
            newArray[i] = original[i];
            i++;
        }

        System.out.print("{");
        for (int j = 0; j < newArray.length; j++) {
            System.out.print(newArray[j]);
            if (j < newArray.length -1){
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }
}
