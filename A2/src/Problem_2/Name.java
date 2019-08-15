package Problem_2;

/**
 * Represents the name of the card owner
 *
 * @name
 */
public class Name {

  private String firstName;
  private String lastName;

  /**
   * @param firstName the first name of the card owner
   * @param lastName the last name of the card owner
   */
  public Name(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  /**
   * @return the first name of the card owner
   */
  public String getFirstName() {
    return firstName;
  }

  /**
   * @return the first name of the card owner
   */
  public String getLastName() {
    return lastName;
  }
}
