package Problem3;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HolderTest {

  Holder testHolder;

  @Before
  public void setUp() throws Exception {
    testHolder = new Holder("Aiqi", "Jiang");
  }

  @Test
  public void getFirstName() throws Exception {
    assertEquals("Aiqi", this.testHolder.getFirstName());

  }

  @Test
  public void setFirstName() throws Exception {
    this.testHolder.setFirstName("Lin");
    assertEquals("Lin", this.testHolder.getFirstName());
  }

  @Test
  public void getLastName() throws Exception {
    assertEquals("Jiang", this.testHolder.getLastName());
  }

  @Test
  public void setLastName() throws Exception {
    this.testHolder.setLastName("Shen");
    assertEquals("Shen", this.testHolder.getLastName());
  }
}