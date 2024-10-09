package homework_06;

import java.util.Random;
import java.util.Scanner;

public class Homework_06 {
    public static void main(String[] args) {

        /*
        Task 1
        Дан текст Programming is fun.
        Напишите программу, которая проверяет, содержит ли эта строка слово “fun”, и выведите результат в виде булевой переменной.
         */
        String string = "Programming is fun";
        boolean fun = string.contains("fun");
        System.out.println("Task1: " + fun);

        /*
        Task 2
        Создайте две переменные типа int.
        В первую переменную запишите случайное значение от 0 до 50.
        Во вторую переменную случайное значение от 0 до 100.
        (опционально) Во вторую переменную случайное значение от -20 до 30.
        Проверьте:
        - равны ли переменные,
        - не равны ли они,
        - больше ли a, чем b,
        - меньше ли b, чем a.
        Выведите результат на экран.
         */
        Random random = new Random();
        int x = random.nextInt(50);
        int y = random.nextInt(100);

        boolean b1 = x == y;
        boolean b2 = x != y;
        boolean b3 = x > y;
        boolean b4 = y < x;
        System.out.println("Равны ли переменные: " + b1);
        System.out.println("Не равны ли: " + b2);
        System.out.println("Больше ли a, чем b: " + b3);
        System.out.println("Меньше ли b, чем a: " + b4);

        /*
        Task 3
        Попросите пользователя ввести целое число с клавиатуры.
        Ваша программа должна вывести строку в формате:
        Число: 6 четное: true; кратно 3: true; четное и кратное 3: true
        Число: 3 четное: false; кратно 3: true; четное и кратное 3: false
            Проверьте работу вашей программы, вводя разные числа. Убедитесь в правильности выдаваемой строки
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число");
        int number = scanner.nextInt();

        boolean x1 = number % 2 == 0;
        boolean x2 = number % 3 == 0;
        boolean x3 = x1 && x2;

        String concat = "Число" + " " + number + " " + "четное: " + x1 + "; " + "кратное 3: " + x2 + " ; " + " четное и кратное 3 " + x3;
        System.out.println(concat);


        /*
        Task 4
         */

        int a = 8;
        int b = 3;
        boolean result;


        result = (a + b) > 10;
        System.out.println("Result 1: " + result);// true

        result = (a - b) == 5;
        System.out.println("Result 2: " + result); // true

        result = (a * b) != 24;
        System.out.println("Result 3: " + result); // false

        result = (a / b) >= 2;
        System.out.println("Result 4: " + result); // false, но я не уверена

        result = !(a % b == 2);
        System.out.println("Result 5: " + result); //true , но я не уверена

    }
}
