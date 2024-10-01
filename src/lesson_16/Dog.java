package lesson_16;

public class Dog {
    String name;
    int weight;


    public Dog(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    String info() {
        return "I am dog " + name + ", my weight is " + weight;
    }

    void eat() {
        System.out.println("Я кушаю, ням-ням!");
        weight++;
    }

    void run() {
        while (weight < 3) {
            System.out.println("Сорян! Я слишком худая и голодна! Бежать не могу!");
            System.out.println("Надо поесть. Мой вес сейчас: " + weight);

            eat();
        }
        System.out.println("Я бегу!");
        weight -= 2;
        System.out.println("Вес после пробешки: " + weight);
        System.out.println("================= \n ");
    }
    
}//end
