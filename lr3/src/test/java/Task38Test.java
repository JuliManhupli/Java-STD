import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task38Test {

    @Test
    void transformation() {
        String init= "110001 10101";
        StringBuffer result = Task38.transformation(init);
        assertEquals("C 4 A 8 ", result.toString());
    }
}