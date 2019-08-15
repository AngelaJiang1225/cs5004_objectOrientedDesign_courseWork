/**
 * Class Holder, containing information about holder. This class is used as a part of Problem 3.
 */
package Problem3;


public class Holder {

  private String firstName;
  private String lastName;

  /**
   * Constructor that creates a new Holder object with firstName and lastName
   *
   * @param firstName --the first name of the holder
   * @param lastName --the last name of the holder
   */
  public Holder(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
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
   * sets the first name of the holder
   *
   * @param firstName --the first name of the holder
   */
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  /**
   * return the last name of the holder
   *
   * @return the last name of the holder
   */
  public String getLastName() {
    return this.lastName;
  }

  /**
   * sets the last name of the holder
   *
   * @param lastName -- the last name of the holder
   */
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
}
