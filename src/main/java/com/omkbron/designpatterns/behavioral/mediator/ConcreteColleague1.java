package com.omkbron.designpatterns.behavioral.mediator;

/**
 * @author Omar Velasco - omvp29@gmail.com
 */
public class ConcreteColleague1 extends Colleague {

  public ConcreteColleague1(Mediator mediator) {
    super(mediator);
  }

  @Override
  public void send(String message) {
    mediator.send(message, this);
  }

  @Override
  public void receive(String message) {
    System.out.println("Colleague 1 has received the message: " + message);
  }
}
