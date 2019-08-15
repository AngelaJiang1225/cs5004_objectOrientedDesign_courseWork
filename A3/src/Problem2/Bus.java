package Problem2;

/**
 * Represents an bus with their details
 */
public class Bus extends Vehicle {

  private static final float MAXVELOCITY = 60;

  /**
   * Creates a new bus given the color,makeAndModel,licensePlate,velocity,direction
   *
   * @param color the color of bus
   * @param makeAndModel the make and model of bus
   * @param licensePlate the licensePlate of bus
   * @param velocity the velocity of bus
   * @param direction the direction of bus
   */
  public Bus(String color, MakeModel makeAndModel, LicensePlate licensePlate, int velocity,
      String direction)
      throws IllegalArgumentException {
    super(color, makeAndModel, licensePlate, velocity, direction);
  }

  /**
   * use acceleration() to accelerate the velocity
   *
   * @param accelerationFactor accelerationFactor of the bus
   */
  @Override
  public void acceleration(float accelerationFactor)
      throws IllegalArgumentException, InvalidAccelerationException {
    if (accelerationFactor < this.ACCELERATIONLOW || accelerationFactor > this.ACCELERATIONHIGH) {
      throw new IllegalArgumentException("The acceleration factor is out of range!");
    }
    float v = this.velocity + this.velocity * accelerationFactor / this.PERCENT;
    if (v > this.MAXVELOCITY) {
      throw new InvalidAccelerationException("The acceleration is out of range!");
    } else {
      this.velocity = v;
    }
  }
}
