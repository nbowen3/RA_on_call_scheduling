import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.Assert.*;

public class PersonTest {

    private Person person;

    @BeforeEach
    public void setup() {
        String name = "David";
        Set<String> dates = new HashSet<>(Arrays.asList("09/21/2021", "10/15/2021", "11/23/2021"));
        Set<String> days = new HashSet<>(Arrays.asList("Monday", "Friday"));
        person = new Person(name, days, dates);
    }

    @Test
    public void getName() {
        assertEquals(person.getName(), "David");
    }

    @Test
    public void falseForInvalidDate() {
        assertFalse(person.checkDate("10/15/2021"));
    }

    @Test
    public void trueForValidDate() {
        assertTrue(person.checkDate("11/21/2021"));
    }

    @Test
    public void falseForInvalidDay() {
        assertFalse(person.checkDay("Monday"));
    }

    @Test
    public void trueForValidDay() {
        assertTrue(person.checkDay("Tuesday"));
    }
}
