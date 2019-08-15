package edu.neu.ccs.cs5004.problem1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ElementTest {
  private Element elementTest;

  @Before
  public void setUp() throws Exception {
    this.elementTest = new Element(1, "A");
  }

  @Test(expected = IllegalArgumentException.class)
  public void checkPriority() throws IllegalArgumentException {
    Element element = new Element(-1, "B");
  }

  @Test
  public void getPriority() {
    assertEquals(new Integer(1), this.elementTest.getPriority());
  }

  @Test
  public void getValue() {
    assertEquals("A", this.elementTest.getValue());
  }

  @Test
  public void equals() {
    assertTrue(this.elementTest.equals(new Element(1, "A")));
  }

  @Test
  public void hashCodeTest() {
    assertEquals(96, this.elementTest.hashCode());
  }

  @Test
  public void toStringTest() {
    assertEquals("Element{priority=1, value=A}", this.elementTest.toString());
  }
}