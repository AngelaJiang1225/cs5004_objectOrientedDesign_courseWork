/**
 * Class Amount, containing information about amount. This class is used as a part of Problem 3.
 */
package Problem3;

/**
 * Amount is a simple object that is made up of dollar and cent
 */
public class Amount {

  private Integer dollar;
  private Integer cents;

  /**
   * Constructor that creates a new Amount object with dollar and cent value
   */
  public Amount(Integer dollar, Integer cents) {
    this.dollar = dollar;
    this.cents = cents;
  }

  /**
   * check whether the amount is legal,if illegal;throw exception
   */
  public void checkAmount() throws Exception {
    if ((dollar < 0) || (cents < 0 || cents > 99) || dollar < 0 || cents < 0 || cents > 99) {
      throw new IllegalArgumentException("The amount is invalid.");
    }
  }

  /**
   * return dollar of the amount object
   *
   * @return dollar of the amount object
   */
  public Integer getDollar() {
    return this.dollar;
  }

  /**
   * set the dollar part of amount part
   *
   * @param dollar --the dollar part of the amount
   */
  public void setDollar(Integer dollar) {
    this.dollar = dollar;
  }

  /**
   * return the cent of the amount object
   *
   * @return the cent of the amount object
   */
  public Integer getCents() {
    return this.cents;
  }

  /**
   * set the cent of the amount
   *
   * @param cents --the cent of the amount object
   */
  public void setCents(Integer cents) {
    this.cents = cents;
  }
}
