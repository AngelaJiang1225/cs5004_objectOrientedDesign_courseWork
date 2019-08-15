package Problem3;

/**
 * Represents an Author with their details
 */
public class Author {

  private String firstName;
  private String lastName;
  private String fullName;

  /**
   * Create a author with first name and last name
   *
   * @param firstName of author
   * @param lastName of author
   */
  public Author(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.fullName = firstName + " " + lastName;
  }

  /**
   * @return firstName
   */
  public String getFirstName() {
    return this.firstName;
  }

  /**
   * @return lastName
   */
  public String getLastName() {
    return this.lastName;
  }

  /**
   * @return fullName
   */
  public String getFullName() {
    return this.fullName;
  }
}