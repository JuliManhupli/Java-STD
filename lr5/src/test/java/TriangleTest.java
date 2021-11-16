import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    static Triangle triangle;

    @BeforeEach
    void setUp() {
        triangle = new Triangle(3, 4, 5);
    }

    @Test
    void set_a() {
        triangle.set_a(6);
        assertEquals(6, triangle.get_a());
    }

    @Test
    void get_a() {
        assertEquals(3, triangle.get_a());
    }

    @Test
    void set_b() {
        triangle.set_b(6);
        assertEquals(6, triangle.get_b());
    }

    @Test
    void get_b() {
        assertEquals(4, triangle.get_b());
    }

    @Test
    void set_c() {
        triangle.set_c(6);
        assertEquals(6, triangle.get_c());
    }

    @Test
    void get_c() {
        assertEquals(5, triangle.get_c());
    }

    @Test
    void square() {
        assertEquals(6.0, triangle.Square());
    }

    @Test
    void perimeter() {
        assertEquals(12.0, triangle.Perimeter());
    }

    @Test
    void heightToSideA() {
        assertEquals(4.0, triangle.HeightToSideA());
    }

    @Test
    void heightToSideB() {
        assertEquals(3.0, triangle.HeightToSideB());
    }

    @Test
    void heightToSideC() {
        assertEquals(2.4, triangle.HeightToSideC());
    }
}