package lesson_07;

public class SwitchExample {
    public static void main(String[] args) {

        int x = 5;

        if (x == 5) {
            System.out.println("if: x = 5");
        } else if (x == 7) {
            System.out.println("if: x = 7");
        } else {
            System.out.println("else");
        }


        switch (x) {
            case 5:
                System.out.println("switch: x = 5");
                break;
            case 7:
                System.out.println("switch: x = 7");
                break;
            default:
                System.out.println("default");
        }


        System.out.println("Строка за пределами Switch");


    }
}
