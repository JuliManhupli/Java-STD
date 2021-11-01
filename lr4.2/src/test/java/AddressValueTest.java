import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddressValueTest {

    static AddressValue address;

    @BeforeEach
    void setUp() {
        address = new AddressValue("C", "S", "H", 1);
    }

    @Test
    void get_city() {
        assertEquals("C", address.get_city());
    }

    @Test
    void get_street() {
        assertEquals("S", address.get_street());
    }

    @Test
    void get_house() {
        assertEquals("H", address.get_house());
    }

    @Test
    void get_flat() {
        assertEquals(1, address.get_flat());
    }
}