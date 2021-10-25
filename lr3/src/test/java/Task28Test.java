import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task28Test {

    @Test
    void getUniqueChars() {
        char[] init = {'a', 'g', 'c', ' ', 'c', 'f', ' ', 'b', 'f', 'c'};
        StringBuffer result = Task28.getUniqueChars(init);
        assertEquals("agb", result.toString());
    }
}