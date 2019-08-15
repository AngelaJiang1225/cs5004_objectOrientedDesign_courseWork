package Problem_2;

/**
 * Represents the gift card with their details--cardOwner, cardNumber, balance.
 *
 * @giftCard
 */
public class GiftCard {

  private CardOwner cardOwner;
  private CardNumber cardNumber;
  private Balance balance;

  /**
   * set the cardOwner,cardNumber and balance of the giftCard.
   *
   * @param cardOwner the cardOwner of the gift card
   * @param cardNumber the card number of the gift card
   * @param balance the balance of the gift card
   */
  public GiftCard(CardOwner cardOwner, CardNumber cardNumber, Balance balance) {
    this.cardOwner = cardOwner;
    this.cardNumber = cardNumber;
    this.balance = balance;
  }

  /**
   * add gift deposit to make a new gift card
   *
   * @return the gift card if the card number and card owner's name is the same with the gift card.
   */
  public GiftCard depositGift(Deposit newGift) throws Exception {
    if (newGift.getFirstName() != this.cardOwner.getFirstName()
        || newGift.getLastName() != this.cardOwner.getLastName()) {
      throw new Exception("The card owner's name is wrong!");
    } else if (newGift.getCardNumber() != this.cardNumber.getCardNumber()) {
      throw new Exception("The card number is wrong!");
    } else {
      Integer updatedBalanceDollar;
      Integer updatedBalanceCent;
      if (this.balance.getCent() + newGift.getGiftAmountCent() > 99) {
        updatedBalanceDollar = this.balance.getDollar() + newGift.getGiftAmountDollar() + 1;
        updatedBalanceCent = this.balance.getCent() + newGift.getGiftAmountCent() - 100;
      } else {
        updatedBalanceDollar = this.balance.getDollar() + newGift.getGiftAmountDollar();
        updatedBalanceCent = this.balance.getCent() + newGift.getGiftAmountCent();
      }
      Balance updatedBalance = new Balance(updatedBalanceDollar, updatedBalanceCent);
      return new GiftCard(this.cardOwner, this.cardNumber, updatedBalance);
    }
  }

  /**
   * @return the cardOwner of the gift card
   */
  public CardOwner getCardOwner() {
    return this.cardOwner;
  }

  /**
   * @return the card number of the gift card.
   */
  public Integer getCardNumber() {
    return this.cardNumber.getCardNumber();
  }

  /**
   * @return the balance of the gift card.
   */
  public Balance getBalance() {
    return this.balance;
  }
}
