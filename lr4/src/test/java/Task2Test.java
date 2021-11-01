import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.TreeMap;

import static org.junit.jupiter.api.Assertions.*;

class Task2Test {

    @Test
    void findPhoneBook() {
        Map<String, Abonent> init = new TreeMap<>();

        init.put("+380505007020", new Abonent("B", "C", "P", "address"));
        init.put("+380505007021", new Abonent("B", "A", "P", "address"));

        String result = Task2.FindPhoneBook(init, "+380505007022");
        assertEquals("Абонент не найден", result);
    }
}