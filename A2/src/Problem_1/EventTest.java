package Problem_1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EventTest {

  Event eventTest;

  @Before
  public void setUp() throws Exception {
    this.eventTest = new Event("Coa", 40, "Lunch");
  }

  @Test
  public void getType() throws Exception {
    assertEquals("Lunch", this.eventTest.getType());
  }

  @Test
  public void checkLegalType() throws Exception{
    assertEquals(true, this.eventTest.checkLegalType());
    Event illegalType = new Event("Coa", 40, "Brunch");
    assertEquals(false, illegalType.checkLegalType());
  }

  @Test
  public void getClientName() throws Exception {
    assertEquals("Coa", this.eventTest.getClientName());
  }

  @Test
  public void getAttendNumber() throws Exception{
    assertEquals(Integer.valueOf(40), this.eventTest.getAttendNumber());
  }

}