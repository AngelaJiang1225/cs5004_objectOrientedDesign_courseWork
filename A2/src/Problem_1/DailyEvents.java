package Problem_1;

/**
 * Represents an dailyEvent with details--lunchEvent, dinnerEvent.
 *
 * @dailyEvent
 */
public class DailyEvents {

  private LunchEvent lunchEvent;
  private DinnerEvent dinnerEvent;

  /**
   * set the default value of lunch event and dinner event to be null
   */
  public DailyEvents() {
    this.lunchEvent = null;
    this.dinnerEvent = null;
  }

  /**
   * set the lunch event and dinner event
   *
   * @param lunchEvent the lunch event
   * @param dinnerEvent the dinner event
   */
  public DailyEvents(LunchEvent lunchEvent, DinnerEvent dinnerEvent) {
    this.lunchEvent = lunchEvent;
    this.dinnerEvent = dinnerEvent;
  }

  /**
   * create event if the event is not full,else throws exception
   *
   * @param clientName the client name
   * @param attendNumber the attend number
   * @param type the type of event
   * @return daily events if the event is nor full
   */

  public DailyEvents createEvent(String clientName, Integer attendNumber, String type)
      throws Exception {
    if (type == "Lunch" && this.lunchEvent == null) {
      LunchEvent lunchEvent = new LunchEvent(clientName, attendNumber, type);
      DailyEvents dailyEvents = new DailyEvents(lunchEvent, this.dinnerEvent);
      return dailyEvents;
    } else if (type == "Dinner" && this.dinnerEvent == null) {
      DinnerEvent dinnerEvent = new DinnerEvent(clientName, attendNumber, type);
      DailyEvents dailyEvents = new DailyEvents(this.lunchEvent, dinnerEvent);
      return dailyEvents;
    } else {
      throw new Exception("There is time conflict,you can not add it!");
    }
  }

  /**
   * @return the lunch event of the daily event
   */
  public LunchEvent getLunchEvent() {
    return lunchEvent;
  }

  /**
   * @return the dinner event of the daily event
   */
  public DinnerEvent getDinnerEvent() {
    return dinnerEvent;
  }
}



