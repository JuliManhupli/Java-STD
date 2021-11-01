import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueuePersonTest {

    static AddressValue address;
    static QueuePerson person;

    @BeforeEach
    void setUp() {
        address = new AddressValue("C", "S", "H", 1);
        person = new QueuePerson("Name", address, 1);
    }

    @Test
    void get_fullName() {
        assertEquals("Name", person.get_fullName());
    }

    @Test
    void get_address() {
        assertEquals("г C, ул S H, кв 1", person.get_address());
    }

    @Test
    void get_priority() {
        assertEquals(1, person.get_priority());
    }
}