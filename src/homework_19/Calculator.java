package homework_19;

public class Calculator {

    public static final double PI = 3.141519;


    public static double plus(double a, double b) {
        return a + b;

    }

    public static double minus(double a, double b) {
        return a - b;
    }

    public static double multiplication(double a, double b) {
        return a * b;
    }

    public static double division(double a, double b) {
        if (b == 0) {
            System.out.println("error");
        }
        return a / b;
    }

    public static double length(final double PI, double r) {
        return 2 * PI * r;

    }

    public static double area(final double PI, double r) {
        return PI * Math.pow(r, 2);


    }
}
