package homework_23.task_01;

public class ShapeApp {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[3];
        shapes[0] = new Triangle("Triangle", 5, 7, 9);
        shapes[1] = new Circle("Circle", 5.5);
        shapes[2] = new Rectangle("Rectangle", 10, 20);

        double totalArea = 0;
        double totalPerimeter = 0;

        for (int i = 0; i < shapes.length; i++) {
            Shape shape = shapes[i];
            System.out.print(shape.getClass().getSimpleName() + " площадь: " + shape.area());
            System.out.println("; периметр: " + shape.perimeter());

            totalArea += shape.area();
            totalPerimeter += shape.perimeter();
            System.out.println("================\n");
        }

        System.out.printf("Сумма площадей фигур: %.2f\n", totalArea);
        System.out.printf("Сумма периметров фигур: %.2f\n", totalPerimeter);
    }
}
