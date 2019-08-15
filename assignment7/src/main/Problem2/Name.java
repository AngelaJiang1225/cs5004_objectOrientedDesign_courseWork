package src.main.Problem2;

public class Name {
  String lastName;
  String middleName;
  String firstName;

  /**
   * Constructor called when middle name is given
   *
   * @param lastName
   * @param middleName
   * @param firstName
   */
  public Name(String lastName, String middleName, String firstName) {
    this.lastName = lastName;
    this.middleName = middleName;
    this.firstName = firstName;
  }

  /**
   * Constructor called when middle name is not given
   *
   * @param lastName
   * @param firstName
   */
  public Name(String lastName, String firstName) {
    this.lastName = lastName;
    this.firstName = firstName;
    this.middleName = null;
  }

  public String getLastName() {
    return lastName;
  }

  public String getMiddleName() {
    return middleName;
  }

  public String getFirstName() {
    return firstName;
  }
}

