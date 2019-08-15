package edu.neu.ccs.cs5004.assignment4.problem1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class VehicleTest {

  Vehicle vehicleTest;

  @Before
  public void setUp() throws Exception {
    vehicleTest = new Vehicle(VehicleType.DISABILITY, VehicleSize.SMALL);
  }

  @Test
  public void getVehicleType() {
    assertEquals(VehicleType.DISABILITY, this.vehicleTest.getVehicleType());
  }

  @Test
  public void getVehicleSize() {
    assertEquals(VehicleSize.SMALL, this.vehicleTest.getVehicleSize());
  }
}