package src.main.Problem2;

/**
 * Represents the cheese.
 */
public class Cheese extends AbstractGroceryProduct {
  /**
   * Create a cheese class.
   * @param manufacturer
   * @param productName
   * @param price
   * @param minAge
   * @param v
   */
  public Cheese(String manufacturer, String productName, double price, int minAge, double v) {
    super(manufacturer, productName, price, minAge);
  }

  public Cheese(String manufacturer, String productName, double productPrice, double weight) {
    super(manufacturer, productName, productPrice, weight);
  }
}
