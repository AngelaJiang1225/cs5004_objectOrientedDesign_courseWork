package edu.neu.ccs.cs5004;

/**
 * Interface of customer class.
 */
public interface ICustomer {

  /**
   * Add product to shopping cart with default quantity of one.
   *
   * @param product product
   * @param inventory inventory
   * @return a new Customer.
   */
  ICustomer addToCart(IProduct product, IInventory inventory);

  /**
   * Add product to shopping cart with defined quantity.
   *
   * @param product   the product to be added
   * @param inventory the inventory
   * @param quantity  the quantity
   * @return updated customer.
   */
  ICustomer addToCart(IProduct product, IInventory inventory, int quantity);

  /**
   * get name.
   * @return get name.
   */
  Name getName();

  /**
   * get age.
   * @return get age.
   */
  int getAge();

  /**
   * get shopping cart.
   * @return get shopping cart.
   */
  IShoppingCart getShoppingCart();
}