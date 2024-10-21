package homework_28.task_01;

public class RectangleApp_28 {
    public static void main(String[] args) {
        // task 1
        Rectangle rectangle = new Rectangle();
        Rectangle rectangle1 = new Rectangle(6, 15);
        System.out.println(rectangle.toString());
        System.out.println(rectangle1.toString());

        // task 2
        System.out.println("\n================= \n ");

        Rectangle rect1 = new Rectangle(5.0, 3.0);
        Rectangle rect2 = new Rectangle(5.0, 3.0);
        Rectangle rect3 = new Rectangle(4.0, 2.0);

        System.out.println(rect1.equals(rect2));
        System.out.println(rect1.equals(rect3));


    }
}
