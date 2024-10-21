package homework_23.task_01;

public abstract class Shape {
    protected String type;

    public Shape(String type) {
        this.type = "Shape";
    }

    public abstract double area();

    public abstract double perimeter();

    public String toString() {
        return type + " area: " + area() + ", perimeter: " + perimeter();

    }
}
