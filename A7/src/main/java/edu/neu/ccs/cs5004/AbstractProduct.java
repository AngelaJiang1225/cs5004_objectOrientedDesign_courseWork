package edu.neu.ccs.cs5004;

/**
 * Represents the product.
 */
public abstract class AbstractProduct implements IProduct {
  static final int DEFAULT_AGE = 0;
  String manufacturer;
  String productName;
  double productPrice;
  int minAge;

  /**
   * Constructor called when minAge is specified.
   * @param manufacturer manufacturer
   * @param productName product
   * @param productPrice price
   * @param minAge age
   */
  public AbstractProduct(String manufacturer, String productName, double productPrice, int minAge) {
    this.manufacturer = manufacturer;
    this.productName = productName;
    this.productPrice = productPrice;
    this.minAge = minAge;
  }

  /**
   * Constructor called when minAge is not specified.
   * set minAge to default 0
   *
   * @param manufacturer manufacturer
   * @param productName product
   * @param productPrice price
   */
  public AbstractProduct(String manufacturer, String productName, double productPrice) {
    this.manufacturer = manufacturer;
    this.productName = productName;
    this.productPrice = productPrice;
    this.minAge = DEFAULT_AGE;
  }

  /**
   * Return the default age.
   * @return the default age
   */
  public int getDefaultAge() {
    return DEFAULT_AGE;
  }

  @Override
  public String getManufacture() {
    return this.manufacturer;
  }

  @Override
  public String getProductName() {
    return this.productName;
  }

  @Override
  public double getProductPrice() {
    return this.productPrice;
  }

  @Override
  public int getMinAge() {
    return this.minAge;
  }
}
