package com.luv2code.designpatterns.structural.adapter;

import java.math.BigDecimal;

/**
 * Concrete implementation (DemoPaymentProcessor)
 *
 * Implements the PaymentProcessor interface directly
 * This simulates an in-house payment processor.
 * Showing that no adapter is needed when the API already matches
 * the Target common interface
 */
public class DemoPaymentProcessor implements PaymentProcessor {

    @Override
    public void pay(BigDecimal amount) {

        // Direct implementation - no translation / conversion needed
        System.out.println("Processing Demo payment of: " + amount);

    }
}
