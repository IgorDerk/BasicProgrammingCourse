package homework_15;

public class Tablet {
    public static void main(String[] args) {
        Technic technic = new Technic("Tablet",  27.94, 498   );


        technic.turnedOn();
        technic.show();
        technic.turnedOff();

        String technicName = technic.name;
        System.out.println("Наименование: " + technicName);

        double technicSize = technic.size;
        System.out.println("Размер: " + technicSize + " мм");

        double technicWeight = technic.weight;
        System.out.println("Вес: " + technicWeight + " г");


    }
}
