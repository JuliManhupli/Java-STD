import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ExponentialFormTest {

    static ExponentialForm exponentialForm;
    static ComplexNumber o = new ComplexNumber(3, 4);

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        exponentialForm = new ExponentialForm(o);
    }

    @Test
    void get_num() {
        assertEquals(o, exponentialForm.get_num());
    }

    @Test
    void set_num() {
        ComplexNumber num = new ComplexNumber(4, 5);
        exponentialForm.set_num(num);
        assertEquals(num, exponentialForm.get_num());
    }

    @Test
    void get_standard_form() {
        assertEquals("3.0 + i*4.0", exponentialForm.get_standard_form());
    }

    @Test
    void set_standard_form() {
        exponentialForm.set_standard_form("1.5 + i*5.0");
        assertEquals("1.5 + i*5.0", exponentialForm.get_standard_form());
    }

    @Test
    void get_exponential_form() {
        assertEquals("5.0*e^(i*0.93)", exponentialForm.get_exponential_form());
    }

    @Test
    void set_exponential_form() {
        exponentialForm.set_exponential_form("5.0*e^(i*0.5)");
        assertEquals("5.0*e^(i*0.5)", exponentialForm.get_exponential_form());

    }

    @Test
    void calculation_exponential_form() {
        assertEquals("5.0*e^(i*0.93)", exponentialForm.Calculation_exponential_form());
    }
}