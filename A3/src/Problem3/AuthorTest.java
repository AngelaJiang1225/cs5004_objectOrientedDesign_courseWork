package Problem3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AuthorTest {

  private Author authorTest;

  @Before
  public void setUp() {
    this.authorTest = new Author("Lin", "Shen");
  }

  @Test
  public void getFirstName() {
    assertEquals("Lin", this.authorTest.getFirstName());
  }

  @Test
  public void getLastName() {
    assertEquals("Shen", this.authorTest.getLastName());
  }

  @Test
  public void getFullName() {
    System.out.println(this.authorTest.getFullName());
    assertEquals("Lin Shen", this.authorTest.getFullName());
  }

}