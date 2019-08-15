package edu.neu.ccs.cs5004;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;


public class ReceiptTest {
  Receipt newReceipt;
  IStockItem newStockItem1;
  List<IStockItem> newReceived;
  List<IStockItem> newOutStock;
  List<IStockItem> newAgeLimit;

  @Before
  public void setUp() throws Exception {
    this.newStockItem1 = new StockItem(new Beer("ABRAND1", "ANAME1", 2.3,  21, 3.0), 10);
    this.newReceived = new LinkedList<>();
    this.newOutStock = new LinkedList<>();
    this.newAgeLimit = new LinkedList<>();
    this.newReceipt = new Receipt(this.newReceived, this.newOutStock, this.newAgeLimit);

  }

  @Test
  public void getReceived() {
    this.newReceived.add(this.newStockItem1);
    assertEquals(this.newReceived, this.newReceipt.getReceived());
  }

  @Test
  public void getOutStock() {
    this.newOutStock.add(this.newStockItem1);
    assertEquals(this.newOutStock, this.newReceipt.getOutStock());

  }

  @Test
  public void getAgeLimit() {
    this.newAgeLimit.add(this.newStockItem1);
    assertEquals(this.newAgeLimit, this.newReceipt.getAgeLimit());
  }

  @Test
  public void getTotalPrice() {
    this.newReceived.add(this.newStockItem1);
    Assert.assertEquals(23.0, this.newReceipt.getTotalPrice(),0);
  }
}