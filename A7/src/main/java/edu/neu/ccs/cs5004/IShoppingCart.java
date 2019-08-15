package edu.neu.ccs.cs5004;

import java.util.List;

/**
 * Represent the interface for the shopping cart.
 */
public interface IShoppingCart {
  /**
   * Return the list of stockitem in the shopping cart
   * @return the list of stockitem in the shopping cart.
   */
  List<IStockItem> getList();

  /**
   * Caculate and return the total value of the shopping cart.
   * @param list the stockItem list
   * @param index iterator helper
   * @return the total value of the shopping cart.
   */
  double calculateTotalPrice(List<IStockItem> list, int index);

}

