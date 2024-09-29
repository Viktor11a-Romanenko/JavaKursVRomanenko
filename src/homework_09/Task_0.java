package homework_09;

public class Task_0 {
    public static void main(String[] args) {
        /*
        Task 0
        Написать метод, принимающий на вход строку. Метод должен вывести на экран число,
        соответсвующее количеству символов в строке.
        Например: Если в метод пришла строка "hello" - метод должен вывести число 5 (так как в строке hello 5 символов)
         */
        var1("hello");


    } // main

    public static void var1(String input) {

        int length = input.length();
        System.out.println("Количество символов в строке: " + length);
    }//var1


}// end