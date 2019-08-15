package Problem2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BicyclistTest {

  Bicyclist testBicyclist;
  Time startTime = new Time(10, 13, 24);
  Time endTime = new Time(11, 12, 20);

  public BicyclistTest() throws Exception {
  }

  @Before
  public void setUp() throws Exception {
    this.testBicyclist = new Bicyclist("Angela", "WINNER",
        startTime, endTime);
  }

  @Test
  public void getName() throws Exception {
    assertEquals("Angela", this.testBicyclist.getName());
  }

  @Test
  public void getTeam() throws Exception {
    assertEquals("WINNER", this.testBicyclist.getTeam());
  }

  @Test
  public void getStartTime() throws Exception {
    assertEquals(this.startTime, this.testBicyclist.getStartTime());
  }

  @Test
  public void getEndTime() throws Exception {
    assertEquals(this.endTime, this.testBicyclist.getEndTime());
  }

  @Test
  public void getDuration() throws Exception {
    assertTrue(this.testBicyclist.getDuration().getHours().equals(Integer.valueOf(0)) &&
        this.testBicyclist.getDuration().getMinutes().equals(Integer.valueOf(58)) &&
        this.testBicyclist.getDuration().getSeconds().equals(Integer.valueOf(56)));
  }

  public void setStartTime() throws Exception {
    this.testBicyclist.setStartTime(new Time(9, 12, 22));
    assertTrue(this.testBicyclist.getStartTime().getHours().equals(Integer.valueOf(9)) &&
        this.testBicyclist.getStartTime().getMinutes().equals(Integer.valueOf(12)) &&
        this.testBicyclist.getStartTime().getSeconds().equals(Integer.valueOf(22)));
  }

  public void setEndTime() throws Exception {
    this.testBicyclist.setEndTime(new Time(13, 10, 14));
    assertTrue(this.testBicyclist.getEndTime().getHours().equals(Integer.valueOf(13)) &&
        this.testBicyclist.getEndTime().getMinutes().equals(Integer.valueOf(10)) &&
        this.testBicyclist.getEndTime().getSeconds().equals(Integer.valueOf(14)));
  }

  public void setName() throws Exception {
    this.testBicyclist.setName("Julia");
    assertEquals("Julia", this.testBicyclist.getName());
  }

  public void setTeam() throws Exception {
    this.testBicyclist.setTeam("COOL");
    assertEquals("COOL", this.testBicyclist.getName());
  }

}