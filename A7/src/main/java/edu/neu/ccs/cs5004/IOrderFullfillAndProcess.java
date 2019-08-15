package edu.neu.ccs.cs5004;

import java.util.List;

/**
 * interface of OrderFullfillAndProcess.
 */
public interface IOrderFullfillAndProcess {

  /**
   * get customer.
   * @return get customer.
   */
  ICustomer getCustomer();

  /** Substitute the products in the shopping cart that should be replaced.
   * @param inventory      the inventory
   * @param cantSubstitute the list of stock item
   * @return the list of stock item that cant be substituted
   */
  List<IStockItem> fullFillOrder(IInventory inventory, List<IStockItem> cantSubstitute);

  /**
   * Check and return the list of stock item that should be removed because of limited age.
   * @param ageLimitedRemoved the list of stock item
   * @return the list of stock item that should be
   */
  List<IStockItem> ageLimitedRemoved(List<IStockItem> ageLimitedRemoved);

  /**
   * Empty the cart and return the list of stockItem the customer receive.
   */
  void cartEmpty();

  /**
   *
   * @param inventory inventory
   * @param cantSubstitute the list of stock items that cant be replaced
   * @param ageLimited the list of stockItems the customer cannot buy because of age
   * @param received the list of stock item that should be received
   * @return true if the cart is emptied. else false
   */
  boolean orderProcessed(IInventory inventory, List<IStockItem> cantSubstitute,
                         List<IStockItem> ageLimited, List<IStockItem> received);

  /**
   * find items need substitution.
   * @param item item
   * @param inventory inventory
   * @return find items need substitution.
   */
  boolean needSubstitute(IStockItem item, IInventory inventory);

  /**
   * return items can substitute.
   * @param item item
   * @param inventory inventory
   * @return return items can substitute.
   */
  IStockItem canSubstitute(IStockItem item, IInventory inventory);
}