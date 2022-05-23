package com.omkbron.designpatterns.behavioral.observer;

/**
 * @author Omar Velasco - omvp29@gmail.com
 */
public class TestObserver {
  public static void main(String[] args) {
    testObserver();
  }

  private static void testObserver() {
    Car car = new Car();
    Walker walker = new Walker();
    MessagePublisher publisher = new MessagePublisher();

    publisher.register(car);
    publisher.register(walker);
    TrafficLight trafficLight = new TrafficLight("RED_FOR_CAR");
    publisher.notifyObservers(trafficLight);

    simulateTrafficLightTimer(5);

    trafficLight.setStatus("GREEN_FOR_CAR");
    publisher.notifyObservers(trafficLight);
  }

  private static void simulateTrafficLightTimer(int seconds) {
    do {
      System.out.println(seconds);
      seconds--;
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        System.err.println("An error occurred " + e.getMessage());
      }
    } while (seconds > 0);
  }
}
