package edu.neu.ccs.cs5004.assignment4.problem2;

// In the off season, all numbers should be set to 0
public abstract class Record implements Points {

  protected int numWins;
  protected int numLoss;

  /**
   * Create record.
   *
   * @param numWin  number of wins for baseball
   * @param numLoss number of losses for baseball
   */
  public Record(int numWin, int numLoss) throws IllegalArgumentException {
    this.numWins = numWin;
    this.numLoss = numLoss;
  }

  /**
   * return number of wins.
   *
   * @return number of wins
   */
  public int getNumWin() {
    return this.numWins;
  }

  /**
   * return the number of losses.
   *
   * @return the number of losses
   */
  public int getNumLoss() {
    return this.numLoss;
  }

  /**
   * param numWin the number of wins.
   *
   * @param numWin the number of wins
   */
  public void setNumWin(int numWin) {
    this.numWins = numWin;
  }


  /**
   * set the number of losses.
   *
   * @param numLoss the number of losses
   */
  public void setNumLoss(int numLoss) {
    this.numLoss = numLoss;
  }
}
