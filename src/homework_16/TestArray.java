package homework_16;


public class TestArray {
    public static void main(String[] args) {
        MagicArray magicArray = new MagicArray();

        System.out.println(magicArray.toString());

        int[] initialArray = {100, 200, 300};
        MagicArray magicArrayWithValues = new MagicArray(initialArray);
        System.out.println("Массив, созданный через конструктор: " + magicArrayWithValues.toString());

        int[] array = new int[10];
        array[0] = 100;
        array[1] = 200;

        magicArray.add(100);
        magicArray.add(200);
        magicArray.add(300);

        System.out.println("Сейчас в массиве элементов: " + magicArray.size());

        magicArray.add(500, 600, 700, 800, 900, 1000, 1100, 1200, 1300, 1400, 1500);
        System.out.println(magicArray.toString());

        System.out.println("Индекс элемента: " + magicArray.indexOf(600));
        System.out.println("Значение по индексу: " + magicArray.get(2));
        System.out.println("Массив до удаления: " + magicArray.toString());

        System.out.println("Удалённое значение: " + magicArray.remove(2));
        System.out.println("Массив после удаления: " + magicArray.toString());

        System.out.println("Удалён ли элемент: " + magicArray.removeValue(100));
        System.out.println("Массив после удаления элемента: " + magicArray.toString());

    }


}