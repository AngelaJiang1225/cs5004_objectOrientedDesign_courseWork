package Problem2;

/**
 * Create InvalidDirectionException
 */
public class InvalidDirectionException extends Exception {

  /**
   * extends exceptions
   */
  public InvalidDirectionException() {
    super();
  }

  /**
   *
   * @param message exception message
   */
  public InvalidDirectionException(String message) {
    super(message);
  }

  /**
   *
   * @param message
   * @param cause
   */
  public InvalidDirectionException(String message, Throwable cause) {
    super(message, cause);
  }

  /**
   *
   * @param cause
   */
  public InvalidDirectionException(Throwable cause) {
    super(cause);
  }

}
