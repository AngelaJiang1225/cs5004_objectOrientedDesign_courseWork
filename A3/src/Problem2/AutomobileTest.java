package Problem2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AutomobileTest {

  Automobile automobileTest;

  @Before
  public void setUp() throws Exception {
    automobileTest = new Automobile("white", new MakeModel("Audi", "A4 Sedan"),
        new LicensePlate("414-ZOZ", "California", new Date(Month.APRIL, 1994)),
        60, "Northbound");
  }


  @Test(expected = IllegalArgumentException.class)
  public void checkVelocity() throws IllegalArgumentException {
    Automobile automobileTest2 = new Automobile("white", new MakeModel("Audi", "A4 Sedan"),
        new LicensePlate("414-ZOZ", "California", new Date(Month.APRIL, 1994)),
        -1, "Northbound");
  }

  @Test(expected = IllegalArgumentException.class)
  public void checkDirection() throws IllegalArgumentException {
    Automobile automobileTest3 = new Automobile("white", new MakeModel("Audi", "A4 Sedan"),
        new LicensePlate("414-ZOZ", "California", new Date(Month.APRIL, 1994)),
        60, "westeast");
  }

  @Test
  public void acceleration() throws Exception {
    this.automobileTest.acceleration(15);
    assertTrue(69 == this.automobileTest.getVelocity() && this.automobileTest.getVelocity() == 69);
  }

  @Test(expected = IllegalArgumentException.class)
  public void IllegalAcceleration() throws Exception {
    this.automobileTest.acceleration(9);
  }

  @Test(expected = IllegalArgumentException.class)
  public void checkAccelerationFactor() throws IllegalArgumentException {
    this.automobileTest.checkAccelerationFactor(0);
  }

  @Test(expected = InvalidAccelerationException.class)
  public void InvalidAcceleration() throws InvalidAccelerationException {
    this.automobileTest.acceleration(50);
  }

  @Test
  public void getColor() {
    assertEquals("white", this.automobileTest.getColor());
  }

  @Test
  public void getMakeAndModel() {
    assertTrue("Audi".equals(this.automobileTest.getMakeAndModel().getMake()) && "A4 Sedan"
        .equals(this.automobileTest.getMakeAndModel().getModel()));
  }

  @Test
  public void getLicensePlate() {
    assertTrue(this.automobileTest.licensePlate.getVehicleNumber().equals("414-ZOZ")
        && this.automobileTest.licensePlate.getState().equals("California")
        && this.automobileTest.licensePlate.getExpirationDate().equals("1994 APRIL"));
  }

  @Test
  public void getVelocity() {
    assertTrue(60 == this.automobileTest.getVelocity());
  }

  @Test
  public void getDirection() {
    assertEquals("Northbound", this.automobileTest.getDirection());
  }

  @Test
  public void deceleration() throws InvalidDecelerationException {
    this.automobileTest.deceleration(20);
    assertTrue(48 == this.automobileTest.velocity);
  }

  @Test(expected = IllegalArgumentException.class)
  public void checkDecelerationFactor() throws IllegalArgumentException {
    this.automobileTest.checkDecelerationFactor(80);
  }

  @Test(expected = InvalidDecelerationException.class)
  public void invalidDeceleration() throws InvalidDecelerationException {
    this.automobileTest.deceleration(50);
    System.out.println(this.automobileTest.getVelocity());
  }

  @Test
  public void directionChange() throws InvalidDirectionException {
    this.automobileTest.directionChange("Southbound");
    assertEquals("Southbound", this.automobileTest.getDirection());
  }

  @Test(expected = InvalidDirectionException.class)
  public void illegalDirectionChange() throws InvalidDirectionException {
    this.automobileTest.directionChange("Westbound");
  }

}