/**
 * Class Owner, containing information about a owner. This class is used as a part of Problem 1.
 */
package Problem1;

/**
 * Represents an owner with their details--first name,last name and phone number
 *
 * @owner
 */
public class Owner {

  private String firstName;
  private String lastName;
  private String phoneNumber;

  /**
   * Creates a new owner given the owner's first name,last name and phone number
   */
  public Owner(String firstName, String lastName, String phoneNumber) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.phoneNumber = phoneNumber;

  }

  /**
   * return true or false for whether the phone-number is legal
   *
   * @return true or false for whether the phone-number is legal
   */
  public boolean numberChecker() {
    if (phoneNumber.toCharArray().length == 10) {
      return true;
    } else {
      return false;
    }
  }

  /**
   * return the first name of the holder
   *
   * @return the first name of the holder
   */
  public String getFirstName() {
    return this.firstName;
  }

  /**
   * sets the first name of the owner
   *
   * @param firstName the firstName of the owner
   */
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  /**
   * return the last name of the owner
   *
   * @return the last name of the owner
   */
  public String getLastName() {
    return this.lastName;
  }

  /**
   * sets the last name of the owner
   *
   * @param lastName --the last name of the owner
   */
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  /**
   * return the phone number of the owner
   *
   * @return the phone number of the holder
   */
  public String getPhoneNumber() {
    return this.phoneNumber;
  }

  /**
   * set the phone number of the holder consisting of 10 digits
   *
   * @param phoneNumber --the phone number of the holder consisting of 10 digits
   */
  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }
}
