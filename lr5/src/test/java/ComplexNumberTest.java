import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComplexNumberTest {

    static ComplexNumber complexNumber;

    @BeforeEach
    void setUp() {
        complexNumber = new ComplexNumber(3, 4);
    }

    @Test
    void set_x() {
        complexNumber.set_x(5);
        assertEquals(5, complexNumber.get_x());
    }

    @Test
    void get_x() {
        assertEquals(3, complexNumber.get_x());
    }

    @Test
    void set_y() {
        complexNumber.set_y(5);
        assertEquals(5, complexNumber.get_y());
    }

    @Test
    void get_y() {
        assertEquals(4, complexNumber.get_y());
    }

    @Test
    void set_z() {
        complexNumber.set_z("1.5 + i*5.0");
        assertEquals("1.5 + i*5.0", complexNumber.get_z());
    }

    @Test
    void get_z() {
        assertEquals("3.0 + i*4.0", complexNumber.get_z());
    }
}