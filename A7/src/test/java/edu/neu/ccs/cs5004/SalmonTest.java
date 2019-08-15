package edu.neu.ccs.cs5004;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SalmonTest {
  Salmon newSalmon;
  Salmon newSalmon1;
  @Before
  public void setUp() throws Exception {
    newSalmon = new Salmon("ABRAND", "ANAME", 2.3, 21, 3.0);
    newSalmon1 = new Salmon("a", "B", 3.8, 50.5);
  }

  @Test
  public void getWeight() {
    assertTrue(newSalmon.getWeight() == 3.0);
    assertTrue(newSalmon1.getWeight() == 50.5);
  }

  @Test
  public void getDEFAULT_AGE() {
    assertEquals(0, newSalmon.getDefaultAge());
    assertEquals(0, newSalmon1.getDefaultAge());
  }

  @Test
  public void getManufacture() {
    assertEquals("ABRAND", newSalmon.getManufacture());
    assertEquals("a", newSalmon1.getManufacture());

  }

  @Test
  public void getProductName() {
    assertEquals("ANAME", newSalmon.getProductName());
    assertEquals("B", newSalmon1.getProductName());
  }

  @Test
  public void getProductPrice() {
    assertTrue(newSalmon.getProductPrice() == 2.3);
    assertTrue(newSalmon1.getProductPrice() == 3.8);
  }

  @Test
  public void getMinAge() {
    assertTrue(newSalmon.getMinAge() == 21);
    assertTrue(newSalmon1.getMinAge() == 0);
  }
}