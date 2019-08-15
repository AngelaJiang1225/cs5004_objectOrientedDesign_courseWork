package Problem_2;

import static org.junit.Assert.*;

import javax.smartcardio.Card;
import org.junit.Before;
import org.junit.Test;

public class CardNumberTest {

  CardNumber cardNumberTest;

  @Before
  public void setUp() throws Exception {
    this.cardNumberTest = new CardNumber(Integer.valueOf(123456789));
  }

  @Test
  public void getCardNumber() throws Exception {
    assertEquals(Integer.valueOf(123456789), this.cardNumberTest.getCardNumber());
  }

  @Test
  public void CheckNumber() throws Exception {
    assertEquals(true, this.cardNumberTest.checkNumber(this.cardNumberTest.getCardNumber()));
  }

  @Test(expected = IllegalArgumentException.class)
  public void illegalCheckNumber() throws Exception {
    assertEquals(true, this.cardNumberTest.checkNumber(this.cardNumberTest.getCardNumber()));
    CardNumber illegalCardNumber = new CardNumber(Integer.valueOf(123));
  }
}