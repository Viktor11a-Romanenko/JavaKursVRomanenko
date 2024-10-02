package lesson_17;

public class CatApp {
    public static void main(String[] args) {
        Cat17 cat = new Cat17("Catty", 8, 5);

        cat.sayMeow();
        System.out.println(cat.toString());

        //cat.age = -1000; privat
        //cat.weight = 1500; privat
        //cat.name = null; privat

        String name = cat.getName();
        System.out.println("Name: " + name);
        System.out.println("Age: " + cat.getAge());
        System.out.println("Weight: " + cat.getWeight());
        cat.setAge(25);
        System.out.println("================= \n ");
        System.out.println(cat.toString());

    }
}
