package Problem2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TimeTest {

  private Time testTime;

  @Before
  public void setUp() throws Exception {
    testTime = new Time(11, 2, 12);
  }

  @Test
  public void checkTime() throws Exception {
    Time illegalTime = new Time(25, 2, 12);
    assertEquals("The time is illegal!", illegalTime.checkTime());
    assertEquals("Legal time.", testTime.checkTime());
  }

  @Test
  public void getHours() throws Exception {
    assertEquals(Integer.valueOf(11), this.testTime.getHours());
  }

  @Test
  public void setHours() throws Exception {
    this.testTime.setHours(10);
    assertEquals(Integer.valueOf(10), this.testTime.getHours());
  }

  @Test
  public void getMinutes() throws Exception {
    assertEquals(Integer.valueOf(2), this.testTime.getMinutes());
  }

  @Test
  public void setMinutes() throws Exception {
    this.testTime.setMinutes(8);
    assertEquals(Integer.valueOf(8), this.testTime.getMinutes());
  }

  @Test
  public void getSeconds() throws Exception {
    assertEquals(Integer.valueOf(12), this.testTime.getSeconds());
  }

  @Test
  public void setSeconds() throws Exception {
    this.testTime.setSeconds(4);
    assertEquals(Integer.valueOf(4), this.testTime.getSeconds());
  }
}