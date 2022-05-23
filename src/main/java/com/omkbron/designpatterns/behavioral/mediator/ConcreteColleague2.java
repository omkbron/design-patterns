package com.omkbron.designpatterns.behavioral.mediator;

/**
 * @author Omar Velasco - omvp29@gmail.com
 */
public class ConcreteColleague2 extends Colleague {

  public ConcreteColleague2(Mediator mediator) {
    super(mediator);
  }

  @Override
  public void send(String message) {
    mediator.send(message, this);
  }

  @Override
  public void receive(String message) {
    System.out.println("Colleague 2 has received the message: " + message);
  }
}
