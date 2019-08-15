package Problem2;

/**
 * Represents a vehicle with details
 */

public abstract class Vehicle implements VehicleFunction {

  protected String color;
  protected MakeModel makeAndModel;//information about a vehicle’s make and model
  protected LicensePlate licensePlate;//information about numbers, state and expiration date of a vehicle’s license plate
  protected float velocity;
  protected String direction;
  protected static final float ACCELERATIONLOW = 10;
  protected static final float ACCELERATIONHIGH = 50;
  protected static final float DECELERATIONLOW = 20;
  protected static final float DECELERATIONHIGH = 50;
  protected static final float MINVELOCITY = 40;
  protected static final float MINVELOCITYOVERALL = 0;
  protected static final int PERCENT = 100;
  protected static final String NORTH = "Northbound";
  protected static final String WEST = "Westbound";
  protected static final String EAST = "Eastbound";
  protected static final String SOUTH = "Southbound";

  /**
   * (abstract)Creates a new vehicle given the color,makeAndModel,licensePlate,velocity,direction
   *
   * @param color the color of vehicle
   * @param makeAndModel the make and model of vehicle
   * @param licensePlate the licensePlate of vehicle
   * @param velocity the velocity of vehicle
   * @param direction the direction of vehicle
   */

  public Vehicle(String color, MakeModel makeAndModel, LicensePlate licensePlate, float velocity,
      String direction) throws IllegalArgumentException {
    this.color = color;
    this.makeAndModel = makeAndModel;
    this.licensePlate = licensePlate;
    this.direction = direction;
    if (this.checkVelocity(velocity)) {
      this.velocity = velocity;
    }
    if (this.checkDirection(direction)) {
      this.direction = direction;
    }
  }

  /**
   * check if the velocity is within the range
   *
   * @param velocity the velocity of the vehicle
   * @return true or throw exeption
   */
  private boolean checkVelocity(float velocity) throws IllegalArgumentException {
    if (velocity < this.MINVELOCITYOVERALL) {
      throw new IllegalArgumentException("The velocity is beyond minimum speed!");
    } else {
      return true;
    }
  }

  /**
   * check if the direction to be changed is legal
   *
   * @param direction of the vehicle
   * @return true or throw exeption
   */
  private boolean checkDirection(String direction) throws IllegalArgumentException {
    if (direction.equals(NORTH) || direction.equals(WEST) || direction.equals(EAST) || direction
        .equals(SOUTH)) {
      return true;
    } else {
      throw new IllegalArgumentException("The direction is illegal!");
    }
  }

  /**
   * @return the color
   */
  public String getColor() {
    return color;
  }

  /**
   * @return make and model
   */
  public MakeModel getMakeAndModel() {
    return this.makeAndModel;
  }

  /**
   * @return license plate
   */
  public LicensePlate getLicensePlate() {
    return this.licensePlate;
  }

  /**
   * @return velocity
   */
  public double getVelocity() {
    return this.velocity;
  }

  /**
   * @return direction
   */
  public String getDirection() {
    return this.direction;
  }

  /**
   * check whether acceleration can be made
   *
   * @param accelerationFactor the accelerationFactor
   * @return true or throw exception
   */
  public boolean checkAccelerationFactor(float accelerationFactor) {
    if (accelerationFactor < this.ACCELERATIONLOW || accelerationFactor > this.ACCELERATIONHIGH) {
      throw new IllegalArgumentException("The acceleration factor is out of range!");
    } else {
      return true;
    }
  }

  /**
   * check whether checkDecelerationFactor can be made
   *
   * @param decelerationFactor the deceleration factor
   * @return true or throw exception
   */
  public boolean checkDecelerationFactor(float decelerationFactor) throws IllegalArgumentException {
    if (decelerationFactor < this.DECELERATIONLOW || decelerationFactor > this.DECELERATIONHIGH) {
      throw new IllegalArgumentException("The decelerationFactor is out of range!");
    } else {
      return true;
    }
  }

  /**
   * if the deceleration is valid than change the velocity
   */
  @Override
  public void deceleration(float decelerationFactor) throws InvalidDecelerationException {
    if (this.checkDecelerationFactor(decelerationFactor)) {

      float v = this.velocity - this.velocity * decelerationFactor / PERCENT;

      if (v < this.MINVELOCITY) {
        throw new InvalidDecelerationException("The deceleration is out of range!");
      } else {
        this.velocity = v;
      }
    }
  }

  /**
   * change the direction
   *
   * @param direction the direction
   */
  @Override
  public void directionChange(String direction) throws InvalidDirectionException {
    if (this.direction.equals(SOUTH) && direction.equals(NORTH)) {
      this.direction = NORTH;
    } else if (this.direction.equals(NORTH) && direction.equals(SOUTH)) {
      this.direction = SOUTH;
    } else if (this.direction.equals(EAST) && direction.equals(WEST)) {
      this.direction = WEST;
    } else if (this.direction.equals(WEST) && direction.equals(EAST)) {
      this.direction = EAST;
    } else {
      throw new InvalidDirectionException("The direction is illegal!");
    }
  }
}

