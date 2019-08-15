package src.main.Problem2;

import java.util.List;

/**
 * interface of OrderFullfillAndProcess.
 */
public interface IOrderFullfillAndProcess {
  /** Substitute the products in the shopping cart that should be replaced.
   * @param inventory      the inventory
   * @param cantSubstitute the list of stockitem
   * @return the list of stockitem that cant be substituted
   */
  List<IStockItem> fullFillOrder(IInventory inventory, List<IStockItem> cantSubstitute);

  /**
   * Check and return the list of stockitem that should be removed because of limited age.
   * @param ageLimitedRemoved the list of stockitem
   * @return the list of stockitem that should be
   */
  List<IStockItem> AgeLimitedRemoved(List<IStockItem> ageLimitedRemoved);

  /**
   * Empty the cart and return the list of stockItem the customer receive.
   * @param received the list of stock item that should be received.
   * @return the list of final received
   */
  List<IStockItem> cartEmpty(List<IStockItem> received);

  /**
   *
   * @param inventory inventory
   * @param cantSubstitute the list of stockitems that cant be replaced
   * @param ageLimited the list of stockItems the customer cannot buy because of age
   * @param received the list of stock item that should be received
   * @return true if the cart is emptied. else false
   */
  boolean orderProcessed(IInventory inventory, List<IStockItem> cantSubstitute,
                         List<IStockItem> ageLimited, List<IStockItem> received);
}
