package com.omkbron.designpatterns.creational.builder;

import java.util.StringJoiner;

/**
 * @author Omar Velasco - omvp29@gmail.com
 */
public class Card {
  private final String cardType;
  private final String number;
  private final String name;
  private final int expires;
  private final boolean credit;

  private Card(CardBuilder builder) {
    this.cardType = builder.cardType;
    this.number = builder.number;
    this.name = builder.name;
    this.expires = builder.expires;
    this.credit = builder.credit;
  }

  public String getCardType() {
    return cardType;
  }

  public String getNumber() {
    return number;
  }

  public String getName() {
    return name;
  }

  public int getExpires() {
    return expires;
  }

  public boolean isCredit() {
    return credit;
  }

  public static CardBuilder builder() {
    return new CardBuilder();
  }

  @Override
  public String toString() {
    return new StringJoiner(", ", Card.class.getSimpleName() + "[", "]")
        .add("cardType='" + cardType + "'")
        .add("number='" + number + "'")
        .add("name='" + name + "'")
        .add("expires=" + expires)
        .add("credit=" + credit)
        .toString();
  }

  public static class CardBuilder {
    private String cardType;
    private String number;
    private String name;
    private int expires;
    private boolean credit;

    public CardBuilder cardType(String cardType) {
      this.cardType = cardType;
      return this;
    }

    public CardBuilder number(String number) {
      this.number = number;
      return this;
    }

    public CardBuilder name(String name) {
      this.name = name;
      return this;
    }

    public CardBuilder expires(int expires) {
      this.expires = expires;
      return this;
    }

    public CardBuilder credit(boolean credit) {
      this.credit = credit;
      return this;
    }

    public Card build() {
      return new Card(this);
    }
  }
}
