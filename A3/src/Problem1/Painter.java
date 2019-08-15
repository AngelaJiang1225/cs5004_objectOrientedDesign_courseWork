package Problem1;

/**
 * Represents a painter with their details
 */
public class Painter extends Artist {

  /**
   * Creates a new painter given the painter's name, age, genre,awards, movies,series and multimedia
   * as strings; activeYear is ActiveYear type,but the local variable activeYear  is String.
   *
   * @param name the painter's name
   * @param age the painter's age
   * @param activeYear the painter's activeYear
   * @param genre the painter's genre
   * @param awards the painter's awards
   */
  public Painter(Name name, Integer age, ActiveYear activeYear, String genre, String awards) {
    super(name, age, activeYear, genre, awards);
  }
}
