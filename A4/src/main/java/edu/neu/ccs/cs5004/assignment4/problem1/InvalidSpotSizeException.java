package edu.neu.ccs.cs5004.assignment4.problem1;

public class InvalidSpotSizeException extends Exception {

  public InvalidSpotSizeException() {
    super();
  }

  /**
   * Invalid spot size.
   *
   * @param message the error message
   */
  public InvalidSpotSizeException(String message) {
    super(message);
  }
}
