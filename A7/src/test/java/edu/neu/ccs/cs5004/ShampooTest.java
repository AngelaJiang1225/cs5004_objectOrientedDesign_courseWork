package edu.neu.ccs.cs5004;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShampooTest {
  Shampoo newShampoo;
  Shampoo newShampoo1;
  @Before
  public void setUp() throws Exception {
    newShampoo = new Shampoo("ABRAND", "ANAME", 2.3, 21, 3);
    newShampoo1 = new Shampoo("a", "B", 3.8, 50);
  }

  @Test
  public void getWeight() {
    assertTrue(newShampoo.getUnit() == 3);
    assertTrue(newShampoo1.getUnit() == 50);
  }

  @Test
  public void getDEFAULT_AGE() {
    assertEquals(0, newShampoo.getDefaultAge());
    assertEquals(0, newShampoo1.getDefaultAge());
  }

  @Test
  public void getManufacture() {
    assertEquals("ABRAND", newShampoo.getManufacture());
    assertEquals("a", newShampoo1.getManufacture());

  }

  @Test
  public void getProductName() {
    assertEquals("ANAME", newShampoo.getProductName());
    assertEquals("B", newShampoo1.getProductName());
  }

  @Test
  public void getProductPrice() {
    assertTrue(newShampoo.getProductPrice() == 2.3);
    assertTrue(newShampoo1.getProductPrice() == 3.8);
  }

  @Test
  public void getMinAge() {
    assertTrue(newShampoo.getMinAge() == 21);
    assertTrue(newShampoo1.getMinAge() == 0);
  }
}