import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmailTest {
    private Email test_email;
    @Before
    public void setUp() throws Exception {
        test_email = new Email("jiang.aiq", "gmail.com");
    }

    @Test
    public void test_getLoginName() {
        assertEquals(this.test_email.getLoginName(), "jiang.aiq");
    }

    @Test
    public void test_gsetLoginName() {
        this.test_email.setLoginName("angela");
        assertEquals(this.test_email.getLoginName(), "angela");
    }

    @Test
    public void test_ggetDomain() {
        assertEquals(this.test_email.getDomain(), "gmail.com");
    }

    @Test
    public void test_gsetDomain() {
        this.test_email.setDomain("husky.neu.edu");
        assertEquals(this.test_email.getDomain(), "husky.neu.edu");
    }
}