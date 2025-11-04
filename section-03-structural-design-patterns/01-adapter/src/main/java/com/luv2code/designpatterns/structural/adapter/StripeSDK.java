package com.luv2code.designpatterns.structural.adapter;

import java.math.BigDecimal;

/**
 * Adaptee (StripeSDK)
 *
 * Represents the Stripe payment API with an incompatible method signature.
 *
 * The StripeAdapter converts our app's dollars into cents expected here.
 */
public class StripeSDK {

    // Stripe expects payment in cents, not dollars
    public void makePayment(long cents) {

        System.out.println("Processing Stripe payment amount: " +
                new BigDecimal(cents).movePointLeft(2).toPlainString());

    }

}
