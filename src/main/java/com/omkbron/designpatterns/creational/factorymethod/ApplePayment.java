package com.omkbron.designpatterns.creational.factorymethod;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Omar Velasco - omvp29@gmail.com
 */
@Slf4j
public class ApplePayment implements Payment {
  @Override
  public void doPayment() {
    log.info("Paying with Apple Pay");
  }
}
