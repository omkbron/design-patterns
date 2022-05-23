package com.omkbron.designpatterns.behavioral.chainofresponsibility;

/**
 * @author Omar Velasco - omvp29@gmail.com
 */
public interface ApproveLoanChain {
    void setNext(ApproveLoanChain loan);
    ApproveLoanChain getNext();
    void creditCardRequest(int totalLoan);
}
