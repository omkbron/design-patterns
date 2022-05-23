package com.omkbron.designpatterns.behavioral.iterator;

/**
 * @author Omar Velasco - omvp29@gmail.com
 */
public class CardList implements List {
  private final Card[] cards;

  public CardList(Card[] cards) {
    this.cards = cards;
  }

  @Override
  public Iterator iterator() {
    return new CardIterator(cards);
  }
}
