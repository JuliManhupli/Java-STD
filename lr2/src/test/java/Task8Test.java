import static org.junit.jupiter.api.Assertions.*;

class Task8Test {

    @org.junit.jupiter.api.Test
    void findMinMaxDifference() {
        int[] init = {1, 9, 3, 8, 7};
        MinMaxResult result = Task8.findMinMaxDifference(init);
        MinMaxResult expected = new MinMaxResult(1.4, 4.6);
        assertEquals(expected, result);

    }
}