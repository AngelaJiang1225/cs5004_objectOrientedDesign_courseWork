package edu.neu.ccs.cs5004.problem1;

/**
 * InvalidPopPeekException to be thrown when it is invalid to pop or peek.
 */
public class InvalidPopPeekEmptyException extends Exception {
  /**
   * Throw error message if peep or pop is invalid.
   *
   * @param message error messages
   */
  public InvalidPopPeekEmptyException(String message) {
    super(message);
  }
}
