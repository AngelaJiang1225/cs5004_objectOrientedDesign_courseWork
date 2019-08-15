package Problem3;

/**
 * Represent technicalReport
 */
public class technicalReport extends Publication {

  private int trID;
  private String institution;

  /**
   * Create  technicalReport
   */
  public technicalReport(String title, Author author, int year, int trID,
      String institution) throws IllegalArgumentException {
    super(title, author, year);
    this.trID = trID;
    this.institution = institution;
  }

  /**
   * @return trID
   */
  public int getTrID() {
    return trID;
  }

  /**
   * @return institution
   */
  public String getInstitution() {
    return institution;
  }

  /**
   * change the technical report into journal
   */
  public Journal changeToJournal(String journalName, int issue, Month month,
      int year) {
    Journal journal = new Journal(this.title, this.getPassAuthor(), year, journalName, issue,
        month);
    return journal;
  }

}
