package src.main.Problem2;

/**
 * Represent the shampoo class.
 */
public class Shampoo extends AbstractHouseholdProduct {
  /**
   * Create a shampoo class.
   * @param manufacturer manufacturer
   * @param productName productName
   * @param price price
   * @param minAge minAge
   * @param unit unit
   */
  public Shampoo(String manufacturer, String productName, double price, int minAge, int unit) {
    super(manufacturer, productName, price, minAge, unit);
  }

  public Shampoo(String manufacturer, String productName, double productPrice, int unit) {
    super(manufacturer, productName, productPrice, unit);
  }
}
