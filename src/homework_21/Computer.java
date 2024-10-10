package homework_21;

public class Computer {
    private Processor processor; // Композиция
    private Memory memory; // Композиция
    private Storage storage; // Агрегация


    public Computer(Storage storage) {
        this.storage = storage;
        this.processor = new Processor("Intel Core", "i5-12400F");
        this.memory = new Memory("brandA", "model01");
    }
}
