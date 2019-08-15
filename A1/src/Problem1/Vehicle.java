/**
 * Class Vehicle, containing information about a vehicle. This class is used as a part of Problem1
 */
package Problem1;

/**
 * Vehicle is a simple object that has a unique Vehicle Identification Number (VIN), and
 * corresponding license plate.
 */
public class Vehicle {

  private Integer VIN;
  private String licensePlate;
  private Owner owner;

  /**
   * Constructor that creates a new vehicle object with the specified VIN and license plate.
   *
   * @param VIN - VIN of the new Vehicle object.
   * @param licensePlate - license plate of the new Vehicle.
   */
  public Vehicle(Integer VIN, String licensePlate, Owner owner) {
    this.VIN = VIN;
    this.licensePlate = licensePlate;
    this.owner = owner;
  }

  /**
   * Returns the VIN of the Vehicle.
   *
   * @return the VIN of the Vehicle.
   */
  public Integer getVIN() {
    return this.VIN;
  }

  /**
   * Returns the licensePlate of the Vehicle.
   *
   * @return the licensePlate of the Vehicle.
   */
  public String getLicensePlate() {
    return this.licensePlate;
  }

  /**
   * Sets the VIN of the Vehicle.
   */
  public void setVIN(Integer VIN) {
    this.VIN = VIN;
  }

  /**
   * Sets the licensePlate of the Vehicle.
   */
  public void setLicensePlate(String licensePlate) {
    this.licensePlate = licensePlate;
  }

  /**
   * return the name of the vehicle's owner's name made up of fiRst name and last name
   *
   * @return the name of the vehicle's owner's name made up of fiRst name and last name
   */
  public String getOwnerName() {
    return this.owner.getFirstName() + this.owner.getLastName();
  }

  /**
   * return the phone number of the vehicle's owner's cell phone number
   *
   * @return the phone number of the vehicle's owner's cell phone number
   */
  public String getOwnerPhone() {
    return this.owner.getPhoneNumber();
  }

}