/**
 *
 */
package lab2.Assignment2;
/**
 *
 */

import lab2.Assignment3.Menu;

/**
 *
 */
public class Restaurant {
  private String name;
  private String address;
  private boolean isOpen;
  private Menu menu;

  /**
   *
   * @param name
   * @param address
   * @param isOpen
   * @param menu
   */
  public Restaurant(String name, String address, boolean isOpen, Menu menu) {
    this.name = name;
    this.address = address;
    this.isOpen = isOpen;
    this.menu = menu;
  }

  /**
   *
   * @return name
   */
  public String getName() {
    return name;
  }

  /**
   *
   * @param name
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   *
   * @return address
   */
  public String getAddress() {
    return address;
  }

  /**
   *
   * @return
   */
  public Menu getMenu(){
    return this.menu;
  }

  /**
   *
   * @param address
   */
  public void setAddress(String address) {
    this.address = address;
  }

  /**
   *
   * @return whether it is open
   */
  public boolean isOpen() {
    return isOpen;
  }

  /**
   *
   * @param isOpen
   */
  public void setIsOpen(boolean isOpen) {
    this.isOpen = isOpen;
  }
}
