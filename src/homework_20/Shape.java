package homework_20;

public class Shape {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Shape(String name) {
        this.name = name;
    }

    public void displayInfo() {
        System.out.println("Name:" + this.name);
    }
}
