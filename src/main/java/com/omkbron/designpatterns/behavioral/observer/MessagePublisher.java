package com.omkbron.designpatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Omar Velasco - omvp29@gmail.com
 */
public class MessagePublisher implements Subject {

  private List<Observer> observers = new ArrayList<>();

  @Override
  public void register(Observer observer) {
    observers.add(observer);
  }

  @Override
  public void unregister(Observer observer) {
    observers.remove(observer);
  }

  @Override
  public void notifyObservers(TrafficLight trafficLight) {
    for (Observer observer : observers) {
        observer.update(trafficLight);
    }
  }
}
