package edu.neu.ccs.cs5004.problem1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConsTest {
  private Element testElement1;
  private Element testElement2;
  private Element testElement3;
  private Cons consTest1;
  private Cons consTest2;
  private Cons consTest3;

  @Before
  public void setUp() throws Exception {
    this.testElement1 = new Element(1, "A");
    this.testElement2 = new Element(3, "C");
    this.testElement3 = new Element(2, "B");
    this.consTest1 = new Cons(this.testElement1, new Empty());
    this.consTest2 = new Cons(this.testElement3, this.consTest1);
  }

  @Test
  public void getFirst() {
    assertEquals(this.testElement1, this.consTest1.getFirst());
  }

  @Test
  public void getRest() {
    assertEquals(this.consTest1, this.consTest2.getRest());
  }

  @Test
  public void add() {
    this.consTest2 = this.consTest1.add(this.testElement2.getPriority(), this.testElement2.getValue());
    assertEquals(this.testElement2, this.consTest2.getFirst());
    this.consTest3 = this.consTest2.add(this.testElement3.getPriority(), this.testElement3.getValue());
    assertEquals(this.testElement2, this.consTest3.getFirst());
  }

  @Test
  public void pop() {
    this.consTest2 = this.consTest1.add(this.testElement2.getPriority(), this.testElement2.getValue());
    assertEquals(this.consTest1, this.consTest2.pop());
  }

  @Test
  public void peek() {
    assertEquals(this.testElement3.getValue(), this.consTest2.peek());
  }

  @Test
  public void isEmpty() {
    assertEquals(false, this.consTest2.isEmpty());
  }

  @Test
  public void equals() {
    assertEquals(new Cons(this.testElement1, new Empty()), this.consTest1);
  }

  @Test
  public void hashCodeTest() {
    assertEquals(3018, this.consTest1.hashCode());
  }

  @Test
  public void toStringTest() {
    this.consTest3 = this.consTest2.add(this.testElement2.getPriority(), this.testElement2.getValue());
    assertEquals("Cons{(3, C), (2, B), (1, A)}", this.consTest3.toString());
  }
}