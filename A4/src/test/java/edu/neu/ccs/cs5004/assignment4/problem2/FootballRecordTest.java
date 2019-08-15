package edu.neu.ccs.cs5004.assignment4.problem2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FootballRecordTest {
  FootballRecord footballRecordTest;

  @Before
  public void setUp() throws Exception {
    this.footballRecordTest = new FootballRecord(3, 4, 5);
  }

  @Test
  public void getPointsSum() {
    assertEquals(3, this.footballRecordTest.getPointsSum());
  }

  @Test
  public void getNumTies() {
    assertEquals(5, this.footballRecordTest.getNumTies());
  }

  @Test
  public void setNumTies() {
    this.footballRecordTest.setNumTies(6);
    assertEquals(6, this.footballRecordTest.getNumTies());
  }
}