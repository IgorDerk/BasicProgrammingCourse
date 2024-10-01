
package homework_16;

/*
Task 0
Повторить код, написанный на уроке

В MagicArray должны быть реализованы методы:

Добавление элемента
Вывести все значения в массиве в консоль
Поиск элемента по значению indexOf - (вернуть индекс, если такое значение есть в массиве)
Возвращение значения по индексу
Текущее количество элементов в массиве
Удаление элемента по индексу remove
Добавление нескольких элементов (в качестве аргументов передает последовательность значений)
Конструктор, принимающий в себя обычный массив и создающий MagicArray с такими де значениями
Удаление элемента по значению
 */

public class MagicArray {
    int[] array;
    int cursor; // присвоено значение по умолчанию = 0;

    public MagicArray() {
        array = new int[10];
    }

    // Конструктор, принимающий в себя обычный массив и создающий MagicArray с такими де значениями
    public MagicArray(int[] initialArray) {
        if (initialArray == null) {
            System.out.println("Внимание! Используется пустой массив!");
            initialArray = new int[0];
        }
        array = new int[initialArray.length];
        cursor = initialArray.length;

        for (int i = 0; i < cursor; i++) {
            array[i] = initialArray[i];

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
        //Todo Поправить обработку не корректного индекса
    }

    //Поиск элемента по значению indexOf - (вернуть индекс, если такое значение есть в массиве)
    int indexOf(int value) {
        for (int i = 0; i < cursor; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return Integer.MIN_VALUE;
    }


    // Удаление элемента по индексу
     /*
        1. Проверка индекса на валидность
        2. Удалить значение по индексу
        3. Передвинуть курсор (т.к. кол-во элементов уменьшилось)
        4. Вернуть старое значение
        */
    int remove(int index) {

        if (index < 0 || index >= cursor) {
            System.out.println("Некорректный индекс: " + index);
            return Integer.MIN_VALUE;
        }

        int removedValue = array[index];

        for (int i = index; i < cursor - 1; i++) {
            array[i] = array[i + 1];
        }

        cursor--;

        return removedValue;

    }

   // Удаление элемента по значению
    public boolean removeValue(int value){
        int index = indexOf(value);
        if (index != -1){
            remove(index);
            return true;
        }
        return false;
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
