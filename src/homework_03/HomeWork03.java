package homework_03;

public class HomeWork03 {
    public static void main(String[] args) {

        //Task 1
        /*
        Task 1
        В классе HomeWork03 задекларировать (объявить) и присвоить значения 3-м переменным. Правильно подберите тип и имя переменным.
        Переменная 1 - сколько Вам полных лет
        Переменная 2 - должна хранить стоимость 1 литра молока в Вашей стране (без наименования валюты - только цена)
        Переменная 3 - Ваше имя (Опционально, так как мы с вами не учили, в каком типе данных хранить можно хранить текст. (Гугл?))
         */

        int years = 22;
        double milk = 1.4;
        String name = "Viktoriia";

        System.out.println("Мне полных лет: " + years);
        System.out.println("Цена 1 литра молока: " +  milk);
        System.out.println("Моё имя: " + name);

        //Task 2

        /*
        Task 2
        Объявите 4 переменных типа int со значениями 0, 1, 2, 3.
        Объявите ещё одну переменную int и сохраните в неё сумму этих переменных, деленную на 4. Получается, у вас будет среднее арифметическое этих чисел в одной переменной.
        Выведите на экран значение переменной.
        Сколько программа отбросила в дробной части?
         */

        int number0 = 0;
        int number1 = 1;
        int number2 = 2;
        int number3 = 3;
        int total = (number0 + number1 + number2 + number3 )/ 4;

        System.out.println("Cреднее арифметическое: " + total );

        int rest = (number0 + number1+ number2 + number3) % 4;

        System.out.println("Остаток от деления: " + rest );

        //Task 3
        /*
        Task 3 * (Опционально)
        Пусть цена товара A составляет 1000 Euro, а товара B составляет 500 Euro.
        Если клиент покупает товары вместе, то на них действует скидка 10% на всю покупку.
        Выведите на экран значение переменной, которая соответствует стоимости товаров A+B со скидкой.
        Отдельно выведите на экран сумму скидки для этой покупки (в деньгах).
         */

        double product1 = 1000;
        double product2 = 500;
        double discount = 10;
        double totalMitDiscount = (product1 + product2 ) * discount / 100;

        System.out.println("Cтоимости товаров со скидкой: " + totalMitDiscount);

        double totalDiscount = (product1 + product2 ) - totalMitDiscount;

        System.out.println("Cумму скидки для этой покупки (в деньгах): " + totalDiscount);

        // Task 3
        /*
        Task 3 * (Опционально)
        Найдите в Интернете данные по температуре в вашем городе за прошедшую неделю (или придумайте :) ).
        Вычислите среднюю температуру за неделю и выведете ее на печать.
         */

        int day1 = 22;
        int day2 = 19;
        int day3 = 18;
        int day4 = 15;
        int day5 = 15;
        int day6 = 16;
        int day7 = 17;
        int totalDay = (day1 + day2 + day3 + day4 + day5 + day6 + day7) / 7;


        System.out.println("Cреднее арифметическое: " + totalDay);

        // lesson 4









    }
}
