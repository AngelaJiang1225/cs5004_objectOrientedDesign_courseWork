package Problem_2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DepositTest {

  Deposit depositTest;

  @Before
  public void setUp() throws Exception {
    depositTest = new Deposit(new Balance(Integer.valueOf(2), Integer.valueOf(90)),
        new Name("Lin", "Shen"),
        new CardNumber(Integer.valueOf(123456789)));
  }

  @Test
  public void getGiftAmountDollar() throws Exception {
    assertEquals(Integer.valueOf(2), this.depositTest.getGiftAmountDollar());
  }

  @Test
  public void getGiftAmountCent() throws Exception {
    assertEquals(this.depositTest.getGiftAmountCent(), Integer.valueOf(90));
  }

  @Test
  public void checkAmount() throws Exception {
    assertEquals(true, this.depositTest
        .checkAmount(this.depositTest.getGiftAmountDollar(), this.depositTest.getGiftAmountCent()));
  }

  @Test(expected = IllegalArgumentException.class)
  public void illegalCheckAmount() throws Exception {
    Deposit illegalDeposit = new Deposit(new Balance(300, 11), new Name("jaq", "hi"),
        new CardNumber(Integer.valueOf(987654321)));
  }

  @Test
  public void getFirstName() throws Exception {
    assertEquals("Lin", this.depositTest.getFirstName());
  }

  @Test
  public void getLastName() throws Exception {
    assertEquals("Shen", this.depositTest.getLastName());
  }

  @Test
  public void getCardNumber() throws Exception {
    assertEquals(Integer.valueOf(123456789), this.depositTest.getCardNumber());
  }

}