package edu.neu.ccs.cs5004;

import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.*;

public class InventoryGroceryTest {
  IStockItem newStockItem1 = new StockItem(new Beer("ABRAND1", "ANAME1", 2.3,  21, 3.0), 10);
//  IStockItem newStockItem2 = new StockItem(new Salmon("ABRAND2", "ANAME2", 11.1, 200), 15);
  LinkedList<IStockItem> list =new LinkedList<IStockItem>(){{
    add(newStockItem1);
  }
  };


  InventoryGrocery newInventoryGrocery;


  @Before
  public void setUp() throws Exception {
    this.newInventoryGrocery = new InventoryGrocery(list);
  }

  @Test
  public void containsProduct() throws Exception {
    //assertEquals(-1, newInventoryGrocery.containsProduct(newStockItem1));
    //newInventoryGrocery.addStockItem(newStockItem2);
    assertEquals(0, newInventoryGrocery.containsProduct(newStockItem1));
  }

  @Test
  public void getTotalReTailValue() {
    assertEquals(23.0, newInventoryGrocery.getTotalReTailValue(),0);
  }

  @Test
  public void addStockItem() throws Exception {
    IStockItem newStockItem3 = new StockItem(new Beer("ABRAND", "ANAME1", 2.3,  21, 3.0), 10);
    this.newInventoryGrocery.addStockItem(newStockItem3);
    assertEquals(newStockItem3,this.newInventoryGrocery.getLInventory().get(1));
    //assertTrue(this.newInventoryGrocery.getLInventory().get(0).equals(this.newStockItem1)
    //&& this.newInventoryGrocery.getLInventory().get(1).equals(this.newStockItem2));
  }

  @Test
  public void addStockItem1() throws Exception {
    IStockItem newStockItem3 = new StockItem(new Cheese("ABRAND", "ANAME1", 2.3,  21, 3.0), 10);
    this.newInventoryGrocery.addStockItem(newStockItem3);
    assertEquals(newStockItem3,this.newInventoryGrocery.getLInventory().get(1));
    //assertTrue(this.newInventoryGrocery.getLInventory().get(0).equals(this.newStockItem1)
    //&& this.newInventoryGrocery.getLInventory().get(1).equals(this.newStockItem2));
  }

  @Test (expected = Exception.class)
  public void addStockItem2() throws Exception {
    IStockItem newStockItem3 = new StockItem(new Shampoo("ABRAND", "ANAME1", 2.3,  21, 3), 10);
    this.newInventoryGrocery.addStockItem(newStockItem3);
    assertEquals(newStockItem3,this.newInventoryGrocery.getLInventory().get(1));
  }

  @Test
  public void getLInventory() {
    assertEquals(newStockItem1, newInventoryGrocery.getLInventory().get(0));
  }
}