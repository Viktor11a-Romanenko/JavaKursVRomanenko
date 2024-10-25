package lesson_31.enums;

import java.util.concurrent.Callable;

public class AutoApp {
    public static void main(String[] args) {
        Color color = Color.RED;
        System.out.println(color);
        Auto auto = new Auto("Model1", Color.BLUE);
        System.out.println(auto);

        auto.setColor(color);
        System.out.println(auto);
        System.out.println("\n================= \n ");

        //1.
        Color[] colors = Color.values();//
        for (Color currentColor : colors) {
            System.out.println(currentColor);
        }
        System.out.println("\n================= \n ");

        //2.
        Color color1 = Color.valueOf("RED");
        System.out.println(color1);
        System.out.println("\n================= \n ");

        //3.
        String name = Color.RED.name();
        System.out.println(name);
        System.out.println("\n================= \n ");

        //4.
        int ordinl = Color.GREEN.ordinal();
        System.out.println("ordinl: " + ordinl);

        //5.
        if (auto.getColor() == Color.GREEN) {
            System.out.println("Color is Green");
        } else {
            System.out.println("Not green");
        }
        System.out.println("\n======= switch ========== \n ");

        //6.
        switch (color) {
            case RED:
                System.out.println("Red");
                break;
            case GREEN:
                System.out.println("Green");
                break;
            case BLUE:
                System.out.println("Blue");
                break;
            default:
                System.out.println("Другой цвет!");

        }

        // 7.


    }

}
