package edu.neu.ccs.cs5004;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PaperTowelTest {
  PaperTowel newPaperTowel;
  PaperTowel newPaperTowel1;
  @Before
  public void setUp() throws Exception {
    newPaperTowel = new PaperTowel("ABRAND", "ANAME", 2.3, 21, 3);
    newPaperTowel1 = new PaperTowel("a", "B", 3.8, 50);
  }

  @Test
  public void getWeight() {
    assertTrue(newPaperTowel.getUnit() == 3);
    assertTrue(newPaperTowel1.getUnit() == 50);
  }

  @Test
  public void getDefaultAge() {
    assertEquals(0, newPaperTowel.getDefaultAge());
    assertEquals(0, newPaperTowel1.getDefaultAge());
  }

  @Test
  public void getManufacture() {
    assertEquals("ABRAND", newPaperTowel.getManufacture());
    assertEquals("a", newPaperTowel1.getManufacture());

  }

  @Test
  public void getProductName() {
    assertEquals("ANAME", newPaperTowel.getProductName());
    assertEquals("B", newPaperTowel1.getProductName());
  }

  @Test
  public void getProductPrice() {
    assertTrue(newPaperTowel.getProductPrice() == 2.3);
    assertTrue(newPaperTowel1.getProductPrice() == 3.8);
  }

  @Test
  public void getMinAge() {
    assertTrue(newPaperTowel.getMinAge() == 21);
    assertTrue(newPaperTowel1.getMinAge() == 0);
  }
}