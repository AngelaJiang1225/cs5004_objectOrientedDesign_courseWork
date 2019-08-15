package Problem3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LocationTest {

  Location locationTest;

  @Before
  public void setUp() throws IllegalArgumentException {
    locationTest = new Location("SEAttle", "uSa");
  }

  @Test
  public void getCity() {
    assertEquals("Seattle", this.locationTest.getCity());
  }
  //

  @Test
  public void getCountry() {
    assertEquals("USA", this.locationTest.getCountry());
  }

  @Test
  public void getLocation() {
    assertEquals("Seattle, USA", this.locationTest.getLocation());
  }
}