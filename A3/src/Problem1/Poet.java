package Problem1;

/**
 * Represents a Poet with their details
 */
public class Poet extends Artist {

  /**
   * Creates a new poet given the poet's name, age, genre,awards, movies,series and multimedia as
   * strings; activeYear is ActiveYear type,but the local variable activeYear  is String.
   *
   * @param name the poet's name
   * @param age the poet's age
   * @param activeYear the poet's activeYear
   * @param genre the poet's genre
   * @param awards the poet's awards
   */
  public Poet(Name name, Integer age, ActiveYear activeYear, String genre, String awards) {
    super(name, age, activeYear, genre, awards);
  }

}
