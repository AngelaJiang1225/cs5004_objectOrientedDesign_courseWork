/**
 * Class Account, containing information about account. This class is used as a part of Problem 3.
 */
package Problem3;

/**
 * Account is a simple object that has a holder and amount
 */
public class Account {

  private Holder holder;
  private Amount amount;

  /**
   *  Constructor that creates a new time object with the specified hours, minutes and seconds
   *
   * @param holder hours that should be between 0 and 23,included
   * @param amount minutes that should be between 0 and 59,included
   */
  public Account(Holder holder, Amount amount) {
    this.holder = holder;
    this.amount = amount;
  }

  /**
   * return the holder of the account
   * @return the holder of the account
   */
  public Holder getHolder() {
    return this.holder;
  }

  /**
   *set the holder of the account
   * @param holder the holder of the account
   */
  public void setHolder(Holder holder) {
    this.holder = holder;
  }

  /**
   * return the amount of the account
   * @return the amount of the account
   */
  public Amount getAmount() {
    return this.amount;
  }

  /**
   * set the amount of the account object
   * @param amount the amount of the account object
   */
  public void setAmount(Amount amount) {
    this.amount = amount;
  }

  /**
   * return the new account of the updated amount after having deposit
   * @param depositAmount the added deposit amount
   * @return the new account of the updated amount
   */
  public Account deposit(Amount depositAmount) {
    Integer amountCents = this.amount.getDollar() * 100 + this.amount.getCents();
    Integer depositAmountCents = depositAmount.getDollar() * 100 + depositAmount.getCents();
    Integer endDollars = (depositAmountCents + amountCents) / 100;
    Integer endCents = (depositAmountCents + amountCents) % 100;
    this.amount.setDollar(endDollars);
    this.amount.setCents(endCents);
    return new Account(this.getHolder(), this.amount);
  }

  /**
   * return the new account after withdrawing some money
   * @param withdrawalAmount the decreased amount of the account
   * @return the new account of the updated amount
   */
  public Account withdraw(Amount withdrawalAmount) {
    Integer amountCents = this.amount.getDollar() * 100 + this.amount.getCents();
    Integer depositAmountCents = withdrawalAmount.getDollar() * 100 + withdrawalAmount.getCents();
    if (depositAmountCents > amountCents) {
      System.out.println("Error:withdraw number exceeds account amount!");
    }
    Integer endDollars = (amountCents - depositAmountCents) / 100;
    Integer endCents = (amountCents - depositAmountCents) % 100;
    this.amount.setDollar(endDollars);
    this.amount.setCents(endCents);
    return new Account(this.getHolder(), this.amount);
  }
}
