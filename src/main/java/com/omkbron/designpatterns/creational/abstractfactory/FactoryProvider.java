package com.omkbron.designpatterns.creational.abstractfactory;

/**
 * @author Omar Velasco - omvp29@gmail.com
 */
public class FactoryProvider {
  public static AbstractFactory getFactory(String factoryType) {
    switch (factoryType) {
      case "Card":
        return new CardFactory();
      case "PaymentMethod":
        return new PaymentMethodFactory();
      default:
        throw new IllegalArgumentException("Factory type not supported");
    }
  }
}
