package edu.neu.ccs.cs5004;

/**
 * Represent the salmon class.
 */
public class Salmon extends AbstractGroceryProduct {
  /**
   * Create a salmon with details.
   * @param manufacturer manufacturer
   * @param productName productName
   * @param price  price
   * @param minAge minAge
   * @param weight weight
   */
  public Salmon(String manufacturer, String productName, double price, int minAge, double weight) {
    super(manufacturer, productName, price, minAge, weight);
  }

  public Salmon(String manufacturer, String productName, double productPrice, double weight) {
    super(manufacturer, productName, productPrice, weight);
  }
}
