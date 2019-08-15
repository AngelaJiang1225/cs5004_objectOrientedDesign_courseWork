package Problem_2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BalanceTest {

  Balance balanceTest;

  @Before
  public void setUp() throws Exception {
    this.balanceTest = new Balance(2, 99);
  }

  @Test
  public void getDollar() throws Exception {
    assertEquals(Integer.valueOf(2), this.balanceTest.getDollar());
  }

  @Test
  public void getCent() throws Exception {
    assertEquals(Integer.valueOf(99), this.balanceTest.getCent());
  }

  @Test
  public void checkBalance() throws Exception {
    assertEquals(true,
        this.balanceTest.checkBalance(this.balanceTest.getDollar(), this.balanceTest.getCent()));
  }

  @Test(expected = IllegalArgumentException.class)
  public void illegalCheckBalance() throws Exception {
    Balance illegalBalance = new Balance(-1, 99);
    illegalBalance.checkBalance(illegalBalance.getDollar(), illegalBalance.getCent());
  }
}