package lesson_03;

public class Variables {

    public static void main(String[] args) {

        int myFirstVariable;
        myFirstVariable = 1;

        int mySecondVariable = 25;
        System.out.println(mySecondVariable);

        mySecondVariable = 50;
        System.out.println("Значение переменной: " + mySecondVariable);

        byte byteVariable = 125;
        byteVariable = 45;
        System.out.println("Значение переменной byteVariable: " + byteVariable);

        short shortVar;
        shortVar = 31000;
        System.out.println("Short value " + shortVar);

        long longVar = 2_100_000_000_000_000_000L;
        System.out.println("Long variable: " + longVar);

        double doubleVar = 10.5421;
        System.out.println("Double variable: " + doubleVar);

        float flaotVar = 11.65F;
        System.out.println("Float variable: " + flaotVar);


    }
}
