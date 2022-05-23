package com.omkbron.designpatterns.behavioral.observer;

/**
 * @author Omar Velasco - omvp29@gmail.com
 */
public class Walker implements Observer {
  @Override
  public void update(TrafficLight trafficLight) {
    if ("RED_FOR_CAR".equals(trafficLight.getStatus())) {
      System.out.println("Traffic light for walker is on green -> Walker can pass");
    } else {
      System.out.println("Traffic light for walker is on red -> Walker cannot pass");
    }
  }
}
