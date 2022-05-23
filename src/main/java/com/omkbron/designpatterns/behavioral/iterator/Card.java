package com.omkbron.designpatterns.behavioral.iterator;

/**
 * @author Omar Velasco - omvp29@gmail.com
 */
public class Card {
  private String type;

  public Card(String type) {
    this.type = type;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }
}
