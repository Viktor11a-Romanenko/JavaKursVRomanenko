package lesson_18;

public class CarApp {
    public static void main(String[] args) {

        System.out.println("================= \n ");

        Car car = new Car("BMW", 200);
        System.out.println(car.toString());

        Car car2 = new Car("VW", 300);
        System.out.println(car2.toString());

        System.out.println(car.toString());

        System.out.println("static var: " + Car.totalCarProduced);
        //
        Car.testStatic();

        //
        int sum = MathUtils.sumOfInts(25, 10);
        System.out.println("sum: " + sum);


    }
}
