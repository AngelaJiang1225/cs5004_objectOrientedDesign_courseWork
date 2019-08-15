package edu.neu.ccs.cs5004.assignment4.problem2;

/**
 * Represent the baseball.
 */
public class BaseballRecord extends Record {

  private static final int WINVALUE = 1;

  /**
   * Create a baseball.
   * with number of wins and number of losses
   *
   * @param numWins the number of wins
   * @param numLoss the number of losses
   */
  public BaseballRecord(int numWins, int numLoss) throws IllegalArgumentException {
    super(numWins, numLoss);
  }

  /**
   * return the points of the baseball team.
   *
   * @return the points of the baseball team
   */
  public int getPointsSum() {
    return WINVALUE * numWins;
  }
}

