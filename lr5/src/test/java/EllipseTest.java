import static org.junit.jupiter.api.Assertions.*;

class EllipseTest {

    static Ellipse ellipse;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        ellipse = new Ellipse(4, 3);
    }

    @org.junit.jupiter.api.Test
    void set_a() {
        ellipse.set_a(5);
        assertEquals(5, ellipse.get_a());
    }

    @org.junit.jupiter.api.Test
    void get_a() {
        assertEquals(4, ellipse.get_a());
    }

    @org.junit.jupiter.api.Test
    void set_b() {
        ellipse.set_b(6);
        assertEquals(6, ellipse.get_b());
    }

    @org.junit.jupiter.api.Test
    void get_b() {
        assertEquals(3, ellipse.get_b());
    }

    @org.junit.jupiter.api.Test
    void calculation_y() {
        assertEquals(1.98, ellipse.Calculation_y(3));
    }

    @org.junit.jupiter.api.Test
    void calculation_x() {
        assertEquals(3.01, ellipse.Calculation_x(1.98));
    }
}