package homework_15;

public class Main {
    public static void main(String[] args) {
        People people = new People();

        String peopleName = people.name;
        String peopleWork = people.work;
        int agePeople = people.age;

        People people1 = new People("Max", "Barmen", 23);
        people1.whoAmI();

        People people2 = new People("Svyatoslav", "Consul", 27);
        people2.whoAmI();

        People people3 = new People("Vitalii", "Journalist", 22);
        people3.whoAmI();


    }

}
