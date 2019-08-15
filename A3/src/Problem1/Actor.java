package Problem1;

/**
 * Represents an Artist with their details--movies, series and other multimedia
 */
public class Actor extends Artist {

  private String Movies;
  private String Series;
  private String multimedia;

  /**
   * Creates a new actor given the actor's name, age, genre,awards, movies,series and multimedia as
   * strings; activeYear is ActiveYear type,but the local variable activeYear  is String.
   *
   * @param name the actor's name
   * @param age the actor's age
   * @param activeYear the actor's activeYear
   * @param genre the actor's genre
   * @param awards the actor's awards
   * @param movies the actor's movies
   * @param series the actor's series
   * @param multimedia the actor's multimedia
   */
  public Actor(Name name, int age, ActiveYear activeYear, String genre, String awards,
      String movies, String series, String multimedia) {
    super(name, age, activeYear, genre, awards);
    this.Movies = movies;
    this.Series = series;
    this.multimedia = multimedia;
  }

  /**
   * @return the movies of the actor
   */
  public String getMovies() {
    return Movies;
  }

  /**
   * @return the series of the actor
   */
  public String getSeries() {
    return Series;
  }

  /**
   * @return the multimedia of the actor
   */
  public String getMultimedia() {
    return multimedia;
  }
}
