package com.omkbron.designpatterns.behavioral.chainofresponsibility;

/**
 * @author Omar Velasco - omvp29@gmail.com
 */
public class TestChainOfResponsibility {
  public static void main(String[] args) {
      testChainOfResponsibility();
  }

    private static void testChainOfResponsibility() {
        Card card = new Card();
        card.creditCardRequest(11000);
    }
}
