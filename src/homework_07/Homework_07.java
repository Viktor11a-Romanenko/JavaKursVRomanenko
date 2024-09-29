package homework_07;

import java.util.Random;
import java.util.Scanner;

public class Homework_07 {
    public static void main(String[] args) {
        /*
        Task 1
        Необходимо написать программу, которая предлагает пользователю ввести число на выбор: 1, 2 или 3.
        Программа должна сказать, какое число ввёл пользователь: Один, Два, или Три (текстом)
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число  на выбор: 1, 2 или 3 ");
        int number = scanner.nextInt();
        scanner.nextLine();
        if (number == 1) {
            System.out.println("Один");
        }
        if (number == 2) {
            System.out.println("Два");
        } else if (number == 3) {
            System.out.println("Три");

        }

        /*
        Task 2
        Запишите в 4 переменные случайные числа от 0 до 100.
        Выведите все 4 числа на экран.
        Программа должна определить максимальное из этих четырех чисел и вывести результат на экран.
         */
        Random random = new Random();
        int v1 = random.nextInt(100);
        int v2 = random.nextInt(100);
        int v3 = random.nextInt(100);
        int v4 = random.nextInt(100);
        System.out.println("Output: " + v1 + " | " + v2 + " | " + v3 + " | " + v4);

        int max = v1;
        if (v2 > max) {
            max = v2;
        }
        if (v3 > max) max = v3;
        if (v4 > max) max = v4;

        System.out.println("Максимальное число: " + max);

        /*
       Task 4
       Напишите программу с использованием оператора switch:
       Программа просит пользователя ввести число от 1 до 7. Если число равно 1, выводим на консоль "Понедельник", 2 — "Вторник" и так далее. Если 6 или 7 — "Выходной".
         */
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите число от 1 до 7");
        int y = scanner1.nextInt();
        scanner1.nextLine();

        switch (y) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Выходной");
                break;
            case 7:
                System.out.println("Выходной");
                break;


        }


    }


}
