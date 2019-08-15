package Problem_2;

/**
 * Represents balance with details--dollar and cent
 *
 * @balance
 */
public class Balance {

  private Integer dollar;
  private Integer cent;

  /**
   * Creates a new balance given the balance's dollar and cent as Integers.
   *
   * @param dollar set the balance's dollar
   * @param cent set the balance's cent
   */
  public Balance(Integer dollar, Integer cent) {
    if (checkBalance(dollar, cent)) {
      this.dollar = dollar;
      this.cent = cent;
    }
  }

  /**
   * check if the balance is legal
   *
   * @param dollar balance's dollar part
   * @param cent balance's cent part
   * @return true if the balance is legal,otherwise throws Exception
   */
  public boolean checkBalance(Integer dollar, Integer cent) {
    if (dollar >= 0 && cent >= 0 && cent <= 99) {
      return true;
    } else {
      throw new IllegalArgumentException("The balance is illegal!");
    }
  }

  /**
   * @return the balance's dollar part.
   */
  public Integer getDollar() {
    return dollar;
  }

  /**
   * @return the balance's cent.
   */
  public Integer getCent() {
    return cent;
  }

}
