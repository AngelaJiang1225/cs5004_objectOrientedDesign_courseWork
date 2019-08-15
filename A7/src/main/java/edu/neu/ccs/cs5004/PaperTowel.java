package edu.neu.ccs.cs5004;

/**
 * Represent the paperTowel class.
 */
public class PaperTowel extends AbstractHouseholdProduct {
  /**
   * Create a new papertowel with details.
   * @param manufacturer manufacturer
   * @param productName productName
   * @param price price
   * @param minAge min age
   * @param unit unit
   */
  public PaperTowel(String manufacturer, String productName, double price, int minAge, int unit) {
    super(manufacturer, productName, price, minAge, unit);
  }

  public PaperTowel(String manufacturer, String productName, double productPrice, int unit) {
    super(manufacturer, productName, productPrice, unit);
  }
}
