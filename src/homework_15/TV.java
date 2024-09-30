package homework_15;

public class TV {
    public static void main(String[] args) {
        Technic technic = new Technic("TV", 139.7, 14_200 );


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
