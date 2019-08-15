package Problem1;

/**
 * Represents a Musician with their details
 */
public class Musician extends Artist {

  /**
   * Creates a new musician given the musician's name, age, genre,awards, movies,series and
   * multimedia as strings; activeYear is ActiveYear type,but the local variable activeYear  is
   * String.
   *
   * @param name the musician's name
   * @param age the musician's age
   * @param activeYear the musician's activeYear
   * @param genre the musician's genre
   * @param awards the musician's awards
   */
  public Musician(Name name, Integer age, ActiveYear activeYear, String genre,
      String awards) {
    super(name, age, activeYear, genre, awards);
  }
}
