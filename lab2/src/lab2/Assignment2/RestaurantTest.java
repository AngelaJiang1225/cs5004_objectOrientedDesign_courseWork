package lab2.Assignment2;

import lab2.Assignment3.Menu;

import static org.junit.Assert.*;

import org.junit.Test;

public class RestaurantTest {

  private Restaurant restaurantTest;

  public RestaurantTest() {
    restaurantTest = new Restaurant("Aiqi", "528 Pontius Ave", true,
        new Menu("brunch", "applepie", "juice", "wine"));
  }

  @Test
  public void getName() {
    assertEquals(restaurantTest.getName(), "Aiqi");
  }

  @Test
  public void setName() {
    this.restaurantTest.setName("Lin Shen");
    assertEquals(this.restaurantTest.getName(), "Lin Shen");
  }

  @Test
  public void getAddress() {
    assertEquals(restaurantTest.getAddress(), "528 Pontius Ave");
  }

  @Test
  public void setAddress() {
    this.restaurantTest.setAddress("401 Terry Ave N");
    assertEquals(this.restaurantTest.getAddress(), "401 Terry Ave N");
  }

  @Test
  public void isOpen() {
    assertEquals(this.restaurantTest.isOpen(), true);
  }

  @Test
  public void setIsOpen() {
    this.restaurantTest.setIsOpen(false);
    assertEquals(this.restaurantTest.isOpen(), false);
  }
}