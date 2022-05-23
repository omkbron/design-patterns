package com.omkbron.designpatterns.behavioral.command;

/**
 * @author Omar Velasco - omvp29@gmail.com
 */
public class CreditCard {
  public void sendPinNumberToCustomer() {
    System.out.println("Pin number has been sent to the customer.");
  }

  public void sendActivationSmsToCustomer() {
    System.out.println("Activation SMS has been sent to the customer. Contact us if you haven't received it.");
  }

  public void activate() {
    System.out.println("The card has been activated.");
  }

  public void deactivate() {
    System.out.println("The card has been deactivated.");
  }

  public void sendDeactivationSmsToCustomer() {
    System.out.println("Deactivation SMS has been sent to the customer.");
  }
}
