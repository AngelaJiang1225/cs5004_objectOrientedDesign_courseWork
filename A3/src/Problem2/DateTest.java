package Problem2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DateTest {

  Date dateTest;

  @Before
  public void setUp() throws Exception {
    this.dateTest = new Date(Month.APRIL, 1996);
  }

  @Test
  public void getMonth() {
    assertEquals(Month.APRIL, this.dateTest.getMonth());
  }

  @Test
  public void getYear() {
    assertEquals(1996, this.dateTest.getYear());
  }
}