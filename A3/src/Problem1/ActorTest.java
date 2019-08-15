package Problem1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ActorTest {

  private Actor actorTest;

  @Before
  public void setUp() throws Exception {
    this.actorTest = new Actor(new Name("Angela", "Shen"), 22, new ActiveYear("1990", "2019"),
        "Romantic",
        "Best Actor, Best Performance", "Dream night;Hello world", "Modern family", "DVD");
  }

  @Test(expected = IllegalArgumentException.class)
  public void checkAge() throws IllegalArgumentException {
    Actor actorTest2 = new Actor(new Name("Angela", "Shen"), -1, new ActiveYear("1990", "2019"),
        "Romantic",
        "Best Actor, Best Performance", "Dream night;Hello world", "Modern family", "DVD");

  }

  @Test
  public void getMovies() {
    assertEquals("Dream night;Hello world", this.actorTest.getMovies());
  }

  @Test
  public void getSeries() {
    assertEquals("Modern family", this.actorTest.getSeries());
  }

  @Test
  public void getMultimedia() {
    assertEquals("DVD", this.actorTest.getMultimedia());
  }

  @Test
  public void getName() {
    assertTrue(this.actorTest.getName().getFirstName() == "Angela"
        && this.actorTest.getName().getLastName() == "Shen");
  }

  @Test
  public void getAge() {
    assertEquals(22, this.actorTest.getAge());
  }

  @Test
  public void getActiveYear() {
    assertEquals("1990-2019", this.actorTest.getActiveYear());
  }

  @Test
  public void getGenre() {
    assertEquals("Romantic", this.actorTest.getGenre());
  }

  @Test
  public void getAwards() {
    assertEquals("Best Actor, Best Performance", this.actorTest.getAwards());
  }
}