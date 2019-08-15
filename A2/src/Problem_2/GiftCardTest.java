package Problem_2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class GiftCardTest {

  GiftCard giftCardTest;

  @Before
  public void setUp() throws Exception {
    giftCardTest = new GiftCard(
        new CardOwner(new Name("Lin", "Shen"), "301 Terry Ave", "angela@gmail.com"),
        new CardNumber(Integer.valueOf(123456789)),
        new Balance(Integer.valueOf(6), Integer.valueOf(40)));
  }

  @Test
  public void getCardOwner() throws Exception {
    assertTrue("Lin" == this.giftCardTest.getCardOwner().getFirstName()
        && "Shen" == this.giftCardTest.getCardOwner().getLastName()
        && "301 Terry Ave" == this.giftCardTest.getCardOwner().getAddress()
        && "angela@gmail.com" == this.giftCardTest.getCardOwner().getEmail());
  }

  @Test
  public void getCardNumber() throws Exception {
    assertEquals(Integer.valueOf(123456789), this.giftCardTest.getCardNumber());
  }

  @Test
  public void getBalance() throws Exception {
    assertTrue(Integer.valueOf(6) == this.giftCardTest.getBalance().getDollar()
        && Integer.valueOf(40) == this.giftCardTest.getBalance().getCent());
  }

  @Test(expected = Exception.class)
  public void illegalDepositGiftName() throws Exception {
    Balance balance = new Balance(Integer.valueOf(11), Integer.valueOf(80));
    Name name = new Name("Aiqi", "Jiang");
    CardNumber cardNumber = new CardNumber(this.giftCardTest.getCardNumber());
    Deposit deposit = new Deposit(balance, name, cardNumber);
    this.giftCardTest.depositGift(deposit);
  }

  @Test(expected = Exception.class)
  public void illegalDepositGiftCardNumber() throws Exception {
    Balance balance = new Balance(Integer.valueOf(11), Integer.valueOf(80));
    Name name = new Name(this.giftCardTest.getCardOwner().getFirstName(),
        this.giftCardTest.getCardOwner().getLastName());
    CardNumber cardNumber = new CardNumber(Integer.valueOf(987654321));
    this.giftCardTest.depositGift(new Deposit(balance, name, cardNumber));
  }

  @Test
  public void depositGift() throws Exception {
    Balance balance = new Balance(Integer.valueOf(11), Integer.valueOf(80));
    Name name = new Name(this.giftCardTest.getCardOwner().getFirstName(),
        this.giftCardTest.getCardOwner().getLastName());
    CardNumber cardNumber = new CardNumber(this.giftCardTest.getCardNumber());
    Deposit deposit = new Deposit(balance, name, cardNumber);
    GiftCard updatedDeposit = this.giftCardTest.depositGift(deposit);
    assertTrue(updatedDeposit.getBalance().getDollar() == Integer.valueOf(18)
        && updatedDeposit.getBalance().getCent() == Integer.valueOf(20));
  }
}