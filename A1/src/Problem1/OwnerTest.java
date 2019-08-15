package Problem1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OwnerTest {

  private Owner test_owner;

  @Before
  public void setUp() throws Exception {
    test_owner = new Owner("Aiqi", "Jiang", "1234567890");
  }

  @Test
  public void numberCheckerTrue() throws Exception {
    assertTrue(this.test_owner.numberChecker() == true);
  }

  public void numberCheckerFalse() throws Exception {
    Owner illegalOwner = new Owner("Aiqi", "Jiang", "789");
    assertTrue(illegalOwner.numberChecker() == true);
  }

  @Test
  public void getFirstName() throws Exception {
    assertEquals(test_owner.getFirstName(), "Aiqi");
  }

  @Test
  public void setFirstName() throws Exception {
    test_owner.setFirstName("Lin");
    assertEquals(test_owner.getFirstName(), "Lin");
  }

  @Test
  public void getLastName() throws Exception {
    assertEquals(test_owner.getLastName(), "Jiang");
  }

  @Test
  public void setLastName() throws Exception {
    test_owner.setLastName("Shen");
    assertEquals(test_owner.getLastName(), "Shen");
  }

  @Test
  public void getPhoneNumber() throws Exception {
    assertEquals(test_owner.getPhoneNumber(), "1234567890");
  }

  @Test
  public void setPhoneNumber() throws Exception {
    test_owner.setPhoneNumber("2066048760");
    assertEquals(test_owner.getPhoneNumber(), "2066048760");
  }
}