package edu.neu.ccs.cs5004.assignment4.problem2;

/**
 * Represents the clients' retrieving winner.
 */
public interface RetrieveWinner {
  /**
   * if the game is tie,throws TiedGameException,else return the winner.
   *
   * @return winner
   */
  Team getWinner() throws TiedGameException;
}
