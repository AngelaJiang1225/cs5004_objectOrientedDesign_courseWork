package Problem3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class JournalTest {

  Journal journalTest;

  @Before
  public void setUp() throws Exception {
    this.journalTest = new Journal("Country", new Author("John", "Bake"), 1996, "Economics", 24,
        Month.SEP);
  }

  @Test
  public void getJournalName() {
    assertEquals("Economics", this.journalTest.getJournalName());
  }

  @Test
  public void getIssue() {
    assertEquals(24, this.journalTest.getIssue());
  }

  @Test
  public void getMonth() {
    assertEquals(Month.SEP, this.journalTest.getMonth());
  }
}