package Problem_1;

/**
 * Represents lunch event with details--Integer the number of sandwiches
 */
public class LunchEvent extends Event {

  private Integer sandwichNum;

  /**
   * set the client name.attend number and the type of the lunch event
   *
   * @param clientName the client name
   * @param attendNumber the attend number of lunch event
   * @param type the type of the lunch event
   * @throws Exception if the attend number or type is illegal
   */
  public LunchEvent(String clientName, Integer attendNumber, String type) throws Exception {
    super(clientName, attendNumber, type);
    if (this.checkType() && this.checkAttendNum()) {
      this.sandwichNum = (int) Math.rint(1.05 * super.getAttendNumber());
    }
  }

  /**
   * @return true if the type is not lunch
   */
  public boolean checkType() throws Exception {
    if (super.getType() == "Lunch") {
      return true;
    } else {
      throw new IllegalArgumentException("The type is not lunch!");
    }
  }

  /**
   * @return true if the event is lunch type
   * @throws Exception if the number of the attendants is illegal
   */
  public boolean checkAttendNum() throws Exception {

    if (super.getAttendNumber() < 15 || super.getAttendNumber() > 90) {
      throw new IllegalArgumentException("The number of attendants for lunch is illegal!");
    } else {
      return true;
    }
  }

  /**
   * @return the number of the sandwich
   */
  public Integer getSandwichNum() {
    return sandwichNum;
  }
}