
package lesson_16;


public class MagicArray {
    private int[] array;
    private int cursor; // присвоено значение по умолчанию = 0;

    public MagicArray() {
        array = new int[10];
    }

    public MagicArray(int[] array) {
        if (array == null) {
            this.array = new int[10];
        } else {

            this.array = new int[array.length * 2];
            add(array);
        }
    }

    // Добавление в массив одного элемента
    void add(int value) {

        // Проверка. Есть ли вообще свободное место во внутреннем массиве
        // Если места нет - нужно добавить место
        if (cursor == array.length - 1) {
            // Расширить массив перед добавлением нового элемента
            expandArray();
        }

        array[cursor] = value;
        cursor++;
    }

    void add(int... numbers) {
        // с numbers я могу обращаться точно также, как со ссылкой на массив int
        // System.out.println("Приняли несколько интов. А именно: " + numbers.length);
        // System.out.println("Есть индекс у каждого инта, как в массиве. По индексом 0: " + numbers[0]);
        for (int i = 0; i < numbers.length; i++) {
            add(numbers[i]);
        }

    }


    // Динамическое расширение массива
    void expandArray() {
        System.out.println("Расширяем массив! Курсор = " + cursor);
        /*
        1. создать новый массив бОльшего размера (в 2 раза больше)
        2. Переписать в новый массив все значения из старого (до курсора)
        3. Перебросить ссылку
         */

        // 1
        int[] newArray = new int[array.length * 2];

        // 2
        for (int i = 0; i < cursor; i++) {
            newArray[i] = array[i]; // Переписываю все значения из старого массива в новый
        }

        // Перебрасываем ссылку. Переменная array хранит ссылку на "новый" массив
        array = newArray;
        System.out.println("Расширение массива завершено");
    }

    // Возвращает строковое представление массива
    // [1, 14, 16]
    public String toString() {

        if (cursor == 0) return "[]";

        String result = "[";
        for (int i = 0; i < cursor; i++) {
            result = result + array[i] + (i < cursor - 1 ? ", " : "]"); //", " / "]"
        }

        return result;
    }

    // Текущее количество элементов в массиве
    int size() {
        return cursor;
    }

    // Возвращает значение по индексу
    int get(int index) {
        if (index >= 0 && index < cursor) {
            return array[index];
        }
        // Написать код, если индекс "не корректный"
        return Integer.MIN_VALUE; // Хорошего решения нет.

    }

    // Удаление элемента по индексу
    int remove(int index) {
        /*
        1. Проверка индекса на валидность
        2. Удалить значение по индексу
        3. Передвинуть курсор (т.к. кол-во элементов уменьшилось)
        4. Вернуть старое значение
        */

        if (index >= 0 && index < cursor -1) {
            int value = array[index];
            for (int i = index; i < cursor; i++) {
                array[i] = array[i + 1];
            }
            cursor--;

            return value;


        } else {
            return Integer.MIN_VALUE;
        }

    }

    int indexOf(int value) {
        for (int i = 0; i < cursor; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }


    boolean removeByValue(int value){
        int index = indexOf(value);
        if(index == -1) return false;

        remove(index);
        return true;
    }

}

/*
1. Добавлять в массив элемент (не думая об индексах, размере массива)
2. Динамическое изменение размера массива
3. Возвращать строковое представление массива (какие элементы тым есть)
4. Добавляем в массив сразу несколько значений.
5. Текущее количество элементов в массиве
6. Возвращает значение по индексу
7. Удаляет элемент по индексу (Есть индекс - удалить этот элемент из массива). Вернуть старое значение (удаленное)

 */
