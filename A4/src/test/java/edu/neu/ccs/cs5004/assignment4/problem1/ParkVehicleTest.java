package edu.neu.ccs.cs5004.assignment4.problem1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ParkVehicleTest {

  ParkVehicle parkVehicleTest;

  @Before
  public void setUp() throws Exception {
    parkVehicleTest = new ParkVehicle();
  }

  @Test
  public void parkVehicleRes() {
    assertEquals(true, this.parkVehicleTest.parkVehicleRes(new Vehicle(VehicleType.DISABILITY, VehicleSize.SMALL),
        new ParkingSpot(ParkingType.REGULAR, ParkingSize.LARGE, ParkingStatus.AVAILABLE)));
  }

  @Test
  public void invalidTypeParkVehicleRes() {
    this.parkVehicleTest.parkVehicleRes(new Vehicle(VehicleType.REGULAR, VehicleSize.SMALL),
        new ParkingSpot(ParkingType.DISABILITY, ParkingSize.LARGE, ParkingStatus.AVAILABLE));
  }

  @Test
  public void invalidSizeParkVehicleRes() {
    this.parkVehicleTest.parkVehicleRes(new Vehicle(VehicleType.REGULAR, VehicleSize.LARGE),
        new ParkingSpot(ParkingType.REGULAR, ParkingSize.SMALL, ParkingStatus.AVAILABLE));
  }

  @Test
  public void unavailableSizeParkVehicleRes() {
    this.parkVehicleTest.parkVehicleRes(new Vehicle(VehicleType.REGULAR, VehicleSize.SMALL),
        new ParkingSpot(ParkingType.REGULAR, ParkingSize.SMALL, ParkingStatus.TAKEN));
  }
}