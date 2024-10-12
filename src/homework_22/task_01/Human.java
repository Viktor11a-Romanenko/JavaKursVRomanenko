package homework_22.task_01;

public class Human {
    protected String name; //ошибку выдоло, если переменная privat. Почему?

    public Human(String name) {
        this.name = name;
    }

    public void rest() {
        System.out.println(name + " needs 15 minutes to rest.");
    }

    public void run() {
        System.out.println(name + " is running at a speed of 10 km/h.");
        rest();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
