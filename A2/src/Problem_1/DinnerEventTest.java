package Problem_1;

import static org.junit.Assert.*;


public class DinnerEventTest {

  private DinnerEvent dinnerEventTest;


  @org.junit.Before
  public void setUp() throws Exception {
    this.dinnerEventTest = new DinnerEvent("coa", 20, "Dinner");
  }

  @org.junit.Test
  public void checkType() throws Exception {
    assertEquals(true, this.dinnerEventTest.checkType());
  }

  @org.junit.Test(expected = IllegalArgumentException.class)
  public void illegalCheckType() throws Exception {
    DinnerEvent dinnerEvent = new DinnerEvent("coa", 20, "Lunch");
    dinnerEvent.checkType();
  }


  @org.junit.Test
  public void checkAttendNum() throws Exception {
    assertEquals(true, this.dinnerEventTest.checkAttendNum());
  }

  @org.junit.Test(expected = IllegalArgumentException.class)
  public void illegalCheckAttendNum() throws Exception {
    DinnerEvent illegalDinnerEvent = new DinnerEvent("coa", 54, "Dinner");
  }

  @org.junit.Test
  public void getNonVege() throws Exception {
    assertEquals(Integer.valueOf(16), this.dinnerEventTest.getNonVege());
  }

  @org.junit.Test
  public void getVege() throws Exception {
    assertEquals(Integer.valueOf(4), this.dinnerEventTest.getVege());
  }
}