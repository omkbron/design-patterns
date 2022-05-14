package com.omkbron.designpatterns.creational.singleton;

/**
 * @author Omar Velasco - omvp29@gmail.com
 */
public class Card {
  private static Card instance;

  private String number;

  private Card() {}

  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public static synchronized Card getInstance() {
    if (instance == null) {
      instance = new Card();
    }
    return instance;
  }
}
