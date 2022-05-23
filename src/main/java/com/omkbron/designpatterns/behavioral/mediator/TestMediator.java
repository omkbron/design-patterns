package com.omkbron.designpatterns.behavioral.mediator;

/**
 * @author Omar Velasco - omvp29@gmail.com
 */
public class TestMediator {
  public static void main(String[] args) {
    testMediator();
  }

  private static void testMediator() {
    ConcreteMediator mediator = new ConcreteMediator();
    ConcreteColleague1 user1 = new ConcreteColleague1(mediator);
    ConcreteColleague2 user2 = new ConcreteColleague2(mediator);

    mediator.setUser1(user1);
    mediator.setUser2(user2);

    user1.send("Hi, I'm user 1");
    user2.send("Hi user 1, I'm user 2");
  }
}
