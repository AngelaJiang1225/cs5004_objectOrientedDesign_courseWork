
package Problem3;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AccountTest {

  private Account accountTest;

  @Before
  public void setUp() throws Exception {
    Holder testHolder = new Holder("Aiqi", "Jiang");
    Amount testAmount = new Amount(100, 98);
    this.accountTest = new Account(testHolder, testAmount);
  }

  @Test
  public void getHolder() throws Exception {
    assertTrue(this.accountTest.getHolder().getFirstName().equals("Aiqi") &&
        this.accountTest.getHolder().getLastName().equals("Jiang"));
  }

  @Test
  public void setHolder() throws Exception {
    this.accountTest.setHolder(new Holder("Lin", "Shen"));
    assertTrue(this.accountTest.getHolder().getFirstName().equals("Lin")
        && this.accountTest.getHolder().getLastName().equals("Shen"));
  }

  @Test
  public void getAmount() throws Exception {
    assertEquals(Integer.valueOf(100), this.accountTest.getAmount().getDollar());
  }

  @Test
  public void deposit() throws Exception {
    Account testAccount = this.accountTest.deposit(new Amount(11, 3));
    assertTrue(testAccount.getAmount().getDollar().equals(Integer.valueOf(112)) &&
        testAccount.getAmount().getCents().equals(Integer.valueOf(1)));
  }

  @Test
  public void withdraw() throws Exception {
    Account testAccount = this.accountTest.withdraw(new Amount(10, 99));
    assertTrue(testAccount.getAmount().getDollar().equals(Integer.valueOf(89)) &&
        testAccount.getAmount().getCents().equals(Integer.valueOf(99)));
  }
}