package com.omkbron.designpatterns.creational.abstractfactory;

/**
 * @author Omar Velasco - omvp29@gmail.com
 */
public class Credit implements PaymentMethod {
  @Override
  public String doPayment() {
    return "Paying with credit";
  }
}
