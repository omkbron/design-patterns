package com.omkbron.designpatterns.creational.factorymethod;

/**
 * @author Omar Velasco - omvp29@gmail.com
 */
public class TestFactoryMethod {
  public static void main(String[] args) {
    testFactoryMethod();
  }

  private static void testFactoryMethod() {
    Payment payment = PaymentFactory.buildPayment(PaymentType.APPLE_PAY);
    payment.doPayment();
  }
}
