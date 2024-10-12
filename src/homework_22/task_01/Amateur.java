package homework_22.task_01;

public class Amateur extends Human {

    public Amateur(String name) {
        super(name);
    }

    @Override
    public void rest() {
        System.out.println(name + " needs 10 minutes to rest.");
    }

    @Override
    public void run() {
        System.out.println(name + " is running at a speed of 15 km/h.");
        rest();
    }
}
