package Problem1;

/**
 * Represents an abstract Artist with their details--name,age,activeYear,genre,awards,ageLow,ageHigh
 */
public abstract class Artist {

  protected Name name;
  protected int age;
  protected String activeYear;
  protected String genre;
  protected String awards;
  protected final static int ageLow = 0;
  protected final static int ageHigh = 128;

  /**
   * (abstract)Creates a new artist given the name,age,activeYear,genre,awards
   *
   * @param name the artist's name
   * @param age the artist's age
   * @param activeYear the artist's active years
   * @param genre the artist's genre
   * @param awards the artist's awards
   */
  public Artist(Name name, int age, ActiveYear activeYear, String genre, String awards) {
    this.name = name;
    if (this.checkAge(age)) {
      this.age = age;
    }
    this.activeYear = activeYear.getWholeYear();
    this.genre = genre;
    this.awards = awards;
  }

  /**
   * check if the age is within the range
   *
   * @param age the artist's age
   * @return true or false
   */
  private boolean checkAge(int age) throws IllegalArgumentException {
    if (age >= this.ageLow && this.age <= this.ageHigh) {
      return true;
    } else {
      throw new IllegalArgumentException("The age is out of range!");
    }
  }

  /**
   * @return the name of the artist
   */
  public Name getName() {
    return this.name;
  }

  /**
   * @return the age of the artist
   */
  public int getAge() {
    return this.age;
  }

  /**
   * @return the active year of artist
   */
  public String getActiveYear() {
    return this.activeYear;
  }

  /**
   * @return genre
   */
  public String getGenre() {
    return this.genre;
  }

  /**
   * @return awards
   */
  public String getAwards() {
    return this.awards;
  }
}



