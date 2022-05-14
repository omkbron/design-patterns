package com.omkbron.designpatterns.creational.abstractfactory;

/**
 * @author Omar Velasco - omvp29@gmail.com
 */
public class CardFactory implements AbstractFactory<Card> {
  @Override
  public Card create(String type) {
    switch (type) {
      case "VISA":
        return new Visa();
      case "MASTERCARD":
        return new MasterCard();
      default:
        throw new IllegalArgumentException("Card type not supported");
    }
  }
}
