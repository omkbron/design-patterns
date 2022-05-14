package com.omkbron.designpatterns.creational.abstractfactory;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Omar Velasco - omvp29@gmail.com
 */
@Slf4j
public class TestAbstractFactory {
  public static void main(String[] args) {
    testAbstractFactory();
  }

  private static void testAbstractFactory() {
    AbstractFactory cardFactory = FactoryProvider.getFactory("Card");
    Card card = (Card) cardFactory.create("VISA");

    AbstractFactory paymentMethodFactory = FactoryProvider.getFactory("PaymentMethod");
    PaymentMethod paymentMethod = (PaymentMethod) paymentMethodFactory.create("CREDIT");

    log.info("Card: {} PaymentMethod: {}", card.getCardType(), paymentMethod.doPayment());
  }
}
