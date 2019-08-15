package edu.neu.ccs.cs5004.Problem1_2;

public class FleetManager {
  TripReport drive(float distance, Vehicle vehicle) {
    float dur = distance/vehicle.getAvgSpeed();
    TripReport newReport = new TripReport(vehicle.getClass().getName(), vehicle.getAvgSpeed(), distance, dur);
    return newReport;
  }
  TripReport drive(float distance, float speed, Vehicle vehicle) {
    float dur;
    if(speed > vehicle.getMaxSpeed()) {
      dur = distance/vehicle.getMaxSpeed();
      TripReport newReport = new TripReport(vehicle.getClass().getName(), vehicle.getAvgSpeed(), distance, dur);
      return newReport;
    }
    dur = distance/speed;
    TripReport newReport = new TripReport(vehicle.getClass().getName(), vehicle.getAvgSpeed(), distance, dur);
    return newReport;
  }
}
