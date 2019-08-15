AbstractGroceryProduct.java
AbstractHouseholdProduct.java
AbstractInventory.java
AbstractProduct.java
Beer.java
Cheese.java
Customer.java
ICustomer.java
IInventory.java
InventoryGrocery.java
InventoryHousehold.java
IOrderFullfillAndProcess.java
IProduct.java
IShoppingCart.java
IStockItem.java
ISupermarket.java
Name.java
OrderFullfillAndProcess.java
PaperTowel.java
Receipt.java
Salmon.java
Shampoo.java
ShoppingCart.java
StockItem.java
Supermarket.java

import java.util.*;

public class OrderFullfillAndProcess implements IOrderFullfillAndProcess {
  Customer customer;

  public OrderFullfillAndProcess(Customer customer) {
    this.customer = customer;
  }

  public Customer getCustomer() {
    return customer;
  }


  /**
   * Return true if the item need to be substituted.
   * @param item the stock item.
   * @param inventory the inventory
   * @return true if the item need to be substituted
   */
  private boolean needSubstitute(IStockItem item, IInventory inventory) {
    Iterator<IStockItem> it = inventory.getLInventory().iterator();
    while (it.hasNext()) {
      if (it.next().getProduct().equals(item.getProduct()) && it.next().hasEnoughQuantity(item.getQuantity())) {
        return false;
      }
    }
    return true;
  }

  /**
   * Justify whether the item can be substituted.
   *
   * @param item      the item to be substituted
   * @param inventory the inventory
   * @return the stockItem in the inventory to replace the item if it can be substituted
   */
  private IStockItem canSubstitute(IStockItem item, IInventory inventory) {
    Iterator<IStockItem> it = inventory.getLInventory().iterator();
    while (it.hasNext()) {
      if (item.getProduct().getClass().equals(it.next().getProduct().getClass())
          && item.getQuantity() <= it.next().getQuantity()
          && item.getProduct().getProductPrice() >= it.next().getProduct().getProductPrice()) {
        // when the item is of type AbstractGroceryProduct
        if (item.getProduct() instanceof AbstractGroceryProduct
            && ((AbstractGroceryProduct) item.getProduct()).getWeight()
            <= ((AbstractGroceryProduct) (it.next().getProduct())).getWeight()) {
          return it.next();
        }
        // when the item is of type AbstractHouseholdProduct
        else if (item.getProduct() instanceof AbstractHouseholdProduct
            && ((AbstractHouseholdProduct) (item.getProduct())).getUnit() <= ((AbstractHouseholdProduct) (it.next().getProduct())).getUnit()) {
          return it.next();
        }
        return null;
      }
      return null;
    }
    return null;
  }

  public List<IStockItem> fullFillOrder(IInventory inventory, List<IStockItem> cantSubstitute) {
    Iterator<IStockItem> it = this.getCustomer().getShoppingCart().getList().iterator();
    IStockItem substitute;
    while (it.hasNext()) {
      substitute = this.canSubstitute(it.next(), inventory);
      // if the item need to be sustituted and it can be substituted
      if (this.needSubstitute(it.next(), inventory) && substitute != null) {
        this.getCustomer().getShoppingCart().getList().set(this.getCustomer().getShoppingCart().getList().indexOf(it.next()),
            new StockItem(substitute.getProduct(), it.next().getQuantity()));
      }
      // if the item cant be substituted ,add it to the cantsubstitute list
      else if (this.needSubstitute(it.next(), inventory) && substitute == null) {
        cantSubstitute.add(it.next());
      }
    }
    return cantSubstitute;
  }

  @Override
  public List<IStockItem> AgeLimitedRemoved(List<IStockItem> ageLimitedRemoved) {
    Iterator<IStockItem> it = this.getCustomer().getShoppingCart().getList().iterator();
    while (it.hasNext()) {
      if (it.next().getProduct().getMinAge() > this.getCustomer().getAge()) {
        ageLimitedRemoved.add(it.next());
        this.getCustomer().getShoppingCart().getList().remove(it.next());
      }
    }
    return ageLimitedRemoved;
  }

  // empty the cart and return the list of final received
  @Override
  public List<IStockItem> cartEmpty(List<IStockItem> received) {
    this.getCustomer().getShoppingCart().getList().clear();
    return received;
  }

  @Override
  public boolean orderProcessed(IInventory inventory, List<IStockItem> cantSubstitute,
                                List<IStockItem> ageLimited, List<IStockItem> received) {
    this.fullFillOrder(inventory, cantSubstitute);
    this.AgeLimitedRemoved(ageLimited);
    this.cartEmpty(received);
    return this.getCustomer().getShoppingCart().getList().isEmpty();

  }

}

