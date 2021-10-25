import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class Task23Test {

    @Test
    void equalElements() {
        int[] init = {1, 3, 1, 7, 9, 11};
        var result = Task23.equalElements(init);
        var expected = new HashMap<String, Integer>();
        expected.put("0,2", 1);
        assertEquals(expected, result);
    }
}