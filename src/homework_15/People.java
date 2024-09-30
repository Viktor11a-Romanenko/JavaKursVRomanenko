package homework_15;

public class People {
    String name;
    String work;
    int age;


    public People() {

    }

    public People(String name, String work, int age) {
        this.name = name;
        this.work = work;
        this.age = age;


    }

    public void whoAmI() {
        System.out.printf("Меня зовут %s, я работаю: %s, мой возраст: %d\n", name, work, age);
    }


}//end