package homework_25.task_01;

import java.util.Arrays;

/*
Task 1
Параметризовать наш класс "Magic Array", добавив в него обобщение типа (generic).

Реализовать в классе параметризованный интерфейс MyList (код интерфейса прикреплен к уроку)
 */
public class MagicArrayGen<T> implements MyList<T> {
    private T[] array;
    private int cursor; // присвоено значение по умолчанию = 0;

    @SuppressWarnings("unchecked")
    public MagicArrayGen() {
        array = (T[]) new Object[10];
    }

    @SuppressWarnings("unchecked")
    public MagicArrayGen(T[] array) {
        if (array == null || array.length == 0) {
            this.array = (T[]) new Object[10];
        } else {
            this.array = (T[]) new Object[array.length * 2];
            add((T) array);
        }
    }

    // Добавить элемент
    @Override
    public void add(T value) {
        if (cursor == array.length - 1) {
            expandArray();
        }

        array[cursor] = value;
        cursor++;
    }

    // добавить несколько элементов
    @Override
    @SuppressWarnings("unchecked")
    public void addAll(T... values) {
        for (int i = 0; i < values.length; i++) {
            add(values[i]);
        }
    }

    // Возвращает количество элементов в массиве
    @Override
    public int size() {
        return cursor;
    }

    // Поиск элемента по значению
    @Override
    public int indexOf(T value) {
        for (int i = 0; i < cursor; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    // Поиск элемента по значению
    @Override
    public int lastIndexOf(T value) {

        for (int i = cursor - 1; i >= 0; i--) {
            if (array[i] == value) {
                return i;
            }
        }

        return -1;
    }

    // Содержит ли массив элемент с таким значением
    @Override
    public boolean contains(T value) {
        return indexOf(value) != -1;
    }


    // Возвращает представление элементов в виде массива
    @Override
    public T[] toArray() {
        return Arrays.copyOf(array, cursor);
    }

    // Удаляет один элемент по значению
    @Override
    public boolean remove(T value) {
        int index = indexOf(value);
        if (index != -1) {
            remove(index);
            return true;
        }
        return false;
    }

    // Удаляет элемент по индексу.
    @Override
    public T remove(int index) {

        if (index >= 0 && index < cursor) {
            T value = array[index];
            for (int i = index; i < cursor - 1; i++) {
                array[i] = array[i + 1];
            }
            cursor--;

            return value;

        } else {
            return null;
        }
    }

    // Является ли коллекция пустой
    @Override
    public boolean isEmpty() {
        return cursor == 0;
    }

    // Получить значение по индексу
    public T get(int index) {
        if (index >= 0 && index < cursor) {
            return array[index];
        }
        System.out.println("Индекс не корректный: " + index);
        return null;

    }

    //Перезаписывает значение по указанному индексу
    @Override
    public void set(int index, T value) {
        if (index >= 0 && index < cursor) {
            array[index] = value;
        } else {
            System.out.println("Индекс не корректный: " + index);
        }

    }

    @SuppressWarnings("unchecked")
    // Динамическое расширение массива
    private void expandArray() {
        System.out.println("Расширяем массив! Курсор = " + cursor);

        T[] newArray = (T[]) new Object[array.length * 2];

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
            result = result + array[i] + (i < cursor - 1 ? ", " : "]"); //", " / "]"
        }

        return result;
    }
}


















