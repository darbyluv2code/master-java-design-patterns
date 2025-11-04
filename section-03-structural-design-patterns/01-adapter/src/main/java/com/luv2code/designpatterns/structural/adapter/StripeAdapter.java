package com.luv2code.designpatterns.structural.adapter;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Adapter (StripeAdapter)
 *
 * Implements PaymentProcessor and bridges our app with StripeSDK.
 *
 * Converts BigDecimal amounts into cents since Stripe expects minor units.
 */
public class StripeAdapter implements PaymentProcessor {

    // Reference to the adaptee
    private StripeSDK stripeSDK;

    public StripeAdapter(StripeSDK stripeSDK) {
        this.stripeSDK = stripeSDK;
    }

    @Override
    public void pay(BigDecimal amount) {

        // Normalize to 2 decimals, then convert to cents exactly
        BigDecimal scaled = amount.setScale(2, RoundingMode.HALF_UP);
        long cents = scaled.movePointRight(2).longValueExact();

        System.out.println("[StripeAdapter] Converting " + scaled
                            + " -> " + cents + " cents for Stripe.");
        stripeSDK.makePayment(cents);
    }

}







