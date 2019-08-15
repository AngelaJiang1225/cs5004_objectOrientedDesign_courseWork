package Problem_2;

/**
 * Represents a deposit with their details--the amount of gift,the first name,the last name, the
 * card number.
 *
 * @deposit
 */
public class Deposit {

  private Balance giftAmount;
  private String firstName;
  private String lastName;
  private CardNumber cardNumber;

  /**
   * set the gift amount,name and the card number of the deposit.
   */
  public Deposit(Balance giftAmount, Name name, CardNumber cardNumber) {
    if (checkAmount(giftAmount.getDollar(), giftAmount.getCent())) {
      this.giftAmount = giftAmount;
      this.firstName = name.getFirstName();
      this.lastName = name.getLastName();
      this.cardNumber = cardNumber;
    }
  }

  /**
   * @return true if the amount is legal,otherwise throws Exception.
   */
  public boolean checkAmount(Integer dollar, Integer cent) {
    Integer amount = dollar * 100 + cent;
    if (amount >= 100 && amount <= 20000) {
      return true;
    } else {
      throw new IllegalArgumentException("the gift amount is illegal!");
    }
  }

  /**
   * @return the first name of the deposit
   */
  public String getFirstName() {
    return this.firstName;
  }

  /**
   * @return the last name of the deposit
   */
  public String getLastName() {
    return this.lastName;
  }

  /**
   * @return the card number of the deposit
   */
  public Integer getCardNumber() {
    return this.cardNumber.getCardNumber();
  }

  /**
   * @return the dollar part of the gift amount of the deposit
   */
  public Integer getGiftAmountDollar() {
    return this.giftAmount.getDollar();
  }

  /**
   * @return the cent part of the gift amount of the deposit
   */
  public Integer getGiftAmountCent() {
    return this.giftAmount.getCent();
  }
}
