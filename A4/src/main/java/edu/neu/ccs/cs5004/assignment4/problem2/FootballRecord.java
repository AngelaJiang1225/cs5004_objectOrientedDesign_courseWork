package edu.neu.ccs.cs5004.assignment4.problem2;

/**
 * Represent the football record.
 */
public class FootballRecord extends Record {

  private int numTies;
  private static final int WINVALUE = 1;


  /**
   * Create a football with number of wins and number of losses.
   *
   * @param numWin  the number of wins
   * @param numLoss the number of losses
   * @param numTies the number of ties
   * @throws IllegalArgumentException IllegalArgumentException
   */

  public FootballRecord(int numWin, int numLoss, int numTies) throws IllegalArgumentException {
    super(numWin, numLoss);
    this.numTies = numTies;
  }

  /**
   * return the points of the football team.
   *
   * @return the points of the football team
   */
  public int getPointsSum() {
    return WINVALUE * this.numWins;
  }

  /**
   * return the number of ties.
   *
   * @return the number of ties
   */
  public int getNumTies() {
    return this.numTies;
  }

  /**
   * set the number of ties.
   */
  public void setNumTies(int numTies) {
    this.numTies = numTies;
  }
}

