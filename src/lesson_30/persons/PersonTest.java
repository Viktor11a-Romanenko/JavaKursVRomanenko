package lesson_30.persons;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class PersonTest {

    Person person;
    String startEmail = "john@tets.com";
    String startPassword = "qwerty10$";

    @BeforeEach
    void setUp() {
        person = new Person(startEmail, startPassword);
    }
    /*

     */

    @Test
    void testValidEmail() {
        String validEmail = "valid@test.com";
        person.setEmail(validEmail);
        System.out.println("getEmail: " + person.getEmail());

        Assertions.assertEquals(validEmail, person.getEmail());
    }

    /*

     */
    @ParameterizedTest
    @MethodSource("invalidEmailData")
    void testInvalidEmail(String invalidEmail) {
        person.setEmail(invalidEmail);
        Assertions.assertNotEquals(invalidEmail, person.getEmail());
        Assertions.assertEquals(startEmail, person.getEmail());
    }

    static Stream<String> invalidEmailData() {
        return Stream.of(
                "testmail.net",
                "test@@mail.net",
                "test@mai@l.net",
                "test@mailnet",
                "test@mail.ne.t",
                "test@mail.net.",
                "test@mailne.t",
                "t!est@mail.net",
                "test@mail.net#",
                "1est@mail.net",
                "@testmail.net",
                "_test@mail.net"


        );
    }


}
