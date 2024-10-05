package lesson_16;

public class MagicApp {
    public static void main(String[] args) {

        int [] test = {0,1,2,3,4,5,6,7};
        MagicArray magicArray = new MagicArray(test);
     /*   magicArray.cursor = 1_000_000;
        magicArray.array = new int[1000];
        magicArray.array = new int[]{1,2,3,4};

       */

        magicArray.add(1,2,3,4,5,6,7,8,9);
        System.out.println(magicArray.toString());

        int index = magicArray.indexOf(5);
        System.out.println("Индекс элемента: " + index);

        magicArray.remove(3);
        magicArray.add(1555);
        System.out.println(magicArray.toString());

        System.out.println("\n================== Remove By Value =============\n");

        boolean istDeleted = magicArray.removeByValue(7);
        System.out.println("istDeleted: "+istDeleted);
        System.out.println(magicArray.toString());

         istDeleted = magicArray.removeByValue(100000);
        System.out.println("istDeleted: "+istDeleted);
        System.out.println(magicArray.toString());




    }
}
