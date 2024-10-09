package homework_20.task_02;
/*
Task 2
Придумать и написать как минимум одну иерархию классов в которой будет один родительский клас и два наследника, расширяющих его функционал

У родительского класса должен быть метод создающий строку с информацией об объекте (метод String toString())
 */
public class Vehicle {
    private String name;
    private String brand;
    private String model;

    public Vehicle(String name, String brand, String model){
       this.name = name;
        this.brand = brand;
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String toString(){
        return "Транспорт: " + name + ", бренд: " + brand + ", модель: " + model;
    }
}
