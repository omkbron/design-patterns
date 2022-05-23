package com.omkbron.designpatterns.behavioral.chainofresponsibility;

/**
 * @author Omar Velasco - omvp29@gmail.com
 */
public class Gold implements ApproveLoanChain {
    private ApproveLoanChain next;

    @Override
    public void setNext(ApproveLoanChain loan) {
        this.next = loan;
    }

    @Override
    public ApproveLoanChain getNext() {
        return next;
    }

    @Override
    public void creditCardRequest(int totalLoan) {
        if (totalLoan <= 10000) {
            System.out.println("This credit card request is handled by Gold Card");
        } else {
            next.creditCardRequest(totalLoan);
        }
    }
}
