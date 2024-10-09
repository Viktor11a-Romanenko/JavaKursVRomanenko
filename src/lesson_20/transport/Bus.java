package lesson_20.transport;

public class Bus extends Vehicie { //Оно должно быть ВСЕГДА справедливым наследывание ->
    // - Bus is-a Vehicle -> автобус ЯВЛЯЕТЬСЯ транспортом-> ВЕРНО, можно применить наследование
    // - Smartphone is-a Vehicle -> НЕВЕРНО, нельзя применить наследование

    private int capacity;
    private int countPassengers;

    public Bus(String model, int year, int capacity) {
        // Перед созданием констуктора нужно заново создать объект родителя
        //Для этого используем super
        super(model, year); // вызываем конструктор род.класса
        this.capacity = capacity; //
    }

    public boolean takePassaenger() {
        //Проверяем есть ли место
        if (countPassengers < capacity) {
            countPassengers++;
            System.out.println("Пассажир зашел в автобус " + this.getModel());
            return true;
        }

        System.out.printf("В автобусе %s больше нет мест. Сейчас %d пассажиров\n",
                this.getModel(), countPassengers);
        return false;
    }

    public boolean out() {
        if (countPassengers > 0) {
            countPassengers--;
            System.out.println("Пассажир вышел " + this.getModel());
            return true;
        }
        System.out.printf("В автобусе %s больше нет пассажиров. Сейчас %d пассажиров\n",
                this.getModel(), countPassengers);
        return false;
    }


    public int getCountPassengers() {
        return countPassengers;
    }

    public int getCapacity() {
        return capacity;
    }
}
