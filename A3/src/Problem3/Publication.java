package Problem3;

/**
 * Represents Publication absract class
 */
public abstract class Publication {

  protected String title;
  protected String author;
  protected Author passAuthor;//for changetoJournal method in technicalReport class
  protected int year;
  private static final int LEN = 4;

  /**
   * Create Publication
   */
  public Publication(String title, Author author, int year) throws IllegalArgumentException {
    this.title = title;
    this.passAuthor = author;
    this.author = author.getFullName();
    if (String.valueOf(year).length() == this.LEN) {
      this.year = year;
    } else {
      throw new IllegalArgumentException("The year is illegal!");
    }
  }

  /**
   * @return title
   */
  public String getTitle() {
    return this.title;
  }

  /**
   * @return passAuthor
   */
  public Author getPassAuthor() {
    return this.passAuthor;
  }

  /**
   * @return author
   */
  public String getAuthor() {
    return this.author;
  }

  /**
   * @return year
   */
  public int getYear() {
    return this.year;
  }
}
