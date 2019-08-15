package Problem2;

/**
 * Represents an motorcycle with their details
 */
public class Motorcycle extends Vehicle {

  private static final int MAXVELOCITY = 65;

  /**
   * Creates a new motorcycle given the color,makeAndModel,licensePlate,velocity,direction
   *
   * @param color the color of motorcycle
   * @param makeAndModel the make and model of motorcycle
   * @param licensePlate the licensePlate of motorcycle
   * @param velocity the velocity of motorcycle
   * @param direction the direction of motorcycle
   */
  public Motorcycle(String color, MakeModel makeAndModel, LicensePlate licensePlate, int velocity,
      String direction)
      throws IllegalArgumentException {
    super(color, makeAndModel, licensePlate, velocity, direction);
  }

  /**
   * use acceleration() to accelerate the velocity
   *
   * @param accelerationFactor accelerationFactor of the motorcycle
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



