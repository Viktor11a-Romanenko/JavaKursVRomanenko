package lesson_08;

public class WhileLoop {
    public static void main(String[] args) {

        /*


         */

        int number = 1;

        while (number <= 5) { //
            System.out.println(number);
            number++;
        }

        System.out.println("Цикл закончен.");

        System.out.println("================= \n ");
        /* Бесконечный цикл
        int y = 5;
        while (y < 10){
            System.out.println();
        }
         */
        int v = 100;
        while (v >= 90) {
            System.out.println(v);
            v--;
        }
        System.out.println("================= \n ");
        /*

         */
        int i = 1;
        int sum = 0;
        while (i <= 100) {
            sum += i;
            i++;
        }
        System.out.println("Суммы чисел от 1 до 100: " + sum);

        System.out.println("================= \n ");

        int s = 1;
        while (s <= 21) {
            if (s % 2 == 0) ;
            System.out.println(s);
            s++;
        }
        System.out.println("================= \n ");

        String str = "Hello!";
        i = 0;
        while (i <= str.length() - 1) {
            char ch = str.charAt(i);
            System.out.println(ch);
            i++;
        }


    }
}