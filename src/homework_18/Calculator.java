package homework_18;

public class Calculator {

    private double a;
    private double b;


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
}
