import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuadrangleTest {

    static Quadrangle quadrangle;

    @BeforeEach
    void setUp() {
        quadrangle = new Quadrangle(4, 5);
    }

    @Test
    void square() {
        assertEquals(20.0, quadrangle.Square());
    }

    @Test
    void perimeter() {
        assertEquals(18.0, quadrangle.Perimeter());
    }
}