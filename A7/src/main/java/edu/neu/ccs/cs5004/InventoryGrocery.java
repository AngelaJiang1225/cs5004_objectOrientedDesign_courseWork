package edu.neu.ccs.cs5004;

import java.util.List;

/**
 * Interface for the inventoryGrocery.
 */
public class InventoryGrocery extends AbstractInventory {

  public InventoryGrocery(List<IStockItem> list) {
    super(list);
  }

  @Override
  public InventoryGrocery addStockItem(IStockItem item) throws Exception {
    if (item.getProduct() instanceof AbstractGroceryProduct) {
      this.list.add(item);
      return this;
    }
    throw new Exception("");
  }

  @Override
  public List<IStockItem> getLInventory() {
    return this.list;
  }

}
