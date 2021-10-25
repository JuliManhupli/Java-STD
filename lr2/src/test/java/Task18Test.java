import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class Task18Test {

    @Test
    void printAInIntervals() {
        int[] a = {1, 2, 3, 4, 5, 6, 7};
        int[] b = {2, 4, 6};
        ArrayList<String> result = Task18.printAInIntervals(a, b);
        ArrayList<String> expected = new ArrayList<String>();
        expected.add("Интервал 2-4: 2 3 4 ");
        expected.add("Интервал 2-6: 2 3 4 5 6 ");
        expected.add("Вне интервалов: 1 7 ");
        assertEquals(expected, result);

    }
}