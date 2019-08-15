package edu.neu.ccs.cs5004.problem2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BagConsTest {
  private String testFirst;
  private BagOfWords BagOfWordsTest1;
  private BagOfWords BagOfWordsTest2;

  @Before
  public void setUp() throws Exception {
    this.BagOfWordsTest1 = BagOfWords.emptyBagOfWords();
    this.testFirst = "hello";
    this.BagOfWordsTest2 = new BagCons(this.testFirst, new Empty());
  }

  @Test
  public void getFirst() {
    assertEquals(this.testFirst, ((BagCons) this.BagOfWordsTest2).getFirst());
  }

  @Test
  public void getRest() {
    assertEquals(new Empty(), ((BagCons) this.BagOfWordsTest2).getRest());
  }

  @Test
  public void isEmpty() {
    assertTrue(this.BagOfWordsTest1.isEmpty() && !this.BagOfWordsTest2.isEmpty());
  }

  @Test
  public void size() {
    assertEquals(1, (int) (this.BagOfWordsTest2).size());
  }

  @Test
  public void add() {
    String testSecond = "Shake";
    this.BagOfWordsTest2.add(testSecond);
    System.out.println(this.BagOfWordsTest2);
    assertFalse(this.BagOfWordsTest2.contains(testSecond));
    assertTrue(this.BagOfWordsTest2.contains(this.testFirst));
  }

  @Test
  public void contains() {
    assertEquals(true, this.BagOfWordsTest2.contains(this.testFirst));
    assertFalse(this.BagOfWordsTest2.contains("C"));
  }

  @Test
  public void equals() {
    BagCons temp = new BagCons("hello", new Empty());
    assertFalse(this.BagOfWordsTest1.equals(temp));
    assertTrue(this.BagOfWordsTest2.equals(temp));
  }

  @Test
  public void remove() {
    assertEquals(this.BagOfWordsTest2, ((BagCons) this.BagOfWordsTest2).remove("orange"));
    assertEquals(new Empty(), ((BagCons) this.BagOfWordsTest2).remove(this.testFirst));

  }

  @Test
  public void hashCodeTest() {
    System.out.println(this.BagOfWordsTest2.hashCode());
    //assertEquals();
  }

  @Test
  public void toStringTest() {
    System.out.println(this.BagOfWordsTest2.toString());
    System.out.println(this.BagOfWordsTest1.toString());
  }
}