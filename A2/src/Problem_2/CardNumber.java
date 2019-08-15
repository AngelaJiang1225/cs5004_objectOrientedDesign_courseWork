package Problem_2;

/**
 * @cardnumber
 */
public class CardNumber {

  private Integer cardNumber;

  /**
   * return the card number of the CardNumber
   *
   * @param cardNumber the card number.
   */
  public CardNumber(Integer cardNumber) {
    if (checkNumber(cardNumber)) {
      this.cardNumber = cardNumber;
    }
  }

  /**
   * return true if the length of the card number is 9,else throws Exception.
   *
   * @return true or throws Exception
   */
  public boolean checkNumber(Integer cardNumber) {
    if (cardNumber.toString().length() == 9) {
      return true;
    } else {
      throw new IllegalArgumentException("The card number is illegal!");
    }
  }

  /**
   * @return card number of CardNumber
   */
  public Integer getCardNumber() {
    return this.cardNumber;
  }
}
