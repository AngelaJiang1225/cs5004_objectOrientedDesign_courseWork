package edu.neu.ccs.cs5004.assignment4.problem2;

/**
 * Represents exceptions for  client asking game winner for tied teams.
 */
public class TiedTeamsException extends Exception {

  /**
   * extends exceptions.
   */
  public TiedTeamsException() {
    super();
  }

  /**
   * errors
   *
   * @param message errors
   */
  public TiedTeamsException(String message) {
    super(message);
  }

}

