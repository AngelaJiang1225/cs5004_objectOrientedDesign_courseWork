package edu.neu.ccs.cs5004;

/**
 * Represent the interface for the stock item.
 */
public interface IStockItem {
  public boolean hasEnoughQuantity(int requestQuantity);

  /**
   * price of the stock item.
   * @return the price of the stock item.
   */
  double getStockItemPrice();

  /**
   * return the quantity of the item.
   * @return the quantity of the item
   */
  int getQuantity();

  /**
   * return product.
   * @return the product of the product.
   */
  IProduct getProduct();

  /**
   * return quantity of this stock item.
   * @param purchaseQuantity the amount to reduce from quantity
   */
  void reduceQuantity(Integer purchaseQuantity);

  /**
   * add quantity of this stock item.
   * @param num the amount to add
   */
  public void addItem(int num);
}
