package edu.neu.ccs.cs5004;

import java.util.List;

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
    return this.list;
  }

  @Override
  public double calculateTotalPrice(List<IStockItem> list, int index) {
    if (index == list.size()) {
      return 0.0;
    } else {
      return list.get(index).getStockItemPrice() + this.calculateTotalPrice(list, index + 1);
    }
  }
}
