package edu.neu.ccs.cs5004.assignment4.problem1;

/**
 * If the parking spot provided as an input argument is not available,
 * you should throw an exception.
 */
public class UnavailableSpotException extends Exception {

  public UnavailableSpotException() {
    super();
  }

  /**
   * error message.
   *
   * @param message the error message
   */
  public UnavailableSpotException(String message) {
    super(message);
  }
}
