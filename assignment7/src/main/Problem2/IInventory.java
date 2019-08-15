package src.main.Problem2;

import java.util.List;

/**
 * Represents the interface for the inventory.
 */
public interface IInventory {
  /**
   * Add the stock item into the inventory.
   * @param item the item to be added
   * @return
   * @throws Exception
   */
  IInventory addStockItem(IStockItem item) throws Exception;

  /**
   * Return the inventory.
   * @return the inventory
   */
  List<IStockItem> getLInventory();

  /**
   * Return the total retailValue of the inventory.
   * @return the total retailValue of the inventory
   */
  double getTotalReTailValue();

  /**
   * Justify whether it has the product, if yes return the index of the product in the inventory;
   * else return -1.
   * @param stockItem the stock Item
   * @return true if the product has the product.
   */
  int containsProduct(IStockItem stockItem);
}
