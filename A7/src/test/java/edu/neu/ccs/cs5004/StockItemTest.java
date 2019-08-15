package edu.neu.ccs.cs5004;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StockItemTest {
  private StockItem newStockItem;

  @Before
  public void setUp() throws Exception {
    IProduct beer = new Beer("ABRAND", "ANAME", 2.3,  21, 3.0);
    this.newStockItem = new StockItem(beer, 10);
  }

  @Test
  public void setQuantity() {
    this.newStockItem.setQuantity(100);
    assertEquals(100, newStockItem.getQuantity());
  }

  @Test
  public void hasEnoughQuantity() {
    assertEquals(false, newStockItem.hasEnoughQuantity(200));
    assertEquals(true, newStockItem.hasEnoughQuantity(1));
  }

  @Test
  public void reduceQuantity() {
    newStockItem.reduceQuantity(5);
    assertEquals(10-5, newStockItem.getQuantity());
  }

  @Test
  public void getQuantity() {
    assertEquals(10, this.newStockItem.getQuantity());
  }

  @Test
  public void getProduct() {
    assertEquals("ABRAND", this.newStockItem.getProduct().getManufacture());
    //assertEquals("ABRAND", this.newStockItem.getProduct());
    assertEquals("ANAME", newStockItem.getProduct().getProductName());
    assertEquals(2.3, newStockItem.getProduct().getProductPrice(), 0);
    assertEquals(21, newStockItem.getProduct().getMinAge());
  }

  @Test
  public void addItem() {
    newStockItem.addItem(100);
    assertEquals(10+100, newStockItem.getQuantity());
  }

  @Test
  public void getStockItemPrice() {
    double expectedPrice = newStockItem.getQuantity() * newStockItem.getProduct().getProductPrice();
    assertEquals(2.3*10, newStockItem.getStockItemPrice(), 0);
  }
}