package homework_20;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle("Rectangle", 5, 10);
        Circle circle = new Circle("Circle", 5);

        rectangle.setDimensions(12, 15);
        circle.setRadius(15);

        rectangle.setName("MyRectangle");
        circle.setName("MyCircle");

        rectangle.displayInfo();
        circle.displayInfo();
        System.out.println(rectangle.calculateArea());
        System.out.println(circle.calculateArea());
    }
}
