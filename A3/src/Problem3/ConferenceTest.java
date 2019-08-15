package Problem3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ConferenceTest {

  private Conference conferenceTest;

  @Before
  public void setUp() throws IllegalArgumentException {
    this.conferenceTest = new Conference("Meeting", new Author("Lin", "Shen"),
        1994, "Global conference", new Location("Seattle", "USA"),
        Month.SEP);
  }

  @Test
  public void getTitle() throws IllegalArgumentException {
    System.out.println(this.conferenceTest.getTitle());
    assertEquals("Meeting", this.conferenceTest.getTitle());
  }

  @Test
  public void getAuthor() throws IllegalArgumentException {
    assertEquals("Lin Shen", this.conferenceTest.getAuthor());
  }

  @Test
  public void getPassAuthor() throws IllegalArgumentException {
    assertTrue(this.conferenceTest.getPassAuthor().getFirstName().equals("Lin") &&
        this.conferenceTest.getPassAuthor().getLastName().equals("Shen")
        && this.conferenceTest.getPassAuthor().getFullName().equals("Lin Shen"));
  }

  @Test
  public void getYear() throws IllegalArgumentException {
    assertEquals(1994, this.conferenceTest.getYear());
  }

  @Test
  public void getConferenceName() throws IllegalArgumentException {
    assertEquals("Global conference", this.conferenceTest.getConferenceName());
  }

  @Test
  public void getLocation() throws IllegalArgumentException {
    assertEquals("Seattle, USA", this.conferenceTest.getLocation());
  }

  @Test
  public void getMonth() throws IllegalArgumentException {
    assertEquals(Month.SEP, this.conferenceTest.getMonth());
  }

}