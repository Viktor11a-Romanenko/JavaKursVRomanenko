package lesson_05;

public class StringExample {
    public static void main(String[] args) {

        String string = "Java"; //Объявление и иницализация переменной типа String
        String string1 = new String("Hello"); //Тоже создание новой строки но не рекоменд.
        System.out.println(string);

        // 1. Получить количество символов в строке (длина сторки)
        int length = string.length();
        System.out.println("Length: " + length);

        //2. Метод позволяет перевести все символы строки в верхний регистр => "toUpperCase"
        System.out.println(string.toUpperCase());
        System.out.println("String; " + string);

        // String являеться неизменной (immutable)!!!!!!
        // Если я хочу сохранить результат работы метода то я должен сохранить его в какую-то переменную
        String stringUpper = string.toUpperCase();

        System.out.println("stringUpper: " + stringUpper);
        System.out.println("string: " + string);

        //3.Метод позволяет перевести все символы строки в нижний регистр => "toLowerCase"
        // Результат работы мы можем сохранить и в ту же самую переменную, переписав ее значение
        stringUpper = stringUpper.toLowerCase();
        System.out.println("stringUpper: " + stringUpper);

        System.out.println("================= \n ");

        String str1 = "One";
        String str2 = " ";
        String str3 = "hello";

        // Различные варианты конкатенации (склеивания и обьединения) строк

        //4.Конкатенация
        String concatStr = str1 + str2 + str3;
        System.out.println("concatStr: " + concatStr);

        // Конкатенация vs мат. операции сложения
        System.out.println(1 + 3);

        // 1 + 3 = сложения 4 + " : " = потом конкатенация => 4 : после знака (строки) все будет слитно, тоесть в строку либо в символ: 4 : 23
        System.out.println(1 + 3 + " : " + 2 + 3);
        // если пишем после символа конкатенации + " : "  значение в () та будет работать мат.операция( например)
        System.out.println(1 + 3 + " : " + (2 + 3));

        //Конкатенация 2
        String concatStr2 = str1.concat(str2);
        concatStr2 = concatStr2.concat(str3);
        System.out.println("concatStr2: " + concatStr2);

        // Цепочка методов
        String concatStr3 = str1.concat(str2).concat(str3).concat("!");
        System.out.println("concatStr3: " + concatStr3);

        // Конкатенация 3
        // "One", "hello", "java" => "One hello Java"
        String concatStr4 = str1 + "" + str3 + "" + "Java";
        System.out.println("concatStr4: " + concatStr4);
        concatStr4 = String.join("---", str1, str3, "java");
        System.out.println("concantStr4: " + concatStr4);

        //
        int id = 1;
        int id2 = 2;
        String string2 = "Hello" + id + id2;
        System.out.println("string2: " + string2);

        //
        string2 = "Hello" + (id + id2);
        System.out.println("string2: " + string2);

        System.out.println("================= \n ");

        //
        String digits = "0123456789";
        System.out.println("digits.lenght: " + digits.length()); //

        //
        char firstChar = digits.charAt(0);
        char lastChar = digits.charAt(digits.length() - 1);
        System.out.println("firstChar: " + firstChar);
        System.out.println(digits.charAt(4));


        //
        String subString = digits.substring(2);
        System.out.println("subString: " + subString);
        System.out.println("digits: " + digits);

        System.out.println("================= \n ");
        String subString2 = digits.substring(2, 7);
        System.out.println("subString2: " + subString2);


    }
}
