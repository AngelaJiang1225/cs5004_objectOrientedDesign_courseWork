package edu.neu.ccs.cs5004;

/**
 * Represents the AbstractHouseholdProduct.
 */
public abstract class AbstractHouseholdProduct extends AbstractProduct {
  protected int unit;

  /**
   * Create an AbstractHouseholdProduct with details including age.
   * @param manufacturer manufacturer
   * @param productName product
   * @param productPrice price
   * @param minAge with defined min age
   * @param unit unit
   */

  public AbstractHouseholdProduct(String manufacturer, String productName,
                                  double productPrice, int minAge, int unit) {
    super(manufacturer, productName, productPrice, minAge);
    this.unit = unit;
  }

  /**
   * Create an AbstractHouseholdProduct.
   * @param manufacturer manufacturer
   * @param productName product
   * @param productPrice price
   * @param unit unit
   */
  public AbstractHouseholdProduct(String manufacturer, String productName,
                                  double productPrice, int unit) {
    super(manufacturer, productName, productPrice);
    this.unit = unit;
  }


  /**
   * Return the unit of the product.
   * @return the unit of the product
   */
  public int getUnit() {
    return this.unit;
  }
}
