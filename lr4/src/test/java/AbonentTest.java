import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbonentTest {

    static Abonent abonent;

    @BeforeEach
    void setUp() {
        abonent = new Abonent("S", "N", "P", "A");
    }

    @Test
    void get_surname() {
        assertEquals("S", abonent.get_surname());
    }

    @Test
    void get_name() {
        assertEquals("N", abonent.get_name());
    }

    @Test
    void get_patronymic() {
        assertEquals("P", abonent.get_patronymic());
    }

    @Test
    void get_address() {
        assertEquals("A", abonent.get_address());
    }
}