package com.omkbron.designpatterns.behavioral.chainofresponsibility;

/**
 * @author Omar Velasco - omvp29@gmail.com
 */
public class Card implements ApproveLoanChain {
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
        Gold gold = new Gold();
        this.setNext(gold);

        Platinum platinum = new Platinum();
        gold.setNext(platinum);

        Black black = new Black();
        platinum.setNext(black);

        next.creditCardRequest(totalLoan);
    }
}
