package Problem1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ActiveYearTest {

  private ActiveYear activeYearTest1;

  @Before
  public void setUp() throws Exception {
    this.activeYearTest1 = new ActiveYear("1995", "2018");
  }

  @Test(expected = IllegalArgumentException.class)
  public void checkYearLength() throws IllegalArgumentException {
    ActiveYear activeYearTest2 = new ActiveYear("19951", "2018");
  }

  @Test
  public void checkYearForm() throws Exception {
    ActiveYear activeYearTest3 = new ActiveYear("xxyy", "current");
  }

  @Test
  public void getStartYear() {
    assertEquals("1995", this.activeYearTest1.getStartYear());
  }

  @Test
  public void getEndYear() {
    assertEquals("2018", this.activeYearTest1.getEndYear());
  }

  @Test
  public void getWholeYear() {
    assertEquals("1995-2018", this.activeYearTest1.getWholeYear());
  }
}