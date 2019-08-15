package edu.neu.ccs.cs5004;

/**
 * Represents the stockitem.
 */
public class StockItem implements IStockItem {
  private IProduct product;
  private int quantity;

  /**
   * Create a stockitem with details.
   * @param products products
   * @param quantity quantity
   */
  public StockItem(IProduct products, int quantity) {
    this.product = products;
    this.quantity = quantity;
  }

  /**
   * Set the quantity of the item.
   * @param quantity set the quantity of the stockitem.
   */
  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  @Override
  public boolean hasEnoughQuantity(int requestQuantity) {
    return this.quantity >= requestQuantity;
  }

  @Override
  public void reduceQuantity(Integer purchaseQuantity) {
    if (this.hasEnoughQuantity(purchaseQuantity)) {
      this.setQuantity(this.getQuantity() - purchaseQuantity);
    }
  }

  @Override
  public int getQuantity() {
    return this.quantity;
  }

  @Override
  public IProduct getProduct() {
    return this.product;
  }

  @Override
  public void addItem(int num) {
    this.setQuantity(num + this.getQuantity());
  }

  @Override
  public double getStockItemPrice() {
    return this.getQuantity() * this.getProduct().getProductPrice();
  }
}
