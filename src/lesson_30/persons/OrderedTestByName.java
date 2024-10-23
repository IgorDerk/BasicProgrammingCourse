package lesson_30.persons;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;


// Тесты будут выполняться по алфавитному порядку названий тестовых методов
@TestMethodOrder(MethodOrderer.MethodName.class)
public class OrderedTestByName {
    @Test
    void testB() {
        System.out.println("Test B");
    }

    @Test
    void testA() {
        System.out.println("Test B");
    }

    @Test
    void testC() {
        System.out.println("Test B");
    }

    @Test
    void testD(){
        System.out.println("Test D");
    }

}
