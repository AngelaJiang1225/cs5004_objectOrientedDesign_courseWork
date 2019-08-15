package edu.neu.ccs.cs5004;

/**
 * Represents the interface for product.
 */
public interface IProduct {
  /**
   * Return the Manufacture.
   * @return the Manufacture.
   */
  public String getManufacture();

  /**
   * return the product name of the product.
   * @return the product name of the product.
   */
  public String getProductName();

  /**
   * Get the product's price.
   * @return the price
   */
  public double getProductPrice();

  /**
   * Return the products's minage
   * @return the products's minage.
   */
  public int getMinAge();

}

