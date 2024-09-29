package lesson_04;

public class TypCharExample {
    public static void main(String[] args) {

        char a = 'A';// Переменная будет хранить букву А латинського алфавита
        char a1 = 65;// Переменная будет хранить букву А латинського алфавита, соответсвующий коду 65 в десятичной системе счисления
        char a2 = 0x41;// Присваиваем число в 16-формате, что соответсвует все той же букве А
        a2 = 0x0041;// Полная форма записи числа в 16 системе счисления
        char a3 = '\u0041';// Еще один способ задать значение в 16 формате


        System.out.println("a: " + a);
        System.out.println("a1: " + a1);
        System.out.println("a2: " + a2);
        System.out.println("a3: " + a3);

        char digit0 = 48;
        System.out.println("digi0: " + digit0);


        /*
        1. digit0 -> int
        2. сложение двух int -> int
        3. кастирование результата из типа int к типу char

         */

        //digit0 = (char) (digit0 + 5);

        digit0 += 5;// => digit0 = (char) (digit0 + 5);
        System.out.println("digit0: " + digit0);

        char letter = 97;

        System.out.println("Letter: " + letter);
        letter++;
        System.out.println("Letter:" + letter);

        System.out.println("int out char get 10 cod:" + (int) letter);
        System.out.println(0 + letter);

        // 0...9 -> соответствуют кодам 48...57
        // a...z -> соответствуют кодам 97...122
        // A...Z -> соответствуют кодам 65...90

        char x1 = 12853;
        System.out.println(x1);


    }
}
