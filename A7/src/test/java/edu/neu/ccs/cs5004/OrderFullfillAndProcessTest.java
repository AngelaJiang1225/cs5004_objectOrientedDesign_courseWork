package edu.neu.ccs.cs5004;

import java.util.LinkedList;
import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class OrderFullfillAndProcessTest {
  private IOrderFullfillAndProcess order;
  private ICustomer customer;
  private IShoppingCart cart;
  private List<IStockItem> list;
  private List<IStockItem> list2;
  private List<IStockItem> list3;
  private List<IStockItem> list4;
  private IStockItem stockItem;
  private IStockItem stockItem2;
  private IStockItem stockItem3;
  private IStockItem stockItem4;
  private IStockItem stockItem5;

  @Before
  public void setUp() throws Exception {
    this.stockItem = new StockItem(new Beer("abc","cba",11.0,21,12.0),2);
    this.stockItem2 = new StockItem(new Beer("ab","cba",11.0,21,12.0),5);
    this.stockItem3 = new StockItem(new Beer("abcd","cba",11.0,21,12.0),7);
    this.stockItem4 = new StockItem(new Shampoo("sss","aaa",11.0,20,1),1);
    this.stockItem5 = new StockItem(new Shampoo("ss","aa",11.0,20,1),10);
    this.list = new LinkedList<>();
    this.list2 = new LinkedList<>();
    this.list3 = new LinkedList<>();
    this.list.add(this.stockItem);
    this.list2.add(this.stockItem2);
    this.cart = new ShoppingCart(this.list);
    this.customer = new Customer(new Name("wang","lucy"),20, this.cart);
    this.order = new OrderFullfillAndProcess(this.customer);

  }

  @Test
  public void getCustomer() {
    Assert.assertEquals(20, this.customer.getAge());
    Assert.assertEquals("wang", this.customer.getName().getLastName());
    Assert.assertEquals("lucy", this.customer.getName().getFirstName());
  }

  @Test
  public void need() {
    this.list3.add(this.stockItem4);
    IInventory inventory = new InventoryGrocery(this.list2);
    IInventory inventory1 = new InventoryHousehold(this.list3);
    Assert.assertEquals(false, this.order.needSubstitute(this.stockItem4, inventory1));
    Assert.assertEquals(true, this.order.needSubstitute(this.stockItem3, inventory1));
    Assert.assertEquals(false, this.order.needSubstitute(this.stockItem, inventory));
    Assert.assertEquals(true, this.order.needSubstitute(this.stockItem3, inventory));
  }

  @Test
  public void can() {
    this.list2.add(this.stockItem);
    this.list2.add(this.stockItem2);
    IInventory inventory = new InventoryGrocery(this.list2);
    Assert.assertEquals(this.stockItem2, this.order.canSubstitute(this.stockItem, inventory));
    Assert.assertEquals(null, this.order.canSubstitute(this.stockItem3, inventory));
    Assert.assertEquals(this.stockItem2, this.order.canSubstitute(this.stockItem2, inventory));
    this.list3.add(this.stockItem5);
    IInventory inventory1 = new InventoryHousehold(this.list3);
    Assert.assertEquals(this.stockItem5, this.order.canSubstitute(this.stockItem4, inventory1));
  }

  @Test
  public void fullFillOrder() {
    List<IStockItem> cant = new LinkedList<>();
    IInventory inventory = new InventoryGrocery(this.list2);
    Assert.assertEquals(true,this.order.fullFillOrder(inventory,cant).isEmpty());

  }

  @Test
  public void ageLimitedRemoved() {
    List<IStockItem> removedList = new LinkedList<>();
    removedList = this.order.ageLimitedRemoved(removedList);
    Assert.assertEquals(this.stockItem, removedList.get(0));
  }

  @Test
  public void cartEmpty() {
    this.order.cartEmpty();
    Assert.assertEquals(true, this.order.getCustomer().getShoppingCart().getList().isEmpty());
  }

  @Test
  public void orderProcessed() {
    IInventory inventory = new InventoryGrocery(this.list2);
    List<IStockItem> cantSubstitute = new LinkedList<>();
    List<IStockItem> ageLimited = new LinkedList<>();
    List<IStockItem> received = new LinkedList<>();
    Assert.assertEquals(true, this.order.orderProcessed(inventory, cantSubstitute, ageLimited,received));
  }
}