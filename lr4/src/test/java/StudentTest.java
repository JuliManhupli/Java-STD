import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    static BirthDate date;
    static Student student;

    @BeforeEach
    void setUp() {
        date = new BirthDate(1, 1, 1);
        student = new Student("Name", "ТІ", date, 10);
    }

    @Test
    void get_fullStName() {
        assertEquals("Name", student.get_fullStName());
    }

    @Test
    void get_group() {
        assertEquals("ТІ", student.get_group());
    }

    @Test
    void get_date() {
        assertEquals("1.1.1", student.get_date());
    }

    @Test
    void get_averageGrade() {
        assertEquals(10, student.get_averageGrade());
    }
}