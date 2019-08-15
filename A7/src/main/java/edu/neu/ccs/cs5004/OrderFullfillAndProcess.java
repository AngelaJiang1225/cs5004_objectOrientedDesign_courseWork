package edu.neu.ccs.cs5004;

import java.util.List;

public class OrderFullfillAndProcess implements IOrderFullfillAndProcess {
  ICustomer customer;

  public OrderFullfillAndProcess(ICustomer customer) {
    this.customer = customer;
  }

  /**
   * get customer of this order.
   * @return customer of this order.
   */
  public ICustomer getCustomer() {
    return this.customer;
  }

  /**
   * Return true if the item need to be substituted.
   * @param item the stock item.
   * @param inventory the inventory
   * @return true if the item need to be substituted
   */
  public boolean needSubstitute(IStockItem item, IInventory inventory) {
    int index = 0;
    while (index < inventory.getLInventory().size()) {
      IStockItem thisStockItem = inventory.getLInventory().get(index);
      if (!thisStockItem.hasEnoughQuantity(item.getQuantity())) {
        return true;
      }
      index ++;
    }
    return false;
  }

  /**
   * Justify whether the item can be substituted.
   *
   * @param item      the item to be substituted
   * @param inventory the inventory
   * @return the stockItem in the inventory to replace the item if it can be substituted
   */
  public IStockItem canSubstitute(IStockItem item, IInventory inventory) {
    int index = 0;
    while (index < inventory.getLInventory().size()) {
      IStockItem stockItemInStock = inventory.getLInventory().get(index);
      if (this.isSameClass(item, stockItemInStock)) {
        if (this.satisfyPriceAndQuantity(item, stockItemInStock)) {
          if (this.isGroceryStockItem(item)) {
            if (this.satisfyWeight(item, stockItemInStock)) {
              return stockItemInStock;
            }
          } else {
            if (this.satisfyUnit(item, stockItemInStock)) {
              return stockItemInStock;
            }
          }
        }
      }
      index ++;
    }
    return null;
  }

  /**
   *
   * @param request request
   * @param inStock in stock
   * @return true if found same class.
   */
  private boolean isSameClass(IStockItem request, IStockItem inStock) {
    return request.getClass() == inStock.getClass();
  }

  /**
   *
   * @param request request
   * @param inStock in stock
   * @return true if found less price and more quantity.
   */
  private boolean satisfyPriceAndQuantity(IStockItem request, IStockItem inStock) {
    return request.getQuantity() <= inStock.getQuantity()
        && request.getProduct().getProductPrice() >= inStock.getProduct().getProductPrice();
  }

  /**
   *
   * @param request request
   * @return true if is grocery.
   */
  private boolean isGroceryStockItem(IStockItem request) {
    return request.getProduct() instanceof AbstractGroceryProduct;
  }

  /**
   *
   * @param request request
   * @param inStock in stock
   * @return true if satisfy weight.
   */
  private boolean satisfyWeight(IStockItem request, IStockItem inStock) {
    return ((AbstractGroceryProduct) request.getProduct()).getWeight()
            <= ((AbstractGroceryProduct) (inStock.getProduct())).getWeight();
  }

  /**
   *
   * @param request request
   * @param inStock in stock
   * @return true if satisfy unit.
   */
  private boolean satisfyUnit(IStockItem request, IStockItem inStock) {
    return ((AbstractHouseholdProduct) request.getProduct()).getUnit()
            <= ((AbstractHouseholdProduct) (inStock.getProduct())).getUnit();
  }

  /**
   * full fill order.
   * @param inventory the inventory
   * @param cantSubstitute the list of stock item
   * @return full fill order.
   */
  public List<IStockItem> fullFillOrder(IInventory inventory, List<IStockItem> cantSubstitute) {
    IStockItem substitute;
    int index = 0;
    while (index < inventory.getLInventory().size()) {
      IStockItem thisStockItem = inventory.getLInventory().get(index);
      substitute = this.canSubstitute(thisStockItem, inventory);
      if (substitute != null && this.needSubstitute(thisStockItem,inventory)) {
        this.getCustomer().getShoppingCart().getList().set(this.getCustomer()
                .getShoppingCart().getList().indexOf(thisStockItem),
            new StockItem(substitute.getProduct(), thisStockItem.getQuantity()));
      } else if (this.needSubstitute(thisStockItem, inventory) && substitute == null) {
        cantSubstitute.add(thisStockItem);
      }
      index ++;
    }
    return cantSubstitute;
  }

  @Override
  public List<IStockItem> ageLimitedRemoved(List<IStockItem> ageLimitedRemoved) {
    IStockItem thisStockItem;
    int index = 0;
    while (index < this.getCustomer().getShoppingCart().getList().size()) {
      thisStockItem = this.getCustomer().getShoppingCart().getList().get(index);
      if (thisStockItem.getProduct().getMinAge() > this.getCustomer().getAge()) {
        ageLimitedRemoved.add(thisStockItem);
        this.getCustomer().getShoppingCart().getList().remove(thisStockItem);
      }
    }
    return ageLimitedRemoved;
  }

  @Override
  public void cartEmpty() {
    this.getCustomer().getShoppingCart().getList().clear();
  }

  @Override
  public boolean orderProcessed(IInventory inventory, List<IStockItem> cantSubstitute,
                                List<IStockItem> ageLimited, List<IStockItem> received) {
    this.fullFillOrder(inventory, cantSubstitute);
    this.ageLimitedRemoved(ageLimited);
    this.cartEmpty();
    return this.getCustomer().getShoppingCart().getList().isEmpty();
  }
}
