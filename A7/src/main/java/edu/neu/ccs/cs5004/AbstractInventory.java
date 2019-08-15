package edu.neu.ccs.cs5004;

import java.util.List;

public abstract class AbstractInventory implements IInventory {
  List<IStockItem> list;

  public AbstractInventory(List<IStockItem> list) {
    this.list = list;
  }

  @Override
  public int containsProduct(IStockItem stockItem) {
    int index = 0;
    while (this.list.get(index) != null) {
      if (this.list.get(index) == stockItem) {
        return index;
      }
      index ++;
    }
    return -1;
  }

  @Override
  public double getTotalReTailValue() {
    double value = 0.0;

    int index = 0;
    while (index < this.getLInventory().size()) {
      value += this.list.get(index).getStockItemPrice();
      index ++;
    }
    return value;
  }
}
