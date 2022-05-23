package com.omkbron.designpatterns.behavioral.command;

/**
 * @author Omar Velasco - omvp29@gmail.com
 */
public class CreditCardDeactivateCommand implements Command {
  private CreditCard creditCard;

  public CreditCardDeactivateCommand(CreditCard creditCard) {
    this.creditCard = creditCard;
  }

  @Override
  public void execute() {
    this.creditCard.deactivate();
    this.creditCard.sendDeactivationSmsToCustomer();
  }
}
