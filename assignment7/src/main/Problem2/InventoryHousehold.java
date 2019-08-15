package src.main.Problem2;

import java.util.List;

public class InventoryHousehold extends AbstractInventory {

  public InventoryHousehold(List<IStockItem> list) {
    super(list);
  }

  @Override
  public InventoryHousehold addStockItem(IStockItem item) throws Exception {
    if (item.getProduct() instanceof AbstractHouseholdProduct) {
      List<IStockItem> newList = list;
      newList.add(item);
      return new InventoryHousehold(newList);
    }
    throw new Exception("not a inventory type");
  }

  @Override
  public List<IStockItem> getLInventory() {
    return this.list;
  }
}

