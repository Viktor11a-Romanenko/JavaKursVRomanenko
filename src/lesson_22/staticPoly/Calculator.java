package lesson_22.staticPoly;

public class Calculator {

    /*
    Статический полиморфизм (компиляционный): реализуется с помощью перегрузки методов.
    Компилятор определяет, какой метод нужно вызывать на основе объявления метода (имя метода и список параметров).
     */

    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        int sum = Calculator.add(15, 29);

    }


}
