package Problem1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VehicleTest {

  private Vehicle test_vehicle;

  @Before
  public void setUp() throws Exception {
    this.test_vehicle = new Vehicle(123456789, "046ABC",
        new Owner("Angela", "Jiang", "1234567890"));
  }

  @Test
  public void getVIN() throws Exception {
    assertTrue(test_vehicle.getVIN() == 123456789);
  }

  @Test
  public void getLicensePlate() throws Exception {
    assertEquals(test_vehicle.getLicensePlate(), "046ABC");
  }

  @Test
  public void setVIN() throws Exception {
    test_vehicle.setVIN(987654321);
    assertEquals(test_vehicle.getVIN(), Integer.valueOf(987654321));
  }

  @Test
  public void setLicensePlate() throws Exception {
    test_vehicle.setLicensePlate("123CDE");
    assertEquals(test_vehicle.getLicensePlate(), "123CDE");
  }
}