package com.omkbron.designpatterns.behavioral.observer;

/**
 * @author Omar Velasco - omvp29@gmail.com
 */
public class TrafficLight {
  private String status;

  public TrafficLight(String status) {
    this.status = status;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }
}
