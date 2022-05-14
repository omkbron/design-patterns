package com.omkbron.designpatterns.creational.abstractfactory;

/**
 * @author Omar Velasco - omvp29@gmail.com
 */
public class MasterCard implements Card {
  @Override
  public String getCardNumber() {
    return "4321 4321 4321 4321";
  }

  @Override
  public String getCardType() {
    return "MASTERCARD";
  }
}
