package edu.neu.ccs.cs5004;

/**
 * Represent the AbstractGroceryProduct.
 */
public abstract class AbstractGroceryProduct extends AbstractProduct {
  double weight;

  /**
   * Create a new AbstractGroceryProduct with details including minAge.
   * @param manufacturer manufacturer
   * @param productName product
   * @param productPrice price
   * @param minAge the minAge that the product is defined
   * @param weight weight
   */
  public AbstractGroceryProduct(String manufacturer, String productName,
                                double productPrice, int minAge, double weight) {
    super(manufacturer, productName, productPrice, minAge);
    this.weight = weight;
  }


  /**
   * Create a new AbstractGroceryProduct with details.
   * @param manufacturer manufacture
   * @param productName product
   * @param productPrice price
   * @param weight weight
   */
  public AbstractGroceryProduct(String manufacturer, String productName,
                                double productPrice, double weight) {
    super(manufacturer, productName, productPrice);
    this.weight = weight;
  }

  /**
   * return the weight of the product.
   * @return the weight of the product
   */
  public double getWeight() {
    return this.weight;
  }

}
