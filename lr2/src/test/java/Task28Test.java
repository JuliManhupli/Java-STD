import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task28Test {

    @Test
    void formArrayB() {
        int[] init  = {2, 3, 5, 8, 9};
        int[] result = Task28.formArrayB(init, 3, 8);
        int[] expected = {3, 3, 5, 8, 8};
        assertArrayEquals(expected, result);

    }
}