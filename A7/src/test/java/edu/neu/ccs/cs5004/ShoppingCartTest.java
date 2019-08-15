package edu.neu.ccs.cs5004;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.*;

public class ShoppingCartTest {
  private List<IStockItem> list;
  private IStockItem item1;
  private IStockItem item2;
  private ShoppingCart shoppingCart;
  @Before
  public void setUp() throws Exception {
    this.item1 = new StockItem(new Cheese("HAI", "BLUE", 23.0, 12.2),
        2);
    this.item2 = new StockItem(new Beer("BAI", "RED", 14.3,
        15.6), 1);
    this.list = new LinkedList<IStockItem>();
    this.list.add(this.item1);
    this.list.add(this.item2);
    this.shoppingCart = new ShoppingCart(this.list);
  }

  @Test
  public void getList() {
    Assert.assertEquals(this.list, this.shoppingCart.getList());
    Assert.assertEquals(this.item1, this.shoppingCart.getList().get(0));
    Assert.assertEquals(2, this.shoppingCart.getList().size());
  }

  @Test
  public void calculateTotalPrice() {
    this.shoppingCart.calculateTotalPrice(this.shoppingCart.getList(),0);
    Assert.assertEquals(60.3,this.shoppingCart.calculateTotalPrice(this.shoppingCart.getList(),0),0);
  }
}