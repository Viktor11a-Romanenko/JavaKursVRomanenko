package lesson_04;

public class IncrementExample {
    public static void main(String[] args) {

        int var = 5;
        var = var + 5;
        System.out.println("var: " + var);
        var += 5; //
        System.out.println("var+: " + var);

        var -= 2;
        System.out.println("var-: " + var);

        var *= 2;
        System.out.println("var*: " + var);

        var /= 2;
        System.out.println("var/: " + var);

        // Инкремент
        var++;// => var += 1; => var = var + 1
        System.out.println("var++: " + var);

        // Декремент
        var--;// => var -= 1; => var = var -1
        System.out.println("var--: " + var);

        System.out.println("=========== \n");

        int x = 100;
        System.out.println("x1: " + x++);
        System.out.println("x2: " + x);

        int y = 100;
        System.out.println("y1: " + ++y);
        System.out.println("y2: " + y);


    }
}
