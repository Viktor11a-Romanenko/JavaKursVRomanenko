package lesson_22.animals;

public class ZooApp {
    public static void main(String[] args) {

        //Object

        Cat cat = new Cat();
        cat.voice();
        System.out.println(cat.toString());
        cat.eat();

        System.out.println("\n================= \n ");

        Dog dog = new Dog();
        dog.voice();
        System.out.println(dog.toString());

        System.out.println("\n================= \n ");

        Hamster hamster = new Hamster();
        hamster.voice();
        System.out.println(hamster.toString());

        System.out.println("\n================= \n ");

        Test test = new Test();

        System.out.println(test.toString());


    }
}
