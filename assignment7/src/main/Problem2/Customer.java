package src.main.Problem2;

/**
 * Represents the customer.
 */
public class Customer implements ICustomer {
  private static final int DEFAULTNUM = 1;
  Name name;
  int age;
  IShoppingCart shoppingCart;

  /**
   * Create a customer class with details.
   * @param name
   * @param age
   * @param shoppingCart
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
   * Get the age of the customer
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
    return addToCart(product, inventory, DEFAULTNUM);
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
   * @param i a helper parameter to iterate through the inventory
   * @return true if has enough, otherwise false
   */
  private boolean hasEnoughStock(IInventory inventory, IProduct product, int quantity, int i) {
    if (inventory.getLInventory().get(i).getProduct().equals(product)) {
      return inventory.getLInventory().get(i).hasEnoughQuantity(quantity);
    }
    return hasEnoughStock(inventory, product, quantity, i + 1);
  }
}
