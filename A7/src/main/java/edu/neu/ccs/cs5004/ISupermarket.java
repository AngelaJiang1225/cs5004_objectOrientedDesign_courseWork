package edu.neu.ccs.cs5004;

import java.util.List;

/**
 * Interface for supermarket.
 */
public interface ISupermarket {
  /**
   * Generate the receipt
   * @return the newly created receipt.
   */
  Receipt generateReceipt();

  /**
   * order fullfill.
   * @return the order.
   */
  IOrderFullfillAndProcess getOrder();

  /**
   * Get the inventory.
   * @return the inventory
   */
  IInventory getInventory();

  /**
   * Get the list of cant substitute.
   * @return  the list of cant substitute
   */
  List<IStockItem> getCantSubstitute();

  /**
   * return the list of products that is removed cause age.
   * @return the list of products that is removed cause age.
   */
  List<IStockItem> getAgeLimited();

  /**
   * received getter.
   * @return the list of received getter.
   */
  List<IStockItem> getReceived();

}
