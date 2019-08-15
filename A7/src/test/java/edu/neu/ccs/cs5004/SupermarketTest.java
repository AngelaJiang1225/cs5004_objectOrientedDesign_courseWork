package edu.neu.ccs.cs5004;

import static org.junit.Assert.*;

import java.util.LinkedList;
import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SupermarketTest {
  private IOrderFullfillAndProcess order;
  private ICustomer customer;
  private IShoppingCart cart;
  private List<IStockItem> list;
  private List<IStockItem> list2;
  private IStockItem stockItem;
  private IStockItem stockItem2;
  private IStockItem stockItem3;
  private ISupermarket supermarket;
  private IInventory inventory;
  private List<IStockItem> cantSubstitute;
  private List<IStockItem> ageLimited;
  private List<IStockItem> received;


  @Before
  public void setUp() throws Exception {
    this.stockItem = new StockItem(new Beer("abc","cba",11.0,21,12.0),2);
    this.stockItem2 = new StockItem(new Beer("ab","cba",11.0,21,12.0),5);
    this.stockItem3 = new StockItem(new Beer("abcd","cba",11.0,21,12.0),7);
    this.list = new LinkedList<>();
    this.list2 = new LinkedList<>();
    this.list.add(this.stockItem);
    this.list2.add(this.stockItem2);
    this.cart = new ShoppingCart(this.list);
    this.customer = new Customer(new Name("wang","lucy"),20, this.cart);
    this.inventory = new InventoryGrocery(this.list);
    this.order = new OrderFullfillAndProcess(this.customer);
    this.cantSubstitute = new LinkedList<>();
    this.ageLimited = new LinkedList<>();
    this.received = new LinkedList<>();
    this.supermarket = new Supermarket(this.order, this.inventory);
  }

  @Test
  public void getOrder() {
    Assert.assertEquals(this.order, this.supermarket.getOrder());
  }

  @Test
  public void getInventory() {
    Assert.assertEquals(this.inventory, this.supermarket.getInventory());
  }

  @Test
  public void getCantSubstitute() {
    Assert.assertEquals(this.cantSubstitute,this.supermarket.getCantSubstitute());
  }

  @Test
  public void getAgeLimited() {
    Assert.assertEquals(this.ageLimited, this.supermarket.getAgeLimited());
  }

  @Test
  public void getReceived() {
    Assert.assertEquals(this.received, this.supermarket.getReceived());
  }

  @Test
  public void generateReceipt() {
    this.ageLimited.add(this.stockItem);
    Assert.assertEquals(this.received, this.supermarket.generateReceipt().getReceived());
    Assert.assertEquals(this.ageLimited, this.supermarket.generateReceipt().getAgeLimit());
   // Assert.assertEquals(0.0, this.supermarket.generateReceipt().getTotalPrice(this.received),0);
  }
}