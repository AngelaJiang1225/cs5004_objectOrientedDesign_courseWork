package Problem1;

/**
 * Represents Name with information about an Artist’s first and last name
 */

public class Name {

  private String firstName;
  private String lastName;

  /**
   * Create a new name given the first name and last name of the artist.
   *
   * @param firstName the name's first name
   * @param lastName the name's last name
   */
  public Name(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  /**
   * @return the first name of the name
   */
  public String getFirstName() {
    return firstName;
  }

  /**
   * @return the last name of the name
   */
  public String getLastName() {
    return lastName;
  }
}
