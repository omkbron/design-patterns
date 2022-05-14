package com.omkbron.designpatterns.creational.prototype;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Omar Velasco - omvp29@gmail.com
 */
@Slf4j
public class Visa implements PrototypeCard {
  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public void getCard() {
    log.info("This is a Visa Card");
  }

  @Override
  public PrototypeCard clone() throws CloneNotSupportedException {
    log.info("Cloning Visa Card...");
    return (Visa) super.clone();
  }
}
