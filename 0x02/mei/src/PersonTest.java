import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {

    Person person;

    @BeforeEach
    void setup() {
        person = new Person("Paul", "McCartney", 2000, true, true, true);
    }

    @Test
    void show_full_name() {
        assertEquals("Paul McCartney", person.fullName());
    }

    @Test
    void test_calculateYearlySalary() {
        person.setSalary(1200);
        assertEquals(14400, person.calculateYearlySalary());
    }

    @Test
    void person_is_MEI() {
        person.setAnotherCompanyOwner(false);
        person.setPesioner(false);
        person.setPublicServer(false);
        assertTrue(person.isMei());
    }

    @Test
    void person_is_not_MEI() {
        assertFalse(person.isMei());

    }
}
