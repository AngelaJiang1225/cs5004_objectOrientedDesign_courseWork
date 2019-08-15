package Problem_1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LunchEventTest {

  LunchEvent lunchEventTest;

  @Before
  public void setUp() throws Exception {
    this.lunchEventTest = new LunchEvent("Coa", 40, "Lunch");
  }

  @Test
  public void checkType() throws Exception {
    assertEquals(true, this.lunchEventTest.checkType());
  }

  @Test(expected = IllegalArgumentException.class)
  public void illegalCheckType() throws Exception {
    LunchEvent lunchEvent = new LunchEvent("coa", 20, "Dinner");

  }

  @Test
  public void checkAttendNum() throws Exception {
    LunchEvent lunchEvent = new LunchEvent("coa", 50, "Lunch");
    assertEquals(true, lunchEvent.checkAttendNum());
  }

  @Test(expected = IllegalArgumentException.class)
  public void illegalCheckAttendNum() throws Exception {
    assertEquals(true, this.lunchEventTest.checkAttendNum());
    LunchEvent illegalType = new LunchEvent("coa", 91, "Lunch");
    this.lunchEventTest.checkAttendNum();
  }

  @Test
  public void getSandwichNum() throws Exception {
    assertEquals(Integer.valueOf(42), this.lunchEventTest.getSandwichNum());
  }
}