package edu.neu.ccs.cs5004.assignment4.problem2;

/**
 * Represents exceptions for  client asking game winner for a tied game.
 */
public class FutureGameException extends Exception {

  /**
   * extends exceptions.
   */
  public FutureGameException() {
    super();
  }

  /**
   * error message.
   *
   * @param message ERROR
   */
  public FutureGameException(String message) {
    super(message);
  }

}
