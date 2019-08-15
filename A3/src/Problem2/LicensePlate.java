package Problem2;

/**
 * Represents a licensePlate with details
 */
public class LicensePlate {

  private String vehicleNumber;
  private String state;
  private String expirationDate;

  /**
   * creates a new licensePlate with vehicleNumber,state and expirationDate
   *
   * @param vehicleNumber vehicleNumber of the plate
   * @param state state of the plate
   * @param expirationDate expirationDate of the plate
   */
  public LicensePlate(String vehicleNumber, String state, Date expirationDate) {
    this.vehicleNumber = vehicleNumber;
    this.state = state;
    this.expirationDate = expirationDate.getYear() + " " + expirationDate.getMonth();
  }

  /**
   * @return vehicleNumber
   */
  public String getVehicleNumber() {
    return this.vehicleNumber;
  }

  /**
   * @return state
   */
  public String getState() {
    return this.state;
  }

  /**
   * @return expirationDate
   */
  public String getExpirationDate() {
    return this.expirationDate;
  }
}
