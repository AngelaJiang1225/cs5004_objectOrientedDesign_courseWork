package Problem_2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NameTest {

  private Name nameTest;

  @Before
  public void setUp() throws Exception {
    this.nameTest = new Name("Lin", "Shen");
  }

  @Test
  public void getFirstName() throws Exception {
    assertEquals("Lin", this.nameTest.getFirstName());
  }

  @Test
  public void getLastName() throws Exception {
    assertEquals("Shen", this.nameTest.getLastName());
  }
}