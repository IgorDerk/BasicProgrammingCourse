package homework_21.task_02;

public class Computer {

    private Processor processor;
    private Memory memory;
    private Storage storage;



    public Computer(Storage storage) {
        this.processor = new Processor(processor.getBrand(), processor.getModel());
        this.memory = new Memory(memory.getBrand(), memory.getModel() );
        this.storage = storage;
    }

    public static void main(String[] args) {


        Processor processor = new Processor("Intel® Core™", "i9-14900KF");

        Memory memory = new Memory("Kingston", "RAM FURY Renegade Pro");

        Storage storage = new Storage("Mushkin ", "Source HC");

        System.out.println("Processor" + processor.toString());
        System.out.println("Memory" + memory.toString());
        System.out.println("Storage" + storage.toString());


    }
}
