package com.omkbron.designpatterns.creational.abstractfactory;

/**
 * @author Omar Velasco - omvp29@gmail.com
 */
public class Visa implements Card {
  @Override
  public String getCardNumber() {
    return "1234 1234 1234 1234";
  }

  @Override
  public String getCardType() {
    return "VISA";
  }
}
