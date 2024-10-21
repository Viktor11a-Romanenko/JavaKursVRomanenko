package homework_23.task_01;

public class Rectangle extends Shape {
    private double sideA;
    private double sideB;

    public Rectangle(String type, double sideA, double sideB) {
        super(type);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double area() {
        return sideA * sideB;
    }

    @Override
    public double perimeter() {
        return (sideA * sideB) * 2;
    }
}
