package com.omkbron.designpatterns.creational.prototype;

/**
 * @author Omar Velasco - omvp29@gmail.com
 */
public interface PrototypeCard extends Cloneable {
  void getCard();

  PrototypeCard clone() throws CloneNotSupportedException;
}
