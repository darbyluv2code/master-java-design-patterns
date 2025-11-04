package com.luv2code.designpatterns.structural.adapter;

import java.math.BigDecimal;

/**
 * Adapter (PayPalAdapter)
 *
 * Implements PaymentProcessor and bridges our app with PayPal SDK.
 *
 * Converts BigDecimal amounts and adds the required currency code.
 */
public class PayPalAdapter implements PaymentProcessor {

    // Reference to the adaptee
    private PayPalSDK payPalSDK;

    public PayPalAdapter(PayPalSDK payPalSDK) {
        this.payPalSDK = payPalSDK;
    }

    @Override
    public void pay(BigDecimal amount) {

        System.out.println("[PayPalAdapter] Forwarding payment for " + amount + " with currency USD");

        // Delegate to the adaptee's API
        payPalSDK.sendPayment(amount, "USD");
    }

}







