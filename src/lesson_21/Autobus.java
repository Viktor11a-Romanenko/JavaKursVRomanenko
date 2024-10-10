package lesson_21;

import java.util.Arrays;

public class Autobus {
    /*
    Для созжания связи типа HAS-A мы определяем поле класса,
    которое будет хранить ссылку на объект другого класса
     */
    /*

     */

    //Инификатор он уникальный
    private static int counter = 1;
    private final int id;
    // HAS-A
    private BusDriver driver; // Агрегация -> мягкая связь
    private Autopilot autopilot; // Композиция -> жесткая, неразрывная связь

    private final int capacity;
    private int countPassenger;


    private final Passenger[] passengers;


    public Autobus(BusDriver busDriver, int capacity) {
        this.id = counter++;
        this.capacity = capacity;
        this.driver = busDriver;
        this.autopilot = new Autopilot("AP-v001");
        //
        this.autopilot.setAutobus(this);
        // 1 : many + агрегация
        this.passengers = new Passenger[capacity];

    }

    public void showListOfPassenger() {
        if (countPassenger == 0) {
            System.out.println("[]");
            return;
        }

        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < countPassenger; i++) {
            sb.append(passengers[i].toString());
            sb.append((i < countPassenger - 1) ? ", " : "]");
        }
        System.out.println(sb.toString());
    }

    public boolean takePassenger(Passenger passenger) {
        if (passenger == null) return false;

        /*

         */
        if (countPassenger < capacity) {
            //
            //
            if (isPassengerInBus(passenger)) {
                System.out.printf("Пассажир id %d уже в автобусе с id %d\n", passenger.getId(), this.id);
                return false;
            }
            //
            passengers[countPassenger] = passenger;
            countPassenger++;
            System.out.printf("Пассажир id %d завершил посадку в автобус с id %d\n", passenger.getId(), this.id);
            return true;


        }


        //
        System.out.printf("В автобусе id %d свободных мест нет!\n", this.id);
        return false;
    }

    private boolean isPassengerInBus(Passenger passenger) {
        for (int i = 0; i < countPassenger; i++) {
            if (passengers[i].getId() == passenger.getId()) {
                return true;
            }
        }
        //
        return false;
    }


    public void updateAutopilotVersion(String sofrwareVersion) {
        this.autopilot.setSoftwareVersion(sofrwareVersion);
    }

    public void installNewAutopilot(String sofrwareVersion) {
        //
        this.autopilot.setAutobus(null);
        this.autopilot = new Autopilot(sofrwareVersion);
        this.autopilot.setAutobus(this);
    }

    public String toString() {
        return "Autobus: {id: " + id + ", capacity: " + capacity +
                "; driver: " + driver.toString() +
                "; autopilot: " + autopilot.toString() +
                "}";
    }

    public void setDriver(BusDriver driver) {
        this.driver = driver;
    }

    public int getId() {
        return id;
    }

    public BusDriver getDriver() {
        return driver;
    }

    public Autopilot getAutopilot() {
        return autopilot;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCountPassenger() {
        return countPassenger;
    }
}
