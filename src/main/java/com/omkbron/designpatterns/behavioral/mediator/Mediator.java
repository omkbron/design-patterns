package com.omkbron.designpatterns.behavioral.mediator;

/**
 * @author Omar Velasco - omvp29@gmail.com
 */
public interface Mediator {
  void send(String message, Colleague colleague);
}
