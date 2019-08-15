package Problem2;

/**
 * Represents a date
 */
public class Date {

  private Month month;
  private int year;

  /**
   * Creates a new date with month and  year
   *
   * @param month the month of date
   * @param year the year of date
   */
  public Date(Month month, int year) {
    this.month = month;
    this.year = year;
  }

  /**
   * @return month
   */
  public Month getMonth() {
    return month;
  }

  /**
   * @return year
   */
  public int getYear() {
    return year;
  }
}
