package Problem2;

/**
 * Represents an Automobile with their details
 */
public class Automobile extends Vehicle {

  private static final float MAXVELOCITY = 70;

  /**
   * Creates a new automobile given the color,makeAndModel,licensePlate,velocity,direction
   *
   * @param color the color of Automobile
   * @param makeAndModel the make and model of Automobile
   * @param licensePlate the licensePlate of Automobile
   * @param velocity the velocity of Automobile
   * @param direction the direction of Automobile
   */
  public Automobile(String color, MakeModel makeAndModel, LicensePlate licensePlate, int velocity,
      String direction) throws IllegalArgumentException {
    super(color, makeAndModel, licensePlate, velocity, direction);
  }


  /**
   * use acceleration() to accelerate the velocity
   *
   * @param accelerationFactor accelerationFactor of the automobile
   */
  @Override
  public void acceleration(float accelerationFactor)
      throws InvalidAccelerationException {
    if (this.checkAccelerationFactor(accelerationFactor)) {
      float v = this.velocity + this.velocity * accelerationFactor / this.PERCENT;
      if (v > this.MAXVELOCITY) {
        throw new InvalidAccelerationException("The acceleration is out of range!");
      } else {
        this.velocity = v;
      }
    }
  }
}

