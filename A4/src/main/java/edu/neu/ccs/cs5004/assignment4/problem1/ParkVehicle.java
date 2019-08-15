package edu.neu.ccs.cs5004.assignment4.problem1;

/**
 * To let client know whether they can park vehicle in the parking spot.
 */
public class ParkVehicle {

  /**
   * Check whether the vehicle can park at the parking spot.
   *
   * @return true if the vehicle can park
   * @throws UnavailableSpotException the spot has been taken
   * @throws InvalidSpotTypeException the spot type is not fit for the vehicle
   * @throws InvalidSpotSizeException the spot size is not fit for the vehicle
   */
  private boolean checkParkVehicle(Vehicle vehicle, ParkingSpot parkingSpot)
      throws UnavailableSpotException, InvalidSpotTypeException, InvalidSpotSizeException {
    if (parkingSpot.getParkingStatus().equals(ParkingStatus.TAKEN)) {
      throw new UnavailableSpotException("The spot has been taken!");
    }
    if (parkingSpot.getParkingType().equals(ParkingType.DISABILITY) && vehicle
        .getVehicleType().equals(VehicleType.REGULAR)) {
      throw new InvalidSpotTypeException("The spot is for disabled people,you are not allowed!");
    }
    if (parkingSpot.getParkingSize().equals(ParkingSize.SMALL) && vehicle.getVehicleSize()
        .equals(VehicleSize.MEDIUM)) {
      throw new InvalidSpotSizeException("The spot is too small for Medium vehicles!");
    }
    if (!parkingSpot.getParkingSize().equals(ParkingSize.LARGE) && vehicle
        .getVehicleSize().equals(VehicleSize.LARGE)) {
      throw new InvalidSpotSizeException("The spot is too small for large vehicles!");
    }
    return true;
  }

  /**
   * catch different exceptions regarding parking vehicles.
   *
   * @return true if the vehicle can park,else false
   */
  public boolean parkVehicleRes(Vehicle vehicle, ParkingSpot parkingSpot) {
    try {
      checkParkVehicle(vehicle, parkingSpot);
    } catch (UnavailableSpotException e) {

      System.out.println(e.toString());
      return false;
    } catch (InvalidSpotTypeException e) {

      System.out.println(e.toString());
      return false;
    } catch (InvalidSpotSizeException e) {

      System.out.println(e.toString());
      return false;
    }
    return true;
  }
}
