package homework_24.task_01;

public class App {
    public static void main(String[] args) {
        Triathlete triathlete = new Triathlete("John");
        System.out.println(triathlete);
        triathlete.run();
        triathlete.swim();
    }
}
