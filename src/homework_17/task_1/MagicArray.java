
package homework_17.task_1;
/*
Task 1
Инкапсулировать класс нашего магического массива

Task 2 * (Опционально)
Написать метод lastIndexOf(int value) возвращающий индекс последнего вхождения значения в массиве.
 */

public class MagicArray {
    private int[] array;
    private int cursor; // присвоено значение по умолчанию = 0;

    public MagicArray() {
        array = new int[10];
    }


    // Добавление в массив одного элемента
    public void setAdd(int value) {


        // Проверка. Есть ли вообще свободное место во внутреннем массиве
        // Если места нет - нужно добавить место
        if (cursor == array.length - 1) {
            // Расширить массив перед добавлением нового элемента
            expandArray();
        }

        array[cursor] = value;
        cursor++;
    }

    public void setAdd(int... numbers) {
        // с numbers я могу обращаться точно также, как со ссылкой на массив int
        // System.out.println("Приняли несколько интов. А именно: " + numbers.length);
        // System.out.println("Есть индекс у каждого инта, как в массиве. По индексом 0: " + numbers[0]);
        for (int i = 0; i < numbers.length; i++) {
            setAdd(numbers[i]);
        }
    }


    // Динамическое расширение массива
    public void expandArray() {
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
    public String getToString() {

        if (cursor == 0) return "[]";

        String result = "[";
        for (int i = 0; i < cursor; i++) {
            result = result + array[i] + (i < cursor - 1 ? ", " : "]"); //", " / "]"
        }

        return result;
    }

    // Текущее количество элементов в массиве
    public int getSize() {
        return cursor;
    }

    // Возвращает значение по индексу
    public int getValue(int index) {
        // Написать код, если индекс "не корректный"
        for (int i = 0; i < array.length; i++) {

            if (index >= 0 && index < cursor) {
                return array[index];
            }
            return Integer.MIN_VALUE;
        }
        return index;
    }

    //Возвращает индекс по значению
    public int getIndex(int value) {
        int i = 0;
        while (i < cursor) {
            if (array[i] == value) {
                return i;
            }
            i++;
        }
        return Integer.MIN_VALUE;
    }

    // Удаление элемента по индексу
    public int removeByIndex(int index) {
        /*
        1. Проверка индекса на валидность
        2. Удалить значение по индексу
        3. Передвинуть курсор (т.к. кол-во элементов уменьшилось)
        4. Вернуть старое значение
        */

        if (index >= 0 && index < cursor) {
            // Логика удаления
            int value = array[index]; // значение, которое я должен вернуть

            // Перебираем элементы начиная с индекса и перезаписываем значениями из соседней правой ячейки
            for (int i = index; i < cursor - 1; i++) { // граница перебора индексов?
                array[i] = array[i + 1];
            }
            cursor--;

            return value; // возвращаем старое значение

        } else {
//           Индекс не валидный
            return Integer.MIN_VALUE;
        }
    }

    // Поиск по значению. Первое вхождение
    // {1, 100, 5, 5, 100} -> 100 метод вернет индекс первого найдено вхождения = 1
    public int getFirstIndexOf(int value) {
        for (int i = 0; i < cursor; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return Integer.MIN_VALUE;
    }

    //Task 2 * (Опционально)
    //Написать метод lastIndexOf(int value) возвращающий индекс последнего вхождения значения в массиве.
    // Метод поиска по значению. Поиск последнего вхождения
    // {1, 100, 5, 5, 100} -> 100 метод вернет индекс последнего найдено вхождения = 4
    public int getLastIndexOf(int value) {
        for (int i = cursor - 1; i >= 0; i--) {
            if (array[i] == value) {
                return i;
            }
        }
        return Integer.MIN_VALUE;
    }

    // Удаление элемента по значению
    boolean getRemoveByValue(int value) {
        /*
        1. Есть ли элемент с таким значение в массиве - indexOf
        2. Если элемента нет - вернуть false
        3. Если элемент есть - удалить и вернуть true - вызвать удаление по индексу
         */
        int index = getFirstIndexOf(value);
        if (index == -1) return false;

        removeByIndex(index);
        return true;
    }

    // Установить новое значение для элемента
    public void setNewValueForElement(int newValue, int index) {

        if (index >= 0 && index < cursor) {
            array[index] = newValue;
        }
    }

    // Добавить метод для установки нового массива
    public void setNewArray(int[] newArray) {
        array = new int[newArray.length];

        for (int i = 0; i < newArray.length; i++) {
            array[i] = newArray[i];
        }

        cursor = newArray.length;
    }
}





/*
1. Добавлять в массив элемент (не думая об индексах, размере массива) ++
2. Динамическое изменение размера массива ++
3. Возвращать строковое представление массива (какие элементы тым есть) ++
4. Добавляем в массив сразу несколько значений. ++
5. Текущее количество элементов в массиве ++
6. Возвращает значение по индексу ++
7. Удаляет элемент по индексу ++ (Есть индекс - удалить этот элемент из массива). Вернуть старое значение (удаленное)
8. Конструктор, принимающий массив ++
9. Удаление по значению
10. Поиск по значению. Возвращает индекс ++

 */