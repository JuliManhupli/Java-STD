import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task14Test {

    @Test
    void encryption() {
        String init= "АлФавИТ";
        StringBuffer result = Task14.encryption(init.toCharArray(), "ИдФНтВх".toCharArray());
        assertEquals("ИПИНФКЗ", result.toString());
    }

    @Test
    void decryption() {
        String init= "ИпиНФкз";
        StringBuffer result = Task14.decryption(init.toCharArray(), "ИдФНтВх".toCharArray());
        assertEquals("АЛФАВИТ", result.toString());
    }
}