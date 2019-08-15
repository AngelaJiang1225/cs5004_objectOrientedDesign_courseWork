package edu.neu.ccs.cs5004;

import java.util.LinkedList;
import java.util.List;

/**
 * Represent the supermarket class.
 */
public class Supermarket implements ISupermarket {
  IOrderFullfillAndProcess order;
  IInventory inventory;
  List<IStockItem> cantSubstitute;
  List<IStockItem> ageLimited;
  List<IStockItem> received;

  /**
   * Create a supermarket.
   * @param order order
   * @param inventory inventory
   */
  public Supermarket(IOrderFullfillAndProcess order, IInventory inventory) {
    this.order = order;
    this.inventory = inventory;
    this.cantSubstitute = new LinkedList<>();
    this.ageLimited = new LinkedList<>();
    this.received = new LinkedList<>();

  }

  /**
   * get the order.
   * @return order
   */
  public IOrderFullfillAndProcess getOrder() {
    return this.order;
  }

  /**
   * Get the inventory.
   * @return the inventory
   */
  public IInventory getInventory() {
    return this.inventory;
  }

  /**
   * Get the CantSubstitute list.
   * @return the CantSubstitute list.
   */
  public List<IStockItem> getCantSubstitute() {
    return this.cantSubstitute;
  }

  /**
   * Get AgeLimited list.
   * @return AgeLimited list.
   */
  public List<IStockItem> getAgeLimited() {
    return this.ageLimited;
  }

  /**
   * Get the list of received.
   * @return get the list of received.
   */
  public List<IStockItem> getReceived() {
    return this.received;
  }

  /**
   * generate receipt
   * @return receipt.
   */
  public Receipt generateReceipt() {
    if (this.getOrder().orderProcessed(this.getInventory(), this.cantSubstitute,
        this.ageLimited, this.received)) {
      return new Receipt(this.received, cantSubstitute, ageLimited);
    }
    return null;
  }
}
