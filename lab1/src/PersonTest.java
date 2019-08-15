import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {
    private Person test_person;
    @Before
    public void setUp() { this.test_person = new Person("Alice", "Wang");
    }

    @Test
    public void test_getFirstName() throws Exception{
        assertEquals(this.test_person.getFirstName(), "Alice");
    }

    @Test
    public void test_setFirstName() throws Exception{
        this.test_person.setFirstName("Tom");
        assertEquals(this.test_person.getFirstName(), "Tom");
    }

    @Test
    public void test_getLastName() throws Exception{
        assertEquals(this.test_person.getLastName(), "Wang");
    }

    @Test
    public void test_setLastName() throws Exception{
        this.test_person.setLastName("Li");
        assertEquals(this.test_person.getLastName(), "Li");
    }
}