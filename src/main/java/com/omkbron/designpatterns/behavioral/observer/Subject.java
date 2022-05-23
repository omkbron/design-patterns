package com.omkbron.designpatterns.behavioral.observer;

/**
 * @author Omar Velasco - omvp29@gmail.com
 */
public interface Subject {
  void register(Observer observer);
  void unregister(Observer observer);
  void notifyObservers(TrafficLight trafficLight);
}
