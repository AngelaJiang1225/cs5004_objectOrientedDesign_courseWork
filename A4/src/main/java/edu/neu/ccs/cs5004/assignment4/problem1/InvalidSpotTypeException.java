package edu.neu.ccs.cs5004.assignment4.problem1;

/**
 * If a regular vehicle tries to park into such a spot,throw exception.
 */
public class InvalidSpotTypeException extends Exception {

  public InvalidSpotTypeException() {
    super();
  }

  /**
   * Exception for invalid spot type.
   *
   * @param message error message
   */
  public InvalidSpotTypeException(String message) {
    super(message);
  }
}
