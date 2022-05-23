package com.omkbron.designpatterns.behavioral.mediator;

/**
 * @author Omar Velasco - omvp29@gmail.com
 */
public class ConcreteMediator implements Mediator {
  private ConcreteColleague1 user1;
  private ConcreteColleague2 user2;

  public void setUser1(ConcreteColleague1 user1) {
    this.user1 = user1;
  }

  public void setUser2(ConcreteColleague2 user2) {
    this.user2 = user2;
  }

  @Override
  public void send(String message, Colleague colleague) {
    if (user1 == colleague) {
      user2.receive(message);
    } else if (user2 == colleague) {
      user1.receive(message);
    }
  }
}
