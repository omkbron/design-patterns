package com.omkbron.designpatterns.behavioral.observer;

/**
 * @author Omar Velasco - omvp29@gmail.com
 */
public class Car implements Observer {
  @Override
  public void update(TrafficLight trafficLight) {
    if ("RED_FOR_CAR".equals(trafficLight.getStatus())) {
      System.out.println("Traffic light for car is on red -> Car cannot pass");
    } else {
      System.out.println("Traffic light for car is on green -> Car can pass");
    }
  }
}
