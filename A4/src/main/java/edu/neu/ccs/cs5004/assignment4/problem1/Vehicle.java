package edu.neu.ccs.cs5004.assignment4.problem1;

/**
 * Represent the vehicle with details.
 */
public class Vehicle {

  private VehicleType vehicleType;
  private VehicleSize vehicleSize;

  /**
   * Create a vehicle with its type and size.
   *
   * @param vehicleType the type of the vehicle
   * @param vehicleSize the size of the vehicle
   */
  public Vehicle(VehicleType vehicleType,
                 VehicleSize vehicleSize) {
    this.vehicleType = vehicleType;
    this.vehicleSize = vehicleSize;
  }

  /**
   * return vehicle type.
   *
   * @return vehicle type
   */
  public VehicleType getVehicleType() {
    return this.vehicleType;
  }

  /**
   * return the size of the vehicle.
   *
   * @return the size of the vehicle
   */
  public VehicleSize getVehicleSize() {
    return this.vehicleSize;
  }

}
