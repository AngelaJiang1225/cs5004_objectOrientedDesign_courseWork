package edu.neu.ccs.cs5004;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheeseTest {
  Cheese newCheese;
  Cheese newCheese1;
  @Before
  public void setUp() throws Exception {
    newCheese = new Cheese("ABRAND", "ANAME", 2.3, 21, 3.0);
    newCheese1 = new Cheese("a", "B", 2.3, 3.0);
  }

  @Test
  public void getWeight() {
    assertTrue(newCheese.getWeight() == 3.0);
    assertTrue(newCheese1.getWeight() == 3.0);
  }

  @Test
  public void getDefaultAge() {
    assertEquals(0, newCheese.getDefaultAge());
    assertEquals(0, newCheese1.getDefaultAge());
  }

  @Test
  public void getManufacture() {
    assertEquals("ABRAND", newCheese.getManufacture());
    assertEquals("a", newCheese1.getManufacture());

  }

  @Test
  public void getProductName() {
    assertEquals("ANAME", newCheese.getProductName());
    assertEquals("B", newCheese1.getProductName());
  }

  @Test
  public void getProductPrice() {
    assertTrue(newCheese.getProductPrice() == 2.3);
    assertTrue(newCheese1.getProductPrice() == 2.3);
  }

  @Test
  public void getMinAge() {
    assertTrue(newCheese.getMinAge() == 21);
    assertTrue(newCheese1.getMinAge() == 0);
  }
}