package demo.qa;

import org.junit.jupiter.api.*;

import java.lang.module.Configuration;

public class ExampleJunit5Test {

    @BeforeAll
    static void configure() {
        System.out.println(" this is @BeforeALL");
    }

    @AfterAll
        static void tearDown() {
            System.out.println(" this is @AfterALL");
    }

    @BeforeEach
    void beforeTest() {
        System.out.println(" this is @BeforeEach");
    }

    @AfterEach
    void afterTest() {
        System.out.println(" this is @AfterEach");
    }
    @Test
    void firstTest0() {
        System.out.println(" this is @Test 0");
    }

    @Test
    void firstTest1() {
        System.out.println(" this is @Test 1");
    }
}
