package lesson_21;

public class AutoPark {
    public static void main(String[] args) {
        BusDriver busDriver = new BusDriver("John", "LN-19285347");

        Autobus bus = new Autobus(busDriver, 15);

        BusDriver busDriver1 = new BusDriver("Margo", "AE-12535866");
        Autobus bus1 = new Autobus(busDriver1, 24);
        System.out.println("bus: " + bus.toString());
        System.out.println("bus1: " + bus1.toString());

        BusDriver peter = new BusDriver("Peter", "PE24840193");
        bus1.setDriver(peter);
        System.out.println("bus1: " + bus1.toString());

        bus1 = null;
        System.out.println("peter: " + peter.toString());

        bus.installNewAutopilot("AP-gpt65");
        System.out.println(bus.toString());
        busDriver.setName("Sebastian");
        System.out.println(bus.toString());

        System.out.println("\n====================================");
        System.out.println("количество пассажиров!: " + bus.getCountPassenger());
        bus.showListOfPassenger();
        System.out.println("\n====================================");

        Passenger passenger = new Passenger("John");
        Passenger margo = new Passenger("Margo");

        bus.takePassenger(passenger);
        bus.showListOfPassenger();
        bus.takePassenger(margo);
        bus.showListOfPassenger();
        bus.takePassenger(margo);
        bus.showListOfPassenger();


    }


}
