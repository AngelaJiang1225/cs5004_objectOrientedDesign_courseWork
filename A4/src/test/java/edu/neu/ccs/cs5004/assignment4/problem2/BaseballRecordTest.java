package edu.neu.ccs.cs5004.assignment4.problem2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BaseballRecordTest {
  BaseballRecord baseballRecordTest;

  @Before
  public void setUp() throws Exception {
    this.baseballRecordTest = new BaseballRecord(7, 7);
  }

  @Test
  public void getNumWin() {
    assertEquals(7, this.baseballRecordTest.getNumWin());
  }

  @Test
  public void getNumLoss() {
    assertEquals(7, this.baseballRecordTest.getNumLoss());
  }

  @Test
  public void setNumWin() {
    this.baseballRecordTest.setNumWin(8);
    assertEquals(8, this.baseballRecordTest.getNumWin());
  }

  @Test
  public void setNumLoss() {
    this.baseballRecordTest.setNumLoss(8);
    assertEquals(8, this.baseballRecordTest.getNumLoss());
  }

  @Test
  public void getPointsSum() {
    assertEquals(7, this.baseballRecordTest.getPointsSum());
  }
}