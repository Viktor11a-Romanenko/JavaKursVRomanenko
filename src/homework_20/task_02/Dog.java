package homework_20.task_02;

public class Dog extends Animals {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;

    }

    public String toString() {
        return "Dog: " + getName() + ", Age: " + getAge() + ", Breed: " + breed;
    }


    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
