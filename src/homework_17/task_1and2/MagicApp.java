package homework_17.task_1and2;


public class MagicApp {
    public static void main(String[] args) {


        MagicArray magicArray = new MagicArray();

//        magicArray.cursor = 1_000_000;
//        magicArray.array = new int[100000];
//        magicArray.array = new int[]{1,2,3,4};


        magicArray.setAdd(1, 2, 3, 4, 5, 6, 7, 8, 9);

        System.out.println(magicArray.getToString());

        magicArray.setAdd(100);
        System.out.println("Индекс элемента: " + magicArray.getToString());

        System.out.println("Значение по индексу: " + magicArray.getValue(8));

        System.out.println("Индекс по значению: " + magicArray.getIndex(3));

        magicArray.setNewValueForElement(56,70);
        System.out.println(magicArray.getToString());

        System.out.println("Индекс первого найдено вхождения: " + magicArray.getFirstIndexOf(1) );
        System.out.println("Индекс последнего найдено вхождения: " + magicArray.getLastIndexOf(9) );
        System.out.println("Текущее количество элементов в массиве: " + magicArray.getSize());

        System.out.println("\n======= Remove By Value ========= \n");

        boolean isDeleted = magicArray.getRemoveByValue(7);
        System.out.println("Удален ли: " + isDeleted);
        System.out.println(magicArray.getToString());

        magicArray.setNewValueForElement(10000000,4);
        System.out.println("Установить новое значение для элемента");
        System.out.println(magicArray.getToString());

        System.out.println("\n===============Set New Array=============\n");

        int[] newValues = {1, 100, 5, 5, 100};
        magicArray.setNewArray(newValues);
        System.out.println("Новый массив:" + magicArray.getToString());
        System.out.println("Индекс последнего найдено вхождения: " + magicArray.getLastIndexOf(100) );


    }
}