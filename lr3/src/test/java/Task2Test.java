import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

class Task2Test {

    @org.junit.jupiter.api.Test
    void printInterval() {
        ArrayList<String> result = Task2.printInterval(10, 14, 2);
        ArrayList<String> expected = new ArrayList<String>();
        expected.add("10 = A\n");
        expected.add("12 = C\n");
        expected.add("14 = E\n");
        assertEquals(expected, result);
    }
}