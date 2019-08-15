package src.main.Problem2;

import java.util.*;

/**
 * Represent the receipt.
 */
public class Receipt {
  private double totalPrice;
  private List<IStockItem> received;
  private List<IStockItem> outStock;
  private List<IStockItem> ageLimit;

  /**
   * Create a new receipt.
   * @param received the list of items to be received.
   * @param outStock the list of items that cant be replaced.
   * @param ageLimit the age limit.
   */
  public Receipt(List<IStockItem> received, List<IStockItem> outStock, List<IStockItem> ageLimit) {
    this.totalPrice = this.getTotalPrice(received);
    this.received = received;
    this.outStock = outStock;
    this.ageLimit = ageLimit;
  }

  /**
   * Get the total price of the receipt.
   * @param received the list of items to be received
   * @return the list of items that cant be replaced
   */
  public double getTotalPrice(List<IStockItem> received) {
    double value = 0.0;
    Iterator<IStockItem> it = this.getReceived().iterator();
    while (it.hasNext()) {
      value += it.next().getStockItemPrice();
    }
    return value;
  }

  /**
   * Receive the list of stockitem that can be received
   * @return the list of stockitem that can be received.
   */
  public List<IStockItem> getReceived() {
    return this.received;
  }

  /**
   * Get the list of stock items that cannot be substituted.
   * @return the list of stock items that cannot be substituted.
   */
  public List<IStockItem> getOutStock() {
    return outStock;
  }

  /**
   * Get the list of stock item that is beyond age limit.
   * @return the list of stock item that is beyond age limit.
   */
  public List<IStockItem> getAgeLimit() {
    return ageLimit;
  }
}
