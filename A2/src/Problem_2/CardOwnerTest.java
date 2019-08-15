package Problem_2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CardOwnerTest {

  CardOwner cardOwnerTest;

  @Before
  public void setUp() throws Exception {
    cardOwnerTest = new CardOwner(new Name("Lin", "Shen"), "301 Terry Ave", "angela@gmail.com");
  }

  @Test
  public void getFirstName() throws Exception {
    assertEquals("Lin", this.cardOwnerTest.getFirstName());
  }

  @Test
  public void getLastName() throws Exception {
    assertEquals("Shen", this.cardOwnerTest.getLastName());
  }

  @Test
  public void getAddress() throws Exception {
    assertEquals("301 Terry Ave", this.cardOwnerTest.getAddress());
  }

  @Test
  public void getEmail() throws Exception {
    assertEquals("angela@gmail.com", this.cardOwnerTest.getEmail());
  }
}