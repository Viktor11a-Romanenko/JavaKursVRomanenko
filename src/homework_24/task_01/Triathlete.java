package homework_24.task_01;

public class Triathlete implements Swimmer, Runner {
    private String name;

    public Triathlete(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + " is running");
    }

    @Override
    public void swim() {
        System.out.println(name + " is swimming");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Triathlete { " +
                "name ='" + name + '\'' +
                '}';


    }
}