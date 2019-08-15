package edu.neu.ccs.cs5004.Problem1_2;

public class TripReport {
  private String tripVehicle;
  private float speed;
  private float distance;
  private float tripDuration;

  public TripReport(String tripVehicle, float speed, float distance, float tripDuration) {
    this.tripVehicle = tripVehicle;
    this.speed = speed;
    this.distance = distance;
    this.tripDuration = tripDuration;
  }

  public String getTripVehicle() {
    return tripVehicle;
  }

  public float getSpeed() {
    return speed;
  }

  public float getDistance() {
    return distance;
  }

  public float getTripDuration() {
    return tripDuration;
  }
}
