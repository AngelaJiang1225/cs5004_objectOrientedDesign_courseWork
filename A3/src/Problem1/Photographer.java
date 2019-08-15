package Problem1;

/**
 * Represents a Photographer with their details
 */
public class Photographer extends Artist {

  /**
   * Creates a new photographer given the photographer's name, age, genre,awards, movies,series and
   * multimedia as strings; activeYear is ActiveYear type,but the local variable activeYear  is
   * String.
   *
   * @param name the photographer's name
   * @param age the photographer's age
   * @param activeYear the photographer's activeYear
   * @param genre the photographer's genre
   * @param awards the photographer's awards
   */
  public Photographer(Name name, Integer age, ActiveYear activeYear, String genre,
      String awards) {
    super(name, age, activeYear, genre, awards);
  }
}
