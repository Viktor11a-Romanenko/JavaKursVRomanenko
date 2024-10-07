package lesson_18;

public class Test {
    //Поле класса
    int x;

    static int staticY;

    public void testNonStatic() {
        x++;
        staticY++;
        testStatic();
    }

    public static void testStatic() {
        //
        //x++;
        staticY++;
        //
    }

    public static void main(String[] args) {
        //x = 10;//Ошибка, так как у статического метода нет доступа к НЕ-статическим членам
        testStatic();
        //testNonStatic()

        Test test = new Test();
        //
        test.testNonStatic();
    }

}
