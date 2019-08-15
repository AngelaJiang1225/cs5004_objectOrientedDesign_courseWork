package Problem1;

/**
 * Represents an ActiveYear with their details--startYear,endYear and whole year.
 */
public class ActiveYear {

  private String startYear;
  private String endYear;
  private String wholeYear;

  /**
   * Creates a new active year given the ActiveYear's tartYear,endYear as strings.
   *
   * @param startYear the active year's start year
   * @param endYear the active year's  end year
   */
  public ActiveYear(String startYear, String endYear) throws IllegalArgumentException {
    if (checkYearLength(startYear, endYear) && checkYearForm(startYear, endYear)) {
      this.startYear = startYear;
      this.endYear = endYear;
      this.wholeYear = this.startYear + "-" + this.endYear;
    }
  }

  /**
   * check whether the start year and end year have length of 4
   *
   * @param startYear the active year's start year
   * @param endYear the active year's  end year
   * @return true if the length of them is 4,otherwise false
   */
  private boolean checkYearLength(String startYear, String endYear) {
    if (startYear.length() == 4 && (endYear.length() == 4 || endYear.equals("current"))) {
      return true;
    } else {
      throw new IllegalArgumentException("The years' length is illegal!");
    }
  }

  /**
   * check whether start year and end year have form of integer or the end year is "current"
   *
   * @param startYear the active year's start year
   * @param endYear the active year's  end year
   * @return true if the years can be changed into integer type or the end year is "current"
   */
  private boolean checkYearForm(String startYear, String endYear) {
    try {
      Integer.parseInt(startYear);
      if (!endYear.equals("current")) {
        Integer.parseInt(endYear);
      }
      return true;
    } catch (NumberFormatException e) {
      System.out.println("Invalid form of years!");
      return false;
    }
  }

  /**
   * @return the start year
   */
  public String getStartYear() {
    return this.startYear;
  }

  /**
   * @return the end year
   */
  public String getEndYear() {
    return this.endYear;
  }

  /**
   * @return the whole year
   */
  public String getWholeYear() {
    return this.wholeYear;
  }
}
