package homework_20.task_02;

public class Cat extends Animals {
    private int weight;

    public Cat(String name, int age, int weight) {
        super(name, age);
        this.weight = weight;
    }

    public String toString() {
        return "Cat: " + getName() + ", Age: " + getAge() + ", Weight: " + weight + " kg";
    }


    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
