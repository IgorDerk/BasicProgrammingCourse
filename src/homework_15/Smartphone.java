package homework_15;

public class Smartphone {
    public static void main(String[] args) {
        Technic technic = new Technic("Smartphone",  15.5, 157  );


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
