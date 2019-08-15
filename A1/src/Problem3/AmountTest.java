package Problem3;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AmountTest {

  Amount testAmount;

  @Before
  public void setUp() throws Exception {
    testAmount = new Amount(100, 10);
  }

  @Test(expected = IllegalArgumentException.class)
  public void checkAmount() throws Exception {
    Amount illegalAmount = new Amount(1, 100);
    illegalAmount.checkAmount();
  }

  @Test
  public void getDollar() throws Exception {
    assertEquals(Integer.valueOf(100), this.testAmount.getDollar());
  }

  @Test
  public void setDollar() throws Exception {
    this.testAmount.setDollar(90);
    assertEquals(Integer.valueOf(90), this.testAmount.getDollar());
  }

  @Test
  public void getCents() throws Exception {
    assertEquals(Integer.valueOf(10), this.testAmount.getCents());
  }

  @Test
  public void setCents() throws Exception {
    this.testAmount.setCents(5);
    assertEquals(Integer.valueOf(5), this.testAmount.getCents());
  }
}