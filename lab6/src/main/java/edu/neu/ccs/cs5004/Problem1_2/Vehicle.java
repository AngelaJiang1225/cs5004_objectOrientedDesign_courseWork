package edu.neu.ccs.cs5004.Problem1_2;

public abstract class Vehicle {
  private String id;
  private float avgSpeed;
  private float maxSpeed;

  public Vehicle(String id, float avgSpeed, float maxSpeed) {
    this.id = id;
    this.avgSpeed = avgSpeed;
    this.maxSpeed = maxSpeed;
  }

  public String getId() {
    return id;
  }

  public float getAvgSpeed() {
    return avgSpeed;
  }

  public float getMaxSpeed() {
    return maxSpeed;
  }

}
