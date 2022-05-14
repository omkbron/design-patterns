package com.omkbron.designpatterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Omar Velasco - omvp29@gmail.com
 */
public class PrototypeFactory {
  private static Map<CardType, PrototypeCard> prototypes = new HashMap<>();

  public static PrototypeCard getInstance(CardType cardType) throws CloneNotSupportedException {
    return prototypes.get(cardType).clone();
  }

  public static void loadCard() {
    Visa visa = new Visa();
    visa.setName("Visa card 1234 1243 1243 1242");

    Amex amex = new Amex();
    amex.setName("Amex card 1234 124332 12433");

    prototypes.put(CardType.VISA, visa);
    prototypes.put(CardType.AMEX, amex);
  }
}
