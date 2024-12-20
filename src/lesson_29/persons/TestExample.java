package lesson_29.persons;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.Nested;

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


    }


}