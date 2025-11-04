package com.luv2code.designpatterns.structural.bridge;

import java.math.BigDecimal;

/**
 * A Refined Abstraction for handling credit card payments.
 */
public class CreditCardPayment extends Payment {

    public CreditCardPayment(CurrencyProcessor currencyProcessor) {
        super(currencyProcessor);
    }

    /**
     * A helper method to handle logic specific to the CreditCardPayment abstraction.
     * In a real-world application, this would contact a payment gateway
     * to authorize the card details.
     */
    private void authorizeCreditCard() {

        System.out.println("[CreditCardPayment] Contacting payment gateway to authorize charge ...");

        // Simulate a network delay
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("[CreditCardPayment] Card authorized.");
    }

    @Override
    public void pay(BigDecimal amount) {

        System.out.println("--- BEGIN: Credit Card Transaction ---");

        // 1. Handle the abstraction-specific logic first
        authorizeCreditCard();

        // 2. Delegate the implementation-specific logic to the CurrencyProcessor
        //    This is the "bridge" in action
        currencyProcessor.pay(amount);

        System.out.println("--- END: Credit Card Transaction ---");

    }

}






