import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task14Test {

    static Map<String, Abonent> init = new HashMap<>();

    @BeforeEach
    void setUp() {
        init.put("+380505007020", new Abonent("D", "C", "P", "address"));
        init.put("+380505007021", new Abonent("B", "A", "P", "address"));
        init.put("+380505007022", new Abonent("G", "B", "P", "address"));
    }

    @Test
    void sortMap() {
        TreeMap<Abonent, String> expected = new TreeMap<>(new Task14.SortSurname());
        expected.put(new Abonent("B", "A", "P", "address"), "+380505007021");
        expected.put(new Abonent("D", "C", "P", "address"), "+380505007020");
        expected.put(new Abonent("G", "B", "P", "address"), "+380505007022");
        TreeMap<Abonent, String> result = Task14.SortMap(init);
        assertEquals(expected, result);
    }

}