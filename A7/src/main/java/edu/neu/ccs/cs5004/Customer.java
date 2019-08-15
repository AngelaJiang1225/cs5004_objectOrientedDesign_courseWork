package edu.neu.ccs.cs5004;

/**
 * Represents the customer.
 */
public class Customer implements ICustomer {
  private static final int DEFAULT_NUM = 1;
  Name name;
  int age;
  IShoppingCart shoppingCart;

  /**
   * Create a customer class with details.
   * @param name name
   * @param age age
   * @param shoppingCart shopping cart
   */
  public Customer(Name name, int age, IShoppingCart shoppingCart) {
    this.name = name;
    this.age = age;
    this.shoppingCart = shoppingCart;
  }

  /**
   * Get the name of the customer.
   * @return the name of the customer.
   */
  public Name getName() {
    return name;
  }

  /**
   * Get the age of the customer.
   * @return the age of the customer
   */
  public int getAge() {
    return age;
  }

  public IShoppingCart getShoppingCart() {
    return shoppingCart;
  }

  @Override
  public Customer addToCart(IProduct product, IInventory inventory) {
    return addToCart(product, inventory, DEFAULT_NUM);
  }

  @Override
  public Customer addToCart(IProduct product, IInventory inventory, int quantity) {
    if (this.hasEnoughStock(inventory, product, quantity, 0)) {
      this.getShoppingCart().getList().add(new StockItem(product, quantity));
    } else {
      // if the stock is not enough, print the error message
      printError(false);
    }
    return this;
  }

  /**
   * Print error if there is no enough stock.
   * @param enough a boolean value showing whether the stock is enough
   */
  private void printError(boolean enough) {
    try {
      this.throwError(enough);
    } catch (Exception e) {
      System.out.println("The cart cant be added lacking stock!");
    }
  }

  /**
   * Throw exception if there is not enough stock for adding.
   * @param enough a boolean value showing whether the stock is enough.
   * @throws Exception when there is not enough stock for add.
   */
  private void throwError(boolean enough) throws Exception {
    if (!enough) {
      throw new Exception("The cart cant be added lacking stock!");
    }
  }

  /**
   * Justify whether it has enough stock.
   * @param inventory inventory
   * @param product product
   * @param quantity quantity
   * @param index a helper parameter to iterate through the inventory
   * @return true if has enough, otherwise false.
   */
  private boolean hasEnoughStock(IInventory inventory, IProduct product, int quantity, int index) {
    if (inventory.getLInventory().get(index).getProduct().equals(product)) {
      return inventory.getLInventory().get(index).hasEnoughQuantity(quantity);
    }
    return hasEnoughStock(inventory, product, quantity, index + 1);
  }
}
