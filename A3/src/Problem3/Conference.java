package Problem3;

/**
 * Represents a conference with details
 */
public class Conference extends Publication {

  private String conferenceName;
  private String location;
  private Month month;

  /**
   * Create conference with title, author, year,conferenceName,location and month
   *
   * @param title of conference
   * @param author of conference
   * @param year of conference
   * @param conferenceName of conference
   * @param location of conference
   * @param month of conference
   */
  public Conference(String title, Author author, int year, String conferenceName,
      Location location, Month month) {
    super(title, author, year);
    this.conferenceName = conferenceName;
    this.location = location.getLocation();
    this.month = month;

  }

  /**
   * \
   *
   * @return conferenceName
   */
  public String getConferenceName() {
    return conferenceName;
  }

  /**
   * @return location
   */
  public String getLocation() {
    return location;
  }

  /**
   * @return month
   */
  public Month getMonth() {
    return month;
  }

}
