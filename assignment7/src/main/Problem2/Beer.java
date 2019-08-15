package src.main.Problem2;

/**
 * Represents beer product.
 */
public class Beer extends AbstractGroceryProduct {
  /**
   * Create beer.
   * @param manufacturer
   * @param productName
   * @param price
   * @param minAge
   * @param weight
   */
  public Beer(String manufacturer, String productName, double price, int minAge, double weight) {
    super(manufacturer, productName, price, minAge, weight);
  }

  public Beer(String manufacturer, String productName, double productPrice, double weight) {
    super(manufacturer, productName, productPrice, weight);
  }
}
