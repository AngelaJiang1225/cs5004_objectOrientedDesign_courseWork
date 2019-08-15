package Problem2;

/**
 * Represents make and model with details
 */

public class MakeModel {

  private String make;
  private String model;

  /**
   * Creates a new make model given make and model
   *
   * @param make the company of making
   * @param model the model information
   */
  public MakeModel(String make, String model) {
    this.make = make;
    this.model = model;
  }

  /**
   * @return make
   */
  public String getMake() {
    return this.make;
  }

  /**
   * @return model
   */
  public String getModel() {
    return this.model;
  }
}
