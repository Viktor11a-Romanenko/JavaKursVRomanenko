package lesson_06;

import java.util.Random;

public class BooleanExample {
    public static void main(String[] args) {

        boolean bol1 = true;
        bol1 = false;
        int x = 10;
        int y = 5;

        // Сравнение на равенство " == "
        boolean b1 = x == y; // Х равен Y => false
        System.out.println(x + " == " + y + " => " + b1);

        //Не равенство " != "
        b1 = x != y;
        System.out.println(x + " != " + y + " => " + b1);

        //Больше " > "
        b1 = x > y;
        System.out.println(x + " > " + y + " => " + b1);

        y = 10;
        b1 = x > y;
        System.out.println(x + " > " + y + " => " + b1);

        // Больше или равно " >= "
        b1 = x >= y;
        System.out.println(x + " >= " + y + " => " + b1);

        // Меньше " < "
        x = 7;
        b1 = x < y;
        System.out.println(x + " < " + y + " => " + b1);

        // Больше или равно " <= "
        b1 = x <= y;
        System.out.println(x + " <= " + y + " => " + b1);

       /* b1 = true != false;
        System.out.println(b1);
        */
        String str = "java is the best";
        boolean contains = str.contains("Java");//
        System.out.println("str.contains(\"Java\"): " + contains);

        System.out.println("================= \n ");

        //Логическое НЕ (отрицания, NOT)
        boolean b2;
        b2 = !false; //Меняет значение нa противоположное
        System.out.println("!false: " + b2);

        b2 = !(4 == 5);
        System.out.println("!(4 == 5): " + b2);

        // Логическое И (AND) "&"
        /*

         */

        b2 = true & true;
        System.out.println("true & true: " + b2);

        b2 = (2 < 5) & (11 == 10);//
        System.out.println("(2 < 5) & (11 == 10): " + b2);

        //
        int x1 = 50;
        boolean b3 = x1 > 0 & x1 < 100;//
        System.out.println("x1 > 0 & x1 < 100: " + b3);

        // Логическое ИЛИ (OR) "|"

        boolean b4 = true | false;
        System.out.println("true | false: " + b4);
        System.out.println("false | false: " + (false | false));

        //Генерация случайного числа
        Random random = new Random();
        // von 0 bis x
        int rand = random.nextInt(100); //
        System.out.println("Rand:" + rand);

        boolean isEven = rand % 2 == 0;
        boolean isGood = (rand % 2 == 0) | (rand % 5 == 0);
        System.out.println("isEven: " + isEven);
        System.out.println("isGood: " + isGood);

        // Логическое исключающее ИЛИ (XOR) " ^ "
        boolean b5 = true ^ false;
        System.out.println("true ^ false: " + b5);
        b5 = false ^ true;
        System.out.println("false ^ true: " + b5);
        b5 = false ^ false;
        System.out.println("false ^ false: " + b5);

        System.out.println("================= \n ");

        // Условное И (сокращенноe логическое И) "&&"
        boolean b6 = true && false;
        System.out.println("true && false: " + b6);
        b6 = false && false;
        System.out.println("false && false: " + b6);
        b6 = (2 > 5) && (11 == 11);
        System.out.println("(2 > 5) && (11 == 11): " + b6);

        int a = 10;
        int b = 0;

        boolean b7 = (b != 0) && (a / b > 2);
        System.out.println("(a / b > 2): " + b7);

        //Условное ИЛИ (сокращенноe логическое ИЛИ) "||"
        boolean b8 = true || (a / b > 2);
        System.out.println("b8: " + b8);

        System.out.println("================= \n ");

        // Приоритеты
        /*
        1. !
        2. &
        3. ^
        4. |
        5. &&
        6. ||
         */

        System.out.println(true ^ true & false);
        //
        System.out.println(true ^ false);
        //
        System.out.println(true);

        System.out.println(true ^ true && false);
        //
        System.out.println(false && false);
        //
        System.out.println(false);

    }
}
