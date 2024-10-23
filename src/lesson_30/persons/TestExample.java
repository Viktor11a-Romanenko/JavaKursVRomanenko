package lesson_30.persons;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class TestExample {

    //
    @BeforeEach
    void setUp() {
        System.out.println("Method @BeforeEach");
    }
//  @BeforeAll -  метод выполняется только один раз перед выполнение первого теста
//  @AfterEach - выполняется после КАЖДОГО тестовым методом
//  @AfterAll  - метод выполняется только один раз после выполнение всех тестовых методов
//  @Disabled - указывает, что тест отключен и выполняться не будет
//  @Nested -  позволяет создать вложенный тестовый класс. Может быть использована для логической группировки тестовых методов

    // Анатация указывает, что метод является тестовым
    @Test
    public void testAddition() {
        System.out.println("testAddition");
        // любой java код

        int result = 2 + 2;

        // Ожидаемое значение 4
        // Реальное значение в переменной result

        // Методы проверки утверждений:
        // 1. assertEquals(expected, actual) - проверяеть равны ли два значения

        Assertions.assertEquals(4, result); // проверяет, равны ли два значения
        System.out.println();
        Assertions.assertNotEquals(5, result); // тест будет пройден если "неожидаемый результат" не совпадает с фактическим
        Assertions.assertTrue(result >= 4);// проверяет, что условие верно (условие возвращает true)
        assertFalse(result > 5); //  проверяет, что условие ложно (условие возвращает false)
        assertNull(null);// Проверяет, что объект равен null
        assertNotNull("String");//
    }

    @Disabled
    @Test
    public void emptyTest() {
        //
        System.out.println("emptyTest");

    }

    @ParameterizedTest
    @ValueSource(strings = {"apple", "banana", "cherry"})
    public void testFruits(String fruit) {
        assertTrue(fruit.length() > 2);
        System.out.println(fruit);

    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, -1, 4, 5})
    void testInts(int value) {
        System.out.println("current value: " + value);
        Assertions.assertTrue(value > -5);
    }

    // CSV -
    //

    @ParameterizedTest
    @CsvSource({"apple, 1", "banana, 2", "cherry, 3"})
    void testWithCsvSource(String friut, int rank) {
        System.out.println(friut + " | " + (rank + 10));
        assertTrue(friut.length() > 4 && rank > 0);
    }

    //
    @ParameterizedTest
    @CsvFileSource(resources = "data.csv")
    void testCsvFileSource(String fruit, int rank, boolean flag) {
        System.out.println(fruit + " | " + rank + " | " + !flag);
        assertNotNull(fruit);
        assertTrue(rank > 0);
    }


    //
    @ParameterizedTest
    @MethodSource("testDataFruits")
    void testMethodSource(String friut) {
        System.out.println(friut);
        assertNotNull(friut);
    }


    static Stream<String> testDataFruits() {
        return Stream.of("apple", "banana", "cherry");
    }

    @ParameterizedTest
    @MethodSource("testDateInt")
    void testMethodSource2(int value) {
        System.out.println("current value" + value);
        assertNotEquals(100, value);
    }

    static Stream<Integer> testDateInt() {
        return Stream.of(1, 2, -1, 4, 5);
    }

    @ParameterizedTest
    @MethodSource("testDataArguments")
    void testMethodSource3(int value, int expected, boolean isEquals) {
        System.out.println(value + " | " + expected + " | " + isEquals);
        int result = value * value;
        //assertEquals(expected, result);
        assertEquals(isEquals, result == expected);
    }

    static Stream<Arguments> testDataArguments() {
        return Stream.of(
                Arguments.of(2, 4, true),
                Arguments.of(3, 9, true),
                Arguments.of(4, 15, false)
        );
    }

    @ParameterizedTest
    @MethodSource("testPersonsDate")
    void testPersonsDate(Person person, String newEmail) {
        System.out.println(person);
        System.out.println(newEmail);
    }


    static Stream<Arguments> testPersonsDate() {
        return Stream.of(
                Arguments.of(new Person("test@mail.com", "pass1Q!4"), "new1234@mail.com"),
                Arguments.of(new Person("invaild.mail.com", "password"), "mail.test.com")
        );
    }


}