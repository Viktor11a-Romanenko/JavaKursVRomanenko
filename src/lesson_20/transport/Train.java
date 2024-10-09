package lesson_20.transport;

public class Train extends Vehicie { //  не можем написать что поезд is-a автобусом,
    //но можем написать что поезд is-a  транспорт

    private int capacity; //вместимость
    private int counPassengers;

    private int countWagons;
    private final int wagonCapacity; // вместимость вагона

    public Train(String model, int year, int wagonCapacity, int countWagons) {
        super(model, year);// конструктор родителя
        this.countWagons = countWagons;
        this.wagonCapacity = wagonCapacity;
        calculateCapacity();
    }

    private void calculateCapacity() {
        this.capacity = countWagons * wagonCapacity;
    }

    public void setCountWagons(int countWagons) {
        this.countWagons = countWagons;
        calculateCapacity();
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCounPassengers() {
        return counPassengers;
    }

    public int getCountWagons() {
        return countWagons;
    }

    public int getWagonCapacity() {
        return wagonCapacity;
    }
}
