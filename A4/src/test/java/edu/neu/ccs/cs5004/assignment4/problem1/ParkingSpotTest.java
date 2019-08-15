package edu.neu.ccs.cs5004.assignment4.problem1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ParkingSpotTest {
  ParkingSpot parkingSpotTest;

  @Before
  public void setUp() throws Exception {
    this.parkingSpotTest = new ParkingSpot(ParkingType.REGULAR, ParkingSize.SMALL, ParkingStatus.AVAILABLE);
  }

  @Test
  public void getParkingType() {
    assertEquals(ParkingType.REGULAR, this.parkingSpotTest.getParkingType());
  }

  @Test
  public void getParkingSize() {
    assertEquals(ParkingSize.SMALL, this.parkingSpotTest.getParkingSize());
  }

  @Test
  public void getParkingStatus() {
    assertEquals(ParkingStatus.AVAILABLE, this.parkingSpotTest.getParkingStatus());
  }
}