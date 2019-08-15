package edu.neu.ccs.cs5004.problem1;

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
  public void add() {
    assertEquals(new Cons(new Element(1, "A"), this.emptyTest), this.emptyTest.add(1, "A"));
  }

  @Test(expected = InvalidPopPeekEmptyException.class)
  public void peek() throws InvalidPopPeekEmptyException {
    this.emptyTest.peek();
  }

  @Test(expected = InvalidPopPeekEmptyException.class)
  public void pop() throws InvalidPopPeekEmptyException {
    this.emptyTest.pop();
  }

  @Test
  public void isEmpty() {
    assertTrue(this.emptyTest.isEmpty());
  }

  @Test
  public void equals() {
    Empty newEmpty = new Empty();
    assertTrue(this.emptyTest.equals(newEmpty));
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