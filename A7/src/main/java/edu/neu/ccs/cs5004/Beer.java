package edu.neu.ccs.cs5004;

/**
 * Represents beer product.
 */
public class Beer extends AbstractGroceryProduct {
  /**
   * Create beer.
   * @param manufacturer manufacturer
   * @param productName product
   * @param price price
   * @param minAge age
   * @param weight weight
   */
  public Beer(String manufacturer, String productName, double price, int minAge, double weight) {
    super(manufacturer, productName, price, minAge, weight);
  }

  public Beer(String manufacturer, String productName, double productPrice, double weight) {
    super(manufacturer, productName, productPrice, weight);
  }
}
