package homework_27;

public class PersonHwApp {
    public static void main(String[] args) {


        Person_HW person = new Person_HW("email", "password");
        person.setEmail("test@mail.com");
        System.out.println(person.getEmail());
        person.setPassword("cQ1%dfa_");


    }
}