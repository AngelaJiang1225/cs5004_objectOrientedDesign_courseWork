package Problem3;

/**
 * Represents location with details
 */
public class Location {

  private String city;
  private String country;
  private static final int START = 0;
  private static final int END = 1;

  /**
   * Create a location
   */
  public Location(String city, String country) {
    this.city = city;
    this.country = country;
  }

  /**
   * @return city
   */
  public String getCity() {
    String a =
        this.city.substring(START, END).toUpperCase() + this.city.substring(END).toLowerCase();
    return a;

  }

  /**
   * @return country
   */
  public String getCountry() {
    return this.country.toUpperCase();
  }

  /**
   * @return location
   */
  public String getLocation() {
    String tempCity =
        this.city.substring(0, 1).toUpperCase() + this.city.substring(1).toLowerCase();
    String tempCountry = this.country.toUpperCase();
    return (tempCity + ", " + tempCountry);
  }
}
