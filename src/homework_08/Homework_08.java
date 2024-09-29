package homework_08;

import java.util.Random;
import java.util.Scanner;

public class Homework_08 {
    public static void main(String[] args) {
        /*
        Task 1
        Найдите произведение всех чисел от 1 до 15 включительно.
        Результат выведите на экран
         */
        int number = 1;
        int x = 1;
        while (x <= 15) {
            x++;
            number *= x;

        }
        System.out.println(number);
        System.out.println("================= \n ");
        /*
        Task 2
        Используйте цикл while для решения задачи:
        Распечатайте 10 строк: "Task1", "Task2", ..., "Task10".
         */

        int i = 1;
        while (i <= 10) {
            System.out.println("Task " + i);
            i++;
        }
        System.out.println("================= \n ");
        /*
        Task 3
        Используйте цикл while для решения задачи:
        Распечатайте все числа от 1 до 100, которые делятся на 5 без остатка.
        */
        int a = 1;
        while (a <= 100) {
            if (a % 5 == 0) {
                System.out.println(a);

            }
            a++;

        }



        /*
        Не уверна

        Программа запрашивает у пользователя ввод произвольного числа.
        Вывести сумму цифр этого числа.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите произвольное число");
        int number1 = scanner.nextInt();
        scanner.nextLine();
        int sum = 0;

        while (number1 > 0) {
            sum += number1 % 10;
            number1 /= 10;

        }
        System.out.println("Сумма цифр этого числа: " + sum);

         */


    }
}
