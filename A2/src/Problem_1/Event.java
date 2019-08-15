package Problem_1;

/**
 * Represents the event with details--name of client, attend number, type
 *
 * @event
 */
public class Event {

  private String clientName;
  private Integer attendNumber;
  private String type;

  /**
   * set the value of the he client name of the event, the attend number of the event and the type
   * of the event
   *
   * @param clientName the client name of the event
   * @param attendNumber the attend number of the event
   * @param type the type of the event
   */
  public Event(String clientName, Integer attendNumber, String type) {

    this.clientName = clientName;
    this.attendNumber = attendNumber;
    this.type = type;

  }

  /**
   * @return true of the type of the event is legal,else return false
   */
  public boolean checkLegalType() {
    if (this.type == "Lunch" || this.type == "Dinner") {
      return true;
    } else {
      return false;
    }
  }

  /**
   * @return the client name of the event
   */
  public String getClientName() {
    return clientName;
  }

  /**
   * @return the attend number of the event
   */
  public Integer getAttendNumber() {
    return attendNumber;
  }

  /**
   * @return the type of the event
   */
  public String getType() {
    return type;
  }
}
