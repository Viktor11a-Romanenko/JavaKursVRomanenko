package lesson_29.persons;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.Nested;

import static org.junit.jupiter.api.Assertions.*;

class TestExample {

    //
    @BeforeEach
    void setUp() {
        System.out.println("Method @BeforeEach");
    }
//  @BeforeAll -
//  @AfterEach -
//  @AfterAll  -
//  @Disabled
//  @Nested

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

        Assertions.assertEquals(4, result); //
        System.out.println();
        Assertions.assertNotEquals(5, result); //
        Assertions.assertTrue(result >= 4);//
        assertFalse(result > 5); //
        assertNull(null);//
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

}