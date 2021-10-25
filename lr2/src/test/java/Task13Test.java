import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task13Test {

    @Test
    void progressionCheck() {
        int[] init = {1, 3, 5, 7, 9, 11};
        boolean result = Task13.progressionCheck(init);
        assertEquals(true, result);
    }
}