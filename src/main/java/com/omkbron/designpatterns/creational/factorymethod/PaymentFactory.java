package com.omkbron.designpatterns.creational.factorymethod;

/**
 * @author Omar Velasco - omvp29@gmail.com
 */
public class PaymentFactory {
  public static Payment buildPayment(PaymentType paymentType) {
    switch (paymentType) {
      case CREDIT_CARD:
        return new CreditCardPayment();
      case GOOGLE_PAY:
        return new GooglePayment();
      case APPLE_PAY:
        return new ApplePayment();
      default:
        return new CreditCardPayment();
    }
  }
}
