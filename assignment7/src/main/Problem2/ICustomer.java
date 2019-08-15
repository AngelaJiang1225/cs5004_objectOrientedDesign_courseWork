package src.main.Problem2;

/**
 * Interface of customer class.
 */
public interface ICustomer {
  /**
   * Add product to shopping cart with default quantity of one.
   *
   * @param product
   * @param inventory
   * @return a new Customer
   */
  ICustomer addToCart(IProduct product, IInventory inventory);

  /**
   * Add product to shopping cart with defined quantity.
   *
   * @param product   the product to be added
   * @param inventory the inventory
   * @param quantity  the quantity
   * @return updated customer
   */
  ICustomer addToCart(IProduct product, IInventory inventory, int quantity);
}