package com.omkbron.designpatterns.behavioral.command;

/**
 * @author Omar Velasco - omvp29@gmail.com
 */
public class CreditCardInvoker {
  private Command command;

  public void setCommand(Command command) {
    this.command = command;
  }

  public void run() {
    command.execute();
  }
}
