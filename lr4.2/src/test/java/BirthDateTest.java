import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BirthDateTest {

    static BirthDate date;

    @BeforeEach
    void setUp() {
        date = new BirthDate(1, 1, 1);
    }

    @Test
    void get_day() {
        assertEquals(1, date.get_day());
    }

    @Test
    void get_month() {
        assertEquals(1, date.get_month());
    }

    @Test
    void get_year() {
        assertEquals(1, date.get_year());
    }
}