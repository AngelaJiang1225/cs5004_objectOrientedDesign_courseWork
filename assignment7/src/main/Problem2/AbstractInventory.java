package src.main.Problem2;

import java.util.*;

public abstract class AbstractInventory implements IInventory {
  List<IStockItem> list;

  public AbstractInventory(List<IStockItem> list) {
    this.list = list;
  }

  // create the list of product the inventory have.
  public List<IStockItem> createInventory() {
    List<IStockItem> inventory = new LinkedList<IStockItem>();
    Iterator<IStockItem> it = this.list.iterator();
    while (it.hasNext()) {
      inventory.add((IStockItem) it.next().getProduct());
    }
    return inventory;
  }

  // if the inventory contains the product of the stockItem,  return the index of its location in the inventory.
  // if no such product, return -1.
  public int containsProduct(IStockItem stockItem) {
    // Iterator<IStockItem> it = this.list.iterator();
    int index = 0;
    while(this.list.get(index) != null){
      if (this.list.get(index) == stockItem) {
        return index;
      }
      index ++;
    }
    //while (it.hasNext()) {
      //if (it.next().getProduct().equals(stockItem.getProduct()))
        //return this.getLInventory().indexOf(stockItem.getProduct());
    //}
    return -1;
  }

  @Override
  public double getTotalReTailValue() {
    double value = 0.0;
    Iterator<IStockItem> it = this.getLInventory().iterator();
    while (it.hasNext()) {
      value += it.next().getStockItemPrice();
    }
    return value;
  }
}
