package lesson_15;

public class MainCats {
    public static void main(String[] args) {

        Cat cat = new Cat(); //Создаю новый объект класса cat
        //1.

        cat.sayMeow();
        cat.run();
        cat.sleep();
        /*

         */

        String catName = cat.name;
        System.out.println("Name: " + catName);

        int catAge = cat.age;
        System.out.println("Age: " + cat.age);

        Cat cat1 = new Cat("Max");

        System.out.println("Color: " + cat1.color);
        System.out.println("Name: " + cat1.name);
        System.out.println("================= \n ");

        Cat cat2 = new Cat("Diamond", "red");

        cat2.whoAmI();

        System.out.println("=====================\n");
        Cat barsik = new Cat("Barsik", "white", 2);
        barsik.whoAmI();


    } //main
} //end
