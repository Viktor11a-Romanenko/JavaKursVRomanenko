package lesson_19;

public class FinalDemo {


    public static final double PI = 3.141519; //Константа -> имя константы пишем всеми большими буквами

    public static final int[] ints = new int[10];// Не константа, так как состояние объекта (значение в массиве) можна изменить

    public static final String COUNTRY = "Germany";//Константа
    public static final String[] corols = {"blue", "red", "yellow"}; //Не константа,

    private final String title = "Title";


    //Переменная примитивного типа, помеченная ключевом словом final
    private final int x;
    //Final переменные должны быть явно проинициализированы.
    //Прямо в поле, в конструкторе или в блоке инициализации.
    private final int[] array = new int[10];

    public FinalDemo(int x) {
        this.x = x; // после инициализации переменной нельзя поменять значение переменной.
        //  this.x = 10; не могу изменить значение final переменной
    }

    public FinalDemo() {

        // corols = new String[100]; -> error
        corols[0] = "green";
        ints[0] = 1;
        this.x = 100;
        //this.array = new int[20];//ошибка, посокольку после инициализации ссылки массива с final нельзя приствоить новую ссылку на массив
        //но мы можем записать в какой-то массив элемент:
        this.array[0] = 1000;
        this.array[array.length - 1] = 1500;
    }


    public void changeX() {
        //x = 15; ошибка, так же нельзя поменять даже через конструктор (метод) если пременная с final
    }

    public void setX(int x) {
        // this.x = x; Для final переменных сеттер не пишется (ошибка компиляции)
    }

    public int getX() {
        return x;
    }

    public double getPiX() {
        return PI * this.x;

    }
}

