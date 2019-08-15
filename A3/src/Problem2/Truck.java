package Problem2;

/**
 * Represents an Truck with their details
 */
public class Truck extends Vehicle {

  private static final int MAXVELOCITY = 60;

  /**
   * Creates a new Truck given the color,makeAndModel,licensePlate,velocity,direction
   *
   * @param color the color of Truck
   * @param makeAndModel the make and model of Truck
   * @param licensePlate the licensePlate of Truck
   * @param velocity the velocity of Truck
   * @param direction the direction of Truck
   */
  public Truck(String color, MakeModel makeAndModel, LicensePlate licensePlate, int velocity,
      String direction)
      throws IllegalArgumentException {
    super(color, makeAndModel, licensePlate, velocity, direction);
    if (this.velocity < this.MINVELOCITY || this.velocity > this.MAXVELOCITY) {
      throw new IllegalArgumentException("The velocity is out of range!");
    }
  }

  /**
   * use acceleration() to accelerate the velocity
   *
   * @param accelerationFactor accelerationFactor of the Truck
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
