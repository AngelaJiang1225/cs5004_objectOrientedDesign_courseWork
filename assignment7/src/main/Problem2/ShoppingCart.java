package src.main.Problem2;

import java.util.*;

/**
 * Represent the shopping cart.
 */
public class ShoppingCart implements IShoppingCart {
  List<IStockItem> list;

  /**
   * Create a shopping list with details.
   * @param list a list of stockItem
   */
  public ShoppingCart(List<IStockItem> list) {
    this.list = list;
  }

  public List<IStockItem> getList() {
    return list;
  }

  @Override
  public Double calculateTotalPrice(List<IStockItem> list, int i) {
    if (list.get(i) == null) {
      return 0.0;
    }
    return list.get(0).getStockItemPrice() + this.calculateTotalPrice(list, i + 1);
  }
}
