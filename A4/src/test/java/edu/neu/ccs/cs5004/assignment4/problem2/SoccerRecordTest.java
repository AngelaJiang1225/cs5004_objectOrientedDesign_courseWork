package edu.neu.ccs.cs5004.assignment4.problem2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SoccerRecordTest {
  SoccerRecord soccerRecordTest;

  @Before
  public void setUp() throws Exception {
    this.soccerRecordTest = new SoccerRecord(2, 3, 4);
  }

  @Test
  public void getNumWin() {
    assertEquals(2, this.soccerRecordTest.getNumWin());
  }

  @Test
  public void getNumLoss() {
    assertEquals(3, this.soccerRecordTest.getNumLoss());
  }

  @Test
  public void setNumWin() {
    this.soccerRecordTest.setNumWin(6);
    assertEquals(6, this.soccerRecordTest.getNumWin());
  }

  @Test
  public void setNumLoss() {
    this.soccerRecordTest.setNumLoss(5);
    assertEquals(5, this.soccerRecordTest.getNumLoss());
  }

  @Test
  public void getNumTies() {
    assertEquals(4, this.soccerRecordTest.getNumTies());
  }

  @Test
  public void getPointsSum() {
    assertEquals(10, this.soccerRecordTest.getPointsSum());
  }

  @Test
  public void setNumTies() {
    this.soccerRecordTest.setNumTies(7);
    assertEquals(7, this.soccerRecordTest.getNumTies());
  }
}