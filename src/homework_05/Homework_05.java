package homework_05;

import java.util.Scanner;

public class Homework_05 {
    public static void main(String[] args) {
        /*
        Task 1
        Напишите программу, которая будет просить у пользователя ввести его имя с клавиатуры.
        Используя Scanner, сохраните имя в переменную типа String.
        Выведите на экран количество символов в имени пользователя.
        Создайте две переменные типа char: одна должна хранить первый символ имени, другая — последний.
        Выведите на экран десятичный код (код символа в десятичной системе счисления) первого и последнего символа имени
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше имя: ");
        String name = scanner.nextLine();

        int length = name.length();
        System.out.println("Length: " + length);

        char firstChar = name.charAt(0);
        char lastChar = name.charAt(name.length() - 1);
        System.out.println("firstChar: " + firstChar);
        System.out.println("lastChar: " + lastChar);
        //scanner.close();// нo если знаю что дальше нужен сканер, то не ставить!!!!

        /*Task 2
        Создайте строки:
        "Java" "is" "a" "powerful" "language"
        Склейте эти строки двумя разными способами, чтобы получить строку: "Java is a powerful language".
        Выведите на экран получившуюся строку и её длину.
         */

        String id = "Java";
        String id1 = "is";
        String id2 = "a";
        String id3 = "powerful";
        String id4 = "language";
        // var1
        String var1 = id.concat(" ").concat(id1).concat(" ").concat(id2).concat(" ").concat(id3).concat(" ").concat(id4);
        int lenghtVar1 = var1.length();
        //var2
        String var2 = String.join(" ", id, id1, id2, id3, "language");
        int lenghtVar2 = var2.length();

        System.out.println("var1: " + var1);
        System.out.println("lenghtVar1: " + lenghtVar1);

        System.out.println("var2: " + var2);
        System.out.println("lenghtVar2: " + lenghtVar2);
        /*
        Task 2.2 * (Опционально)
        Замените в результирующей строке слово "powerful" на "super".
        Создайте переменную типа boolean с ответом на вопрос: содержит ли строка подстроку "age"?
        Выведите на экран значение этой переменной
         */

        String update = var2.replace("powerful", "super");


        boolean answer = var1.contains("age");

        System.out.println("update: " + update);
        System.out.println("Boolean: " + answer);

        /*Проблема
        Task 3* (Опционально)
        Попросите пользователя ввести строку чётной длины с клавиатуры.
        Распечатайте два средних символа строки.
        Например:
        Для строки "string" результат будет "ri".
        Для строки "code" результат будет "od".
        Для строки "Practice" результат будет "ct".
         */

        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Введите строки");
        String string1 = scanner.nextLine();

        int indexMiddle = string1.length() / 2 - 1;

        char first = string1.charAt(indexMiddle);
        char second = string1.charAt(indexMiddle + 1);

        System.out.println(first);
        System.out.println(second);

        String subStr = string1.substring(indexMiddle + 2);
        System.out.println(subStr);


    }
}
