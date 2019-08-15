package src.main.Problem2;

/**
 * Represents the product.
 */
public abstract class AbstractProduct implements IProduct {
  String manufacturer;
  String productName;
  double productPrice;
  int minAge;
  int DEFAULT_AGE = 0;

  /**
   * Constructor called when minAge is specified.
   *
   * @param manufacturer
   * @param productName
   * @param productPrice
   * @param minAge
   */
  public AbstractProduct(String manufacturer, String productName, double productPrice, int minAge) {
    this.manufacturer = manufacturer;
    this.productName = productName;
    this.productPrice = productPrice;
    this.minAge = minAge;
  }

  /**
   * Constructor called when minAge is not specified
   * set minAge to default 0
   *
   * @param manufacturer
   * @param productName
   * @param productPrice
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
  public int getDEFAULT_AGE() {
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
