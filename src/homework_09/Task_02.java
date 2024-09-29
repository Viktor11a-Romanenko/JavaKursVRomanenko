package homework_09;

public class Task_02 {
    public static void main(String[] args) {
        var2(3);

    }//main

    public static void var2(int a) {
        int result = 1;
        int base = 2;

        for (int i = 0; i < a; i++) {
            result *= base;

        }
        System.out.println(result);

    }

}// end
