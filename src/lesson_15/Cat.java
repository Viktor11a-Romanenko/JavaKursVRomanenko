package lesson_15;

public class Cat {
    String name; //поле класса с конкретным обозначение
    String color;//поле класса с конкретным обозначение
    int age;//поле класса с конкретным обозначение

    //Конструктор класса
    /*

     */

    public Cat(String catName) {
        name = catName;
    }

    //
    public Cat() {

    }

    public Cat(String catName, String color) {
        name = catName;
        this.color = color;//
    }

    public void whoAmI() {
        System.out.printf("Я котик %s, мой возраст: %d, мой окрас: %s\n", name, age, color);
    }

    public Cat(String name, String color, int age) {
        this(name, color);// всегда должна быть первой строкой вызова в методе
        //  this.name = name;
        // this.color = color;
        this.age = age;

    }


    public void sleep() {
        System.out.println("Я сплю!");
    }

    public void run() {
        System.out.println("Я бегу!");
    }

    public void sayMeow() {
        System.out.println("Meow!");
    }

}
