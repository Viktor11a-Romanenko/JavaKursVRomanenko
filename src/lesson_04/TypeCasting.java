package lesson_04;

public class TypeCasting {
    public static void main(String[] args) {

        /*
        Два способа преобразование типо данных
        1. Неявное преобразование (автоматически) =>  Неявное преобразование происходит автоматически,
        когда значение меньшего типа данных преобразуется в бoльший тип данных
        2. Явное преобразование (кастинг) => Требуется, когда нужно преобразовать значение из бОльшего типа данных
         в значение меньшего типа данных Так как это может привести к потере данных
         */

        byte bytVal = 123;
        int intVal;
        intVal = bytVal; // тут происходить неявное преобразование типа byt в тип int (безопасное)

        System.out.println("intVal: " + intVal);

        double doubleValue = intVal;
        System.out.println("doubleValue: " + doubleValue);

        double doubleVal = 42.9;
        //int int1 = doubleVal;  => неверно, потому что можем потерять данных мы можем потерять значение после точки(0.1 )

        int int1 = (int) doubleVal; // =>  Явное преобразование из double в int

        System.out.println("doubleVal: " + doubleVal);
        System.out.println("int1: " + int1);

        // short shortVal = int1; => falsch

        short shortVal = (short) int1;
        System.out.println("shortVal: " + shortVal);

        System.out.println("============== \n");

        // Преобразование в вычислениях

        int x = 20;
        int y = 7;

        double result;

        result = x / y;

        // int 2. => неявное преобразование 2.0 => result

        System.out.println("result: " + result);

        // 20.0 / 7.0 => result
        result = x / 7.0;
        /*
        когда вырожение (в формуле) присутствует несколько типов данных, то все меньшие типы данных
        автоматически, не явно, КАСТИРУЮТЬСЯ к более широкому типу
         */

        System.out.println("result: " + result);
        /*
        1. int x => явно преобразован в float
        2. int y => не явно преобразован в float
        3. 20.0f / 7.0f => 2.85f
        4. 2. 85f => не явно (авто) преобразуется в тип double

        (целевой_тип) значение => Где параметр целевой_тип обозначает тип, в который нужно преобразовать
        указанное значение.
        Например, в следующем фрагменте кода тип int приводится к типу byte:
        int i = 11;
        byte b = 22;
        b = (byte) i;
         */

        result = (float) x / y; // обычное деление ( не целочисленое) и тип float пререйдет в double

        System.out.println("result float cast: " + result);

        result = x / (double) y;

        System.out.println("result double cast: " + result);


    }
}
