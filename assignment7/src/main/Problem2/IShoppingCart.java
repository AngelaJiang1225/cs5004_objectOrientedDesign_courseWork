package src.main.Problem2;

import java.util.*;

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
   * @param i iterator helper
   * @return the total value of the shopping cart.
   */
  Double calculateTotalPrice(List<IStockItem> list, int i);

}

