package lesson_20.transport;

public class Vehicie {

    private String model;
    private int year;

    public Vehicie(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void start() {
        System.out.println(model + " начинает движение!");
    }

    public void stop() {
        System.out.println(model + " останавливаеться!");
    }

    public String toString() {
        return model + ", year of manufacture is: " + year;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }


}
