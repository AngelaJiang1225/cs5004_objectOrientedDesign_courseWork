import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AuthorTest {
    private Author test_author;
    @Before
    public void setUp() throws Exception {
        Person person = new Person("Aiqi", "Jiang");
        Email email = new Email("jiang.aiq", "husky.neu.edu");
        Address address = new Address("215", "Terry Ave",
                "SEA", "WA", 98109, "USA");
        test_author = new Author(person, email, address);
    }
    @Test
    public void test_getName() throws Exception {
        assertEquals(this.test_author.getName(), "Aiqi Jiang");
    }

    @Test
    public void test_getEmail() throws Exception {
        assertEquals(this.test_author.getEmail(), "jiang.aiq@husky.neu.edu");

    }

    @Test
    public void test_getAddress() throws Exception {
        assertEquals(this.test_author.getAddress(), "215 Terry Ave SEA WA 98109 USA");
    }
}