package lesson_22.animals;

import java.util.concurrent.Callable;

public class CastingExample {
    public static void main(String[] args) {
        //
        Animal animal = new Cat(); //тип Cat автоматически преобразуется к типу Animal
        animal.voice();
        Dog dog = new Dog();
        Animal animal2 = dog;//
        Animal animal3 = new Hamster();

        //


        System.out.println("\n================= \n ");
        Animal[] animals = new Animal[3];
        animals[0] = animal;
        animals[1] = animal2;
        animals[2] = animal3;

        for (int i = 0; i < animals.length; i++) {
            animals[i].voice();
        }

        int i1 = 100;
        double d1 = i1;
        System.out.println(d1);

        Cat catLink;
        Animal animalLink = new Cat();
        catLink = (Cat) animalLink; //

        System.out.println("\n================= \n ");

        for (int i = 0; i < animals.length; i++) {
            System.out.println("animals: " + animals[i]);

            System.out.println(animals[i].getClass() + " instanceof Cat: " + (animals[i] instanceof Cat));
            Animal current = animals[i];
            if (animals[i] instanceof Cat) {
                System.out.println(i + " can");
                Cat tempCat = (Cat) current;
                tempCat.eat();
            }
            System.out.println("===================\n");

        }


    }
}
