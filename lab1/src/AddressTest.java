import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddressTest {

    private Address test_address;
    @Before
    public void setUp() throws Exception {
        this.test_address = new Address("111", "Terry Ave", "SEA",
                "WA", 98109, "USA");
    }

    @Test
    public void test_getStreetNumber() {
        assertEquals(this.test_address.getStreetNumber(), "111");
    }

    @Test
    public void test_setStreetNumber() {
        this.test_address.setStreetNumber("222");
        assertEquals(test_address.getStreetNumber(), "222");
    }

    @Test
    public void test_getStreetName() {
        assertEquals(this.test_address.getStreetName(), "Terry Ave");
    }

    @Test
    public void test_setStreetName() {
        this.test_address.setStreetName("West lake");
        assertEquals(this.test_address.getStreetName(), "West lake");
    }

    @Test
    public void test_getCityName() {
        assertEquals(this.test_address.getCityName(), "SEA");
    }

    @Test
    public void test_setCityName() {
        this.test_address.setCityName("NY");
        assertEquals(this.test_address.getCityName(), "NY");
    }

    @Test
    public void test_getStateAcronym() {
        assertEquals(this.test_address.getStateAcronym(), "WA");
    }

    @Test
    public void test_setStateAcronym() {
        this.test_address.setStateAcronym("CA");
        assertEquals(this.test_address.getStateAcronym(), "CA");
    }

    @Test
    public void test_getZipCode() {
        assertTrue(this.test_address.getZipCode() == 98109);
    }

    @Test
    public void test_setZipCode() {
        this.test_address.setZipCode(98101);
        assertTrue(this.test_address.getZipCode() == 98101);
    }

    @Test
    public void test_getCountryName() {
        assertEquals(this.test_address.getCountryName(), "USA");
    }

    @Test
    public void test_setCountryName() {
        this.test_address.setCountryName("CN");
        assertEquals(this.test_address.getCountryName(), "CN");
    }
}
