package pl.coderslab.selenium_course_onl_tea_w_39.examples;

import org.junit.jupiter.api.*;

public class JunitExampleTest {
    @Test
    public void firstTestExample(){
        System.out.println("test uruchomiony");
    }

    @Test
    public void secondTest(){
        System.out.println("secondTest uruchomiony");
    }

    @Disabled
    @Test
    public void disabledTest(){
        System.out.println("disabledTest uruchomiony");
    }

    @BeforeEach
    public void beforeEach(){
        System.out.println("ta metoda przed kazdym testem");
    }

    @AfterEach
    public void afterEach(){
        System.out.println("ta metoda po kazdym tescie");
    }

    @BeforeAll
    public static void beforeAll(){
        System.out.println("ta metoda statyczna przed wszystkimi testami");
    }

    @AfterAll
    public static void afterAll(){
        System.out.println("ta metoda statyczna po wszystkich testach");
    }
}
