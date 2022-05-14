package com.omkbron.designpatterns.creational.abstractfactory;

/**
 * @author Omar Velasco - omvp29@gmail.com
 */
public class PaymentMethodFactory implements AbstractFactory<PaymentMethod> {
  @Override
  public PaymentMethod create(String type) {
    switch (type) {
      case "DEBIT":
        return new Debit();
      case "CREDIT":
        return new Credit();
      default:
        throw new IllegalArgumentException("Payment method type not supported");
    }
  }
}
