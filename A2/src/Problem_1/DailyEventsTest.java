package Problem_1;

import static org.junit.Assert.*;

import com.sun.org.omg.CORBA.ExcDescriptionSeqHelper;
import org.junit.Before;
import org.junit.Test;

public class DailyEventsTest {
  private DailyEvents dailyEventsTest;
  @Before
  public void setUp() throws Exception {
    dailyEventsTest = new DailyEvents();
  }

  @Test
  public void CreateEventLunch() throws Exception {
    DailyEvents updatedDailyEvents = this.dailyEventsTest.createEvent("coa", 20, "Lunch");
    assertTrue(updatedDailyEvents.getLunchEvent().getSandwichNum() == 21 &&
        updatedDailyEvents.getDinnerEvent() == null);

  }

  @Test
  public void CreateEventDinner() throws Exception {
    DailyEvents updatedDailyEvents = this.dailyEventsTest.createEvent("coa", 30, "Dinner");
    assertTrue(updatedDailyEvents.getDinnerEvent().getNonVege() == 24 && updatedDailyEvents.getDinnerEvent().getVege() == 6 &&
        updatedDailyEvents.getLunchEvent() == null);
  }

  @Test(expected = Exception.class)
  public void illegalCreateEventLunch() throws Exception {
    DailyEvents dailyEvents = new DailyEvents(new LunchEvent("coa", 20, "Lunch"), null);
    dailyEvents.createEvent("coa", 20, "Lunch");
    this.dailyEventsTest.createEvent("coa", 30, "Dinner");
    assertTrue(this.dailyEventsTest.getDinnerEvent() != null);
    this.dailyEventsTest.createEvent("coa", 40, "Lunch");
  }

  @Test(expected = Exception.class)
  public void illegalCreateEventDinner() throws Exception {
    DailyEvents dailyEvents = new DailyEvents(null,new DinnerEvent("coa", 20, "Dinner"));
    dailyEvents.createEvent("coa", 30, "Dinner");
  }

  @Test
  public void getLunchEvent() {
    assertEquals(this.dailyEventsTest.getLunchEvent(), null);
  }

  @Test
  public void getDinnerEvent() {
    assertEquals(this.dailyEventsTest.getDinnerEvent(), null);
  }
}