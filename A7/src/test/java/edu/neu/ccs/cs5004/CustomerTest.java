package edu.neu.ccs.cs5004;


import java.util.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CustomerTest {
  private Customer customer;
  private List<IStockItem> list;
  private ShoppingCart shoppingCart;
  @Before
  public void setUp() throws Exception {
    this.list = new LinkedList<IStockItem>();
    List<IStockItem> empty= new LinkedList<IStockItem>();
    this.shoppingCart = new ShoppingCart(empty);
    this.customer = new Customer(new Name("wang", "lucy"),20, this.shoppingCart);
  }

  @Test
  public void getName() {
    Assert.assertEquals("wang", this.customer.getName().getLastName());
    Assert.assertEquals("lucy", this.customer.getName().getFirstName());
  }

  @Test
  public void getAge() {
    Assert.assertEquals(20, this.customer.getAge());
  }

  @Test
  public void getShoppingCart() {
    Assert.assertEquals(this.shoppingCart, this.customer.getShoppingCart());
  }

  @Test
  public void addToCart() {
    IProduct beer = new Beer("abcd","dcba",10.1,21,10.0);
    this.list.add(new StockItem(beer,10));
    IInventory inventory = new InventoryGrocery(this.list);
    this.customer.addToCart(beer,inventory);
    Assert.assertEquals(1, this.shoppingCart.getList().get(0).getQuantity());
  }

  @Test
  public void addToCart2() {
    IProduct beer = new Beer("abcd","dcba",10.1,21,10.0);
    this.list.add(new StockItem(beer,0));
    IInventory inventory = new InventoryGrocery(this.list);
    this.customer.addToCart(beer,inventory);
    Assert.assertEquals(true, this.shoppingCart.getList().isEmpty());
  }

  @Test
  public void addToCart1() {
    IProduct beer = new Beer("abcd","dcba",10.1,21,10.0);
    this.list.add(new StockItem(beer,10));
    IInventory inventory = new InventoryGrocery(this.list);
    this.customer.addToCart(beer,inventory,2);
    Assert.assertEquals(2, this.shoppingCart.getList().get(0).getQuantity());
  }
}