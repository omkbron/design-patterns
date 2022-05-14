package com.omkbron.designpatterns.creational.singleton;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Omar Velasco - omvp29@gmail.com
 */
@Slf4j
public class TestSingleton {
  public static void main(String[] args) {
    testSingleton();
  }

  private static void testSingleton() {
    Card.getInstance().setNumber("1234 1343 1234 4335");
    log.info("Card {}", Card.getInstance().getNumber());
  }
}
