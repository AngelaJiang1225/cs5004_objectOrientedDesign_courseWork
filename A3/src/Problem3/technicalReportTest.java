package Problem3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class technicalReportTest {

  technicalReport technicalReportTest;

  @Before
  public void setUp() throws Exception {
    this.technicalReportTest = new technicalReport("Computer", new Author("Bill", "Gates"),
        2000, 3425, "American Centre");
  }

  @Test
  public void getTrID() {
    assertEquals(3425, this.technicalReportTest.getTrID());
  }

  @Test
  public void getInstitution() {
    assertEquals("American Centre", this.technicalReportTest.getInstitution());
  }

  @Test
  public void changeToJournal() {
    Journal journalTest;
    journalTest = this.technicalReportTest.changeToJournal("Times", 2256, Month.AUG, 2018);
    assertTrue(
        journalTest.getTitle().equals("Computer") && journalTest.getAuthor().equals("Bill Gates")
            && journalTest.getJournalName() == "Times" && journalTest.getIssue() == 2256
            && journalTest.getMonth() == Month.AUG
            && journalTest.getYear() == 2018);
  }
}