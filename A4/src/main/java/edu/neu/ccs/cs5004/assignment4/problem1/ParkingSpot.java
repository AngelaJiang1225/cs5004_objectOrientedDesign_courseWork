package edu.neu.ccs.cs5004.assignment4.problem1;


/**
 * Represents the parking spot with details--parkingType, parkingSize, parkingStatus.
 */
public class ParkingSpot {

  private ParkingType parkingType;
  private ParkingSize parkingSize;
  private ParkingStatus parkingStatus;

  /**
   * Create a parking spot with parkingType, parkingSize and parkingStatus.
   *
   * @param parkingType   the parking type of a spot
   * @param parkingSize   the size of the spot
   * @param parkingStatus the status of the spot
   */
  public ParkingSpot(ParkingType parkingType,
                     ParkingSize parkingSize, ParkingStatus parkingStatus) {
    this.parkingType = parkingType;
    this.parkingSize = parkingSize;
    this.parkingStatus = parkingStatus;
  }

  /**
   * Return the parking type.
   *
   * @return parking type
   */
  public ParkingType getParkingType() {
    return this.parkingType;
  }

  /**
   * return the parking size.
   *
   * @return parking size
   */
  public ParkingSize getParkingSize() {
    return this.parkingSize;
  }

  /**
   * return the parking status.
   *
   * @return parking status
   */
  public ParkingStatus getParkingStatus() {
    return this.parkingStatus;
  }

  /**
   * update the parking status.
   *
   * @param parkingStatus the parking status of the parking spot
   */
  public void setParkingStatus(ParkingStatus parkingStatus) {
    this.parkingStatus = parkingStatus;
  }

}
