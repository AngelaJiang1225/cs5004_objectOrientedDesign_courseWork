package Problem2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MakeModelTest {

  MakeModel makeModelTest;

  @Before
  public void setUp() throws Exception {
    makeModelTest = new MakeModel("Audi", "A4 Sedan");
  }

  @Test
  public void getMake() {
    assertEquals("Audi", this.makeModelTest.getMake());
  }

  @Test
  public void getModel() {
    assertEquals("A4 Sedan", this.makeModelTest.getModel());
  }
}