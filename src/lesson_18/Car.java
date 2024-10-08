package lesson_18;

public class Car {
    public static int totalCarProduced;

    private String model;
    private int powerPS;

    public Car(String model, int powerPS) { //это конструктор
        this.model = model;
        this.powerPS = powerPS;
        totalCarProduced++; // Увеличиваем общее количетво авто при создании нового конструктора (объекта)
    }

    public String toString() {
        return String.format("Auto - model: %s, power %d. " +
                "Всего выпущено машин: %d", model, powerPS, totalCarProduced);
    }

    public static void testStatic() {
        System.out.println("Hello from static method");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPowerPS() {
        return powerPS;
    }

    public void setPowerPS(int powerPS) {
        this.powerPS = powerPS;
    }

    public void test(final int number) {
        //number++; error
        int x = number + 10;
        x++;
    }

    public void test(final int[] numbers) {
        // numbers = new int[100];

        int[] newNumbers = numbers;
        numbers[0] = 10000;

    }
}
