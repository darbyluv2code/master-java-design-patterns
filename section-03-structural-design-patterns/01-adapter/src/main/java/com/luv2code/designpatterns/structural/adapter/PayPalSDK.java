package com.luv2code.designpatterns.structural.adapter;

import java.math.BigDecimal;

/**
 * Adaptee (PayPalSDK)
 *
 * Represents a third-party PayPal API with incompatible method signature.
 *
 * The PayPalAdapter will convert our app's params into suitable params for PayPal API
 */
public class PayPalSDK {

    // PayPal expects a BigDecimal amount and an explicit currency code
    public void sendPayment(BigDecimal amount, String currencyCode) {

        // Note: API operates on BigDecimal for money to avoid floating-point issues
        System.out.println("Processing PayPal payment of " + amount + " " + currencyCode);
    }

}
