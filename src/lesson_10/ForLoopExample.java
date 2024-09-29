package lesson_10;

import java.util.Random;

public class ForLoopExample {
    public static void main(String[] args) {
        /*
        for ( <Блок инициализации>; <Блок проверок> ; <Блок изменений> ) {
        тело цикла
        }
         */
        //Вывести все числа от 0 до 10
        int j = 0;
        while (j <= 10) {
            System.out.print(j + " ");
            j++;
        }
        System.out.println("\nEnd while loop " + j);

        for (int i = 0; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\nEnd for loop ");
        System.out.println("================= \n ");
        /* Бесконечный цикл
        for ( ; ; ) {
        System.out.println("Hello world");
        }
         */

        for (j = 0; j <= 0; j = j + 10) {
            System.out.print(j + " ");
        }
        System.out.println("\nEnd for loop ");
        for (String str = "Hello"; str.length() < 10; str += "$") {
            System.out.print(str + " ");
        }
        System.out.println("\nEnd for loop ");
        System.out.println("================= \n ");
        //
        int k = 14;
        for (int a = 0, f = 1; k >= 0 && f < 10; k--, a = ++a + k, f++) {
            System.out.println(k + " : " + a + " : " + f);
        }
        System.out.println("================= \n ");

        //

        Random random = new Random();
        int[] ints = new int[random.nextInt(11) + 5];
        System.out.println("Длина массива: " + ints.length);
        System.out.print("[");
        for (int i = 0; i < ints.length; i++) {
            ints[i] = random.nextInt(101) - 50;//
            System.out.print(ints[i] + (i < ints.length - 1 ? " , " : " ]\n"));
        }

        System.out.println("================= \n ");
        for (int i = 1; i < 7; i++) {
            if (i == 3) continue;
            System.out.print(i + ", ");
        }
        System.out.println("\n================= \n ");

        for (int i = 1; i < 7; i++) {
            if (i == 3) break;
            System.out.print(i + ", ");

        }
        System.out.println("\n================= \n ");

        int y = 1;
        while (y < 7) {
            if (y == 3) {
                y++;
                break;
            }
            y++;
            System.out.print(y + ", ");
        }
        System.out.println("\n================= \n ");

    }//main
}//end
