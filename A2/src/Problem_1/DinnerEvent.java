package Problem_1;

/**
 * Represents dinner event with details--Integer non-vegetarian, vegetarian number
 */
public class DinnerEvent extends Event {

  private Integer nonVege;
  private Integer vege;

  /**
   * set the client name.attend number and the type of the dinner event
   *
   * @param clientName the client name
   * @param attendNumber the attend number of dinner event
   * @param type the type of the dinner event
   * @throws Exception if the attend number or type is illegal
   */
  public DinnerEvent(String clientName, Integer attendNumber, String type) throws Exception {
    super(clientName, attendNumber, type);
    if (checkAttendNum() && checkType()) {
      this.nonVege = Integer.valueOf((int) Math.rint(0.8 * super.getAttendNumber()));
      this.vege = Integer.valueOf((int) Math.rint(0.2 * super.getAttendNumber()));
    }
  }

  /**
   * @return true if the event is dinner type
   * @throws IllegalArgumentException if the type is not dinner
   */

  public boolean checkType() throws IllegalArgumentException {
    if (this.getType() == "Dinner") {
      return true;
    } else {
      throw new IllegalArgumentException("The type is not dinner!");
    }
  }

  /**
   * @throws Exception if the attend number is illegal
   * @returnc true if the attend number is legal
   */
  public boolean checkAttendNum() throws Exception {

    if (super.getAttendNumber() < 10 || super.getAttendNumber() > 50) {
      throw new IllegalArgumentException("The number of attendants for dinner is illegal!");
    } else {
      return true;
    }
  }

  /**
   * @return the number of non vegetarian
   */
  public Integer getNonVege() {
    return this.nonVege;
  }

  /**
   * @return the number of vegetarian
   */
  public Integer getVege() {
    return this.vege;
  }
}
