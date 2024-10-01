package lesson_16;

public class MagicArray {
    int[] array;

    int cursor;

    public MagicArray() {
        array = new int[10];
    }

    void add(int value) {

        if (cursor == array.length - 1) {
            expandArray();

        }

        array[cursor] = value;
        cursor++;

    }

    void add(int... numbers){
       // System.out.println("Приняли несколько интов. А именно: " + numbers.length);
        //System.out.println("Есть индекс у каждого инта, как в массиве. Под индексом 0: "+numbers[0]);
        for (int i = 0; i < numbers.length; i++) {
            add(numbers[i]);

        }

    }

    void expandArray() {
        System.out.println("Расширяем массив! Курсор = " + cursor);

        int[] newArray = new int[array.length * 2];

        for (int i = 0; i < cursor; i++) {
            newArray[i] = array[i];
        }

        array = newArray;
        System.out.println("Расширение массива завершено");


    }

    public String toString() {
        if (cursor == 0) return "[]";


        String result = "[";
        for (int i = 0; i < cursor; i++) {
            result = result + array[i] + (i < cursor - 1 ? ", " : "]");

        }

        return result;
    }


    // Текущее количество элементов в массиве
    int size() {
        return cursor;
    }

    // Возвращает значение по индексу
    int get(int index) {
        if (index >=0 && index < cursor) {
            return array[index];
        }
        // Написать код, если индекс "не корректный"
        return Integer.MIN_VALUE; // Хорошего решения нет.
        //Todo Поправить обработку не корректного индекса
    }

    // Удаление элемента по индексу
    int remove(int index) {
        /*
        1. Проверка индекса на валидность
        2. Удалить значение по индексу
        3. Передвинуть курсор (т.к. кол-во элементов уменьшилось)
        4. Вернуть старое значение
        */
        //Todo реализовать
        return -1;
    }


}
