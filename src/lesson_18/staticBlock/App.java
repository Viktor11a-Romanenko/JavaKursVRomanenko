package lesson_18.staticBlock;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        System.out.println("counter: " + InitExample.counter);
        System.out.println(Arrays.toString(InitExample.colors));
        System.out.println("================= \n ");

        InitExample initObject = new InitExample();
        System.out.println("================= \n ");
        System.out.println(initObject.toString());
        System.out.println(Arrays.toString(InitExample.colors));


    }
}
