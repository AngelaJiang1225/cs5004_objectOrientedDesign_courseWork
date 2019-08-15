package edu.neu.ccs.cs5004.problem2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmptyTest {
  private Empty emptyTest;

  @Before
  public void setUp() throws Exception {
    this.emptyTest = new Empty();
  }

  @Test
  public void isEmpty() {
    assertEquals(true, this.emptyTest.isEmpty());
  }

  @Test
  public void size() {
    assertEquals(new Integer(0), this.emptyTest.size());
  }

  @Test
  public void add() {
    assertEquals(new BagCons("hello", this.emptyTest), this.emptyTest.add("hello"));
  }

  @Test
  public void contains() {
    assertFalse(this.emptyTest.contains("hello"));
  }

  @Test
  public void remove() {
    assertEquals(this.emptyTest, this.emptyTest.remove("hi"));
  }

  @Test
  public void equals() {
    assertTrue(this.emptyTest.equals(new Empty()));
  }

  @Test
  public void hashCodeTest() {
    assertEquals(42, this.emptyTest.hashCode());
  }

  @Test
  public void toStringTest() {
    assertEquals("Empty{}", this.emptyTest.toString());
  }
}