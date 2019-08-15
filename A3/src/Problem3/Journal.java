package Problem3;

/**
 * Represents journal with details
 */
public class Journal extends Publication {

  private String journalName;
  private int issue;
  private Month month;

  /**
   * Create a journal
   *
   * @param title of journal
   * @param author of journal
   * @param year of journal
   * @param journalName of journal
   * @param issue of journal
   * @param month of journal
   */
  public Journal(String title, Author author, int year, String journalName, int issue,
      Month month) {
    super(title, author, year);
    this.journalName = journalName;
    this.issue = issue;
    this.month = month;
  }

  /**
   * \
   *
   * @return journalName
   */
  public String getJournalName() {
    return this.journalName;
  }

  /**
   * @return issue
   */
  public int getIssue() {
    return this.issue;
  }

  /**
   * @return month
   */
  public Month getMonth() {
    return this.month;
  }
}
