package com.omkbron.designpatterns.creational.builder;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Omar Velasco - omvp29@gmail.com
 */
@Slf4j
public class TestBuilder {
  public static void main(String[] args) {
    testBuilder();
  }

  private static void testBuilder() {
    Card card =
        Card.builder()
            .cardType("VISA")
            .number("1234 1234 1234 1234")
            .name("Omar Velasco Peña")
            .expires(2027)
            .credit(true)
            .build();

    Card card2 =
        Card.builder()
            .cardType("AMEX")
            .number("1234 123412 13244")
            .name("Rodrigo Velasco Peña")
            .expires(2023)
            .credit(true)
            .build();

    log.info("Card: {}", card);
    log.info("Card2: {}", card2);
  }
}
