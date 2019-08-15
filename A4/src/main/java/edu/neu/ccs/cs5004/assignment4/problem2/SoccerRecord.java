package edu.neu.ccs.cs5004.assignment4.problem2;

/**
 * Represents the SoccerRecord sports.
 */
public class SoccerRecord extends Record {

  private int numTies;
  private static final int WINVALUE = 3;
  private static final int DRAWVALUE = 1;
  private static final int LOSSVALUE = 0;

  /**
   * Create soccer record.
   *
   * @param numWins number of wins
   * @param numLoss numebr of losses
   * @param numTies number of ties
   */
  public SoccerRecord(int numWins, int numLoss, int numTies) {
    super(numWins, numLoss);
    this.numTies = numTies;
  }

  /**
   * return the number of ties.
   *
   * @return the number of ties
   */
  public int getNumTies() {
    return numTies;
  }

  /**
   * return the sum of points.
   *
   * @return the sum of points
   */
  public int getPointsSum() {
    return (this.WINVALUE * this.numWins + this.DRAWVALUE * this.numTies
        + this.LOSSVALUE * this.numLoss);
  }

  /**
   * param numTies set the number of ties.
   *
   * @param numTies set the number of ties
   */
  public void setNumTies(int numTies) {
    this.numTies = numTies;
  }
}
