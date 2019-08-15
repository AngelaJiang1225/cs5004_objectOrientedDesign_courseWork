package edu.neu.ccs.cs5004.assignment4.problem2;

/**
 * Represents exceptions for  client asking game winner for a tied game.
 */
public class TiedGameException extends Exception {

  /**
   * extends exceptions.
   */
  public TiedGameException() {
    super();
  }

  /**
   * errors.
   *
   * @param message errors
   */
  public TiedGameException(String message) {
    super(message);
  }

}
