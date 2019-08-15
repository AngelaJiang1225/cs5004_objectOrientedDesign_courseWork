package Problem1;

/**
 * Represents an Dancer with their details--movies, series and other multimedia
 */
public class Dancer extends Artist {

  private String Movies;
  private String Series;
  private String multimedia;

  /**
   * Creates a new dancer given the dancer's name, age, genre,awards, movies,series and multimedia
   * as strings; activeYear is ActiveYear type,but the local variable activeYear  is String.
   *
   * @param name the dancer's name
   * @param age the dancer's age
   * @param activeYear the dancer's activeYear
   * @param genre the dancer's genre
   * @param awards the dancer's awards
   * @param movies the dancer's movies
   * @param series the dancer's series
   * @param multimedia the dancer's multimedia
   */
  public Dancer(Name name, Integer age, ActiveYear activeYear, String genre, String awards,
      String movies, String series, String multimedia) {
    super(name, age, activeYear, genre, awards);
    Movies = movies;
    Series = series;
    this.multimedia = multimedia;
  }

  /**
   * @return the movies of the dancer
   */
  public String getMovies() {
    return this.Movies;
  }

  /**
   * @return the series of the dancer
   */
  public String getSeries() {
    return this.Series;
  }

  /**
   * @return the multimedia of the dancer
   */
  public String getMultimedia() {
    return this.multimedia;
  }
}
