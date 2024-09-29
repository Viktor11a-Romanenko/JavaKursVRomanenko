package lesson_05;

import java.util.Scanner;

public class ScannerExmaple {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ваше имя: ");

        String name = scanner.nextLine();

        System.out.println("name." + name);


        //
        System.out.println("Введите ваш возраст");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Введите ваш рост в см");


        double height = scanner.nextDouble();
        scanner.nextLine();


        System.out.println("age: " + age);
        System.out.println("height: " + height);
        //


    }
}
