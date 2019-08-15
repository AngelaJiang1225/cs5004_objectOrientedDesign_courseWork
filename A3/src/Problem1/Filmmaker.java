package Problem1;

/**
 * Represents a Filmmaker with their details--movies, series and other multimedia
 */
public class Filmmaker extends Artist {

  private String Movies;
  private String Series;
  private String multimedia;//other multimedia

  /**
   * Creates a new dancer given the filmmaker's name, age, genre,awards, movies,series and
   * multimedia as strings; activeYear is ActiveYear type,but the local variable activeYear  is
   * String.
   *
   * @param name the filmmaker's name
   * @param age the filmmaker's age
   * @param activeYear the filmmaker's activeYear
   * @param genre the filmmaker's genre
   * @param awards the filmmaker's awards
   * @param movies the filmmaker's movies
   * @param series the filmmaker's series
   * @param multimedia the filmmaker's multimedia
   */
  public Filmmaker(Name name, Integer age, ActiveYear activeYear, String genre, String awards,
      String movies, String series, String multimedia) {
    super(name, age, activeYear, genre, awards);
    this.Movies = movies;
    this.Series = series;
    this.multimedia = multimedia;
  }

  /**
   * @return the movies of the filmmaker
   */
  public String getMovies() {
    return this.Movies;
  }

  /**
   * @return the series of the filmmaker
   */
  public String getSeries() {
    return this.Series;
  }

  /**
   * @return the multimedia of the filmmaker
   */
  public String getMultimedia() {
    return this.multimedia;
  }
}
