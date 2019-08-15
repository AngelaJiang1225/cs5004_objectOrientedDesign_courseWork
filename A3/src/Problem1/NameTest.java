package Problem1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NameTest {

  private Name nameTest;

  @Before
  public void setUp() throws Exception {
    nameTest = new Name("Angela", "Shen");
  }

  @Test
  public void getFirstName() {
    assertEquals("Angela", this.nameTest.getFirstName());
  }

  @Test
  public void getLastName() {
    assertEquals("Shen", this.nameTest.getLastName());
  }
}