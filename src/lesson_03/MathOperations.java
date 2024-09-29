package lesson_03;

public class MathOperations {
    public static void main(String[] args) {

        int var1 = 20;
        int var2 = 7;

        int result;
        //Сложение + :
        // result = var1 + var2: 20 + 7=27 und 27 => result
        result = var1 + var2;
         // Результат вычисления выражения в правой части (от знака =) присваивает в переменную в левой части
        System.out.println("result: " + result);

        result = 15 + 6;
        System.out.println("result: " + result);


        result = var1 + 5;
        System.out.println("result: " + result);

        result = result + 5;
        System.out.println("result: " + result);

        //Вычитание - :
        //result = var1 - var 2
        result = var1 - var2;
        System.out.println("result - : " + result);

        // Умножение *
        // result = var1  var2
        result = var1  + var2;
        System.out.println("result * : " + result);

        // x = 1 + 2 * 5; => 5
        /*
        0. Скобки
        1.Умножение, деление, взятие остатка
        2. Сложение вычитание
         */
        result = (1 +2) * 2;
        System.out.println("result 1 + 2 * 2 : " + result);

        // Целочисленное деление
        // 20/7 => 2 целых и остаток 6; => 20 - 7 => 13 - 7 => 6
        result= var1 / var2; // 2.79999
        System.out.println("result /:  " + result);

        System.out.println("16 / 5: " + 16/5); // 3 целых + 1 остаток

        // % остаток от деления %
        System.out.println("Целочисное деление 4/ 2 :" + ( 4 / 2)); // 2
        System.out.println("остаток от деления деление 4 % 2: " + ( 4 % 2)); // 0

        System.out.println("( 5 / 10) = " + (5 / 10));
        System.out.println("( 5 % 10) = " + (5 % 10));

        // 28 / 10 => 2 целых и 8 остаток => 2 * 10 + 8
        System.out.println("28 / 10 = " + 28 / 10);
        System.out.println("28 % 10 =  " + 28 % 10);

        System.out.println("====================== \n ");

        double doubleVar1 = 20.0;
        double doubleVar2 = 7.0;
        double resultD = doubleVar1 / doubleVar2;
        System.out.println("resultD: " + resultD);
        

    }
}
