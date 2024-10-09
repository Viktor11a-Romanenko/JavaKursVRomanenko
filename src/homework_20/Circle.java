package homework_20;

public class Circle extends Shape {

    public static final double PI = 3.14;
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    public double calculateArea() {
        double areaCircle = PI * radius * radius;
        System.out.println("Area of " + this.getName() + ": " + areaCircle);
        return areaCircle;

    }


}
