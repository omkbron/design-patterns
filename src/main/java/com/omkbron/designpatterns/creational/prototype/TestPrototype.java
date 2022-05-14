package com.omkbron.designpatterns.creational.prototype;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Omar Velasco - omvp29@gmail.com
 */
@Slf4j
public class TestPrototype {
  public static void main(String[] args) {
    testPrototype();
  }

  private static void testPrototype() {
    PrototypeFactory.loadCard();
    try {
      PrototypeCard visa = PrototypeFactory.getInstance(CardType.VISA);
      visa.getCard();

      PrototypeCard amex = PrototypeFactory.getInstance(CardType.AMEX);
      amex.getCard();
    } catch (CloneNotSupportedException e) {
      log.error("Error while cloning cards", e);
    }
  }
}
