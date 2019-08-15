package edu.neu.ccs.cs5004;

/**
 * Represents the cheese.
 */
public class Cheese extends AbstractGroceryProduct {
  /**
   * Create a cheese class.
   * @param manufacturer manufacturer
   * @param productName product
   * @param price price
   * @param minAge age
   * @param weight weight
   */
  public Cheese(String manufacturer, String productName, double price, int minAge, double weight) {
    super(manufacturer, productName, price, minAge, weight);
  }

  public Cheese(String manufacturer, String productName, double productPrice, double weight) {
    super(manufacturer, productName, productPrice, weight);
  }
}
