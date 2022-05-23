package com.omkbron.designpatterns.behavioral.command;

/**
 * @author Omar Velasco - omvp29@gmail.com
 */
public class TestCommand {
  public static void main(String[] args) {
    testCommand();
  }

  private static void testCommand() {
    CreditCard creditCardActivate = new CreditCard();
    CreditCard creditCardDeactivate = new CreditCard();
    CreditCardInvoker invoker = new CreditCardInvoker();

    invoker.setCommand(new CreditCardActivateCommand(creditCardActivate));
    invoker.run();

    System.out.println("===================");

    invoker.setCommand(new CreditCardDeactivateCommand(creditCardDeactivate));
    invoker.run();
  }
}
