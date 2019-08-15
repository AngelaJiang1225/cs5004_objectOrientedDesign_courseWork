package edu.neu.ccs.cs5004;

import java.util.List;

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
    this.received = received;
    this.outStock = outStock;
    this.ageLimit = ageLimit;
    this.totalPrice = this.getTotalPrice();
  }

  /**
   * Get the total price of the receipt.
   * @return the list of items that cant be replaced
   */
  public double getTotalPrice() {
    double value = 0.0;
    int index = 0;
    while (index < this.getReceived().size()) {
      value += this.getReceived().get(index).getStockItemPrice();
      index ++;
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
