package Problem_2;

/**
 * Represents an owner of card with their details-- first name,last name, address, email address
 *
 * @cardOwner
 */
public class CardOwner {

  private String firstName;
  private String lastName;
  private String address;
  private String email;

  /**
   * set the card owner's fist name, last name,address and email address
   *
   * @param name the name of the card owner
   * @param address the address of the card owner
   * @param email the email address of the card owner
   */
  public CardOwner(Name name, String address, String email) {
    this.firstName = name.getFirstName();
    this.lastName = name.getLastName();
    this.address = address;
    this.email = email;
  }

  /**
   * @return the first name of the card owner
   */
  public String getFirstName() {
    return this.firstName;
  }

  /**
   * @return the last name of the card owner
   */
  public String getLastName() {
    return this.lastName;
  }

  /**
   * @return the address of the card owner
   */
  public String getAddress() {
    return this.address;
  }

  /**
   * @return the email address of the card owner
   */
  public String getEmail() {
    return this.email;
  }
}
