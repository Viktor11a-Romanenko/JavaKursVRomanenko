package homework_22.task_01;

public class Professional extends Human {

    public Professional(String name) {
        super(name);
    }

    @Override
    public void rest() {
        System.out.println(name + " needs 5 minutes to rest.");
    }

    @Override
    public void run() {
        System.out.println(name + " is running at a speed of 25 km/h.");
        rest();
    }
}
