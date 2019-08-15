package Problem2;

/**
 * Create an interface used by other classes
 */
public interface VehicleFunction {

  /**
   * accelerate the velocity
   */
  void acceleration(float accelerationFactor) throws InvalidAccelerationException;

  /**
   * decelerate the velocity
   */
  void deceleration(float decelerationFactor) throws InvalidDecelerationException;

  /**
   * change the direction
   */
  void directionChange(String direction) throws InvalidDirectionException;
}
