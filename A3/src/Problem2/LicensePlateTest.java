package Problem2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LicensePlateTest {

  LicensePlate licensePlateTest;

  @Before
  public void setUp() throws Exception {
    this.licensePlateTest = new LicensePlate("123-ZOZ", "California", new Date(Month.APRIL, 1993));
  }

  @Test
  public void getVehicleNumber() {
    assertEquals("123-ZOZ", this.licensePlateTest.getVehicleNumber());
  }

  @Test
  public void getState() {
    assertEquals("California", this.licensePlateTest.getState());
  }

  @Test
  public void getExpirationDate() {
    assertEquals("1993 APRIL", this.licensePlateTest.getExpirationDate());
  }
}