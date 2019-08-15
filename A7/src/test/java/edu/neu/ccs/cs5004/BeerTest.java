package edu.neu.ccs.cs5004;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BeerTest {
  Beer newBeer;
  Beer newBeer1;
  @Before
  public void setUp() throws Exception {
    newBeer = new Beer("ABRAND", "ANAME", 2.3, 21, 3.0);
    newBeer1 = new Beer("a", "B", 3.8, 50.5);
  }

  @Test
  public void getWeight() {
    assertTrue(newBeer.getWeight() == 3.0);
    assertTrue(newBeer1.getWeight() == 50.5);
  }

  @Test
  public void getDEFAULT_AGE() {
    assertEquals(0, newBeer.getDefaultAge());
    assertEquals(0, newBeer1.getDefaultAge());
  }

  @Test
  public void getManufacture() {
    assertEquals("ABRAND", newBeer.getManufacture());
    assertEquals("a", newBeer1.getManufacture());

  }

  @Test
  public void getProductName() {
    assertEquals("ANAME", newBeer.getProductName());
    assertEquals("B", newBeer1.getProductName());
  }

  @Test
  public void getProductPrice() {
    assertTrue(newBeer.getProductPrice() == 2.3);
    assertTrue(newBeer1.getProductPrice() == 3.8);
  }

  @Test
  public void getMinAge() {
    assertTrue(newBeer.getMinAge() == 21);
    assertTrue(newBeer1.getMinAge() == 0);
  }
}