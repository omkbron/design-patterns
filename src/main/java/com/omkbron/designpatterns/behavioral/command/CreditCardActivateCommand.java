package com.omkbron.designpatterns.behavioral.command;

/**
 * @author Omar Velasco - omvp29@gmail.com
 */
public class CreditCardActivateCommand implements Command {
  private CreditCard creditCard;

  public CreditCardActivateCommand(CreditCard creditCard) {
    this.creditCard = creditCard;
  }

  @Override
  public void execute() {
    this.creditCard.sendPinNumberToCustomer();
    this.creditCard.activate();
    this.creditCard.sendActivationSmsToCustomer();
  }
}
