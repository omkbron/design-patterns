package com.omkbron.designpatterns.behavioral.iterator;

/**
 * @author Omar Velasco - omvp29@gmail.com
 */
public class TestIterator {
  public static void main(String[] args) {
    testIterator();
  }

  private static void testIterator() {
    Card[] cards = new Card[5];
    cards[0] = new Card("VISA");
    cards[1] = new Card("AMEX");
    cards[2] = new Card("MASTERCARD");
    cards[3] = new Card("GOOGLE CARD");
    cards[4] = new Card("APPLE CARD");

    List list = new CardList(cards);
    Iterator iterator = list.iterator();

    while (iterator.hasNext()) {
      Card card = (Card) iterator.next();
      System.out.println(card.getType());
    }
  }
}
