package edu.neu.ccs.cs5004;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NameTest {
  Name nameHasMiddle = new Name("Bing", "Muriel", "Chandler");
  Name nameNoMiddle = new Name("Geller", "Ross");

  @Before
  public void setUp() throws Exception {
  }

  @Test
  public void getLastName() {
    assertEquals("Bing", nameHasMiddle.getLastName());
    assertEquals("Geller", nameNoMiddle.getLastName());
  }

  @Test
  public void getMiddleName() {
    assertEquals("Muriel", nameHasMiddle.getMiddleName());
    assertEquals(null, nameNoMiddle.getMiddleName());

  }

  @Test
  public void getFirstName() {
    assertEquals("Ross", nameNoMiddle.getFirstName());
    assertEquals("Chandler", nameHasMiddle.getFirstName());
  }
}