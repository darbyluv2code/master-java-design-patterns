package com.luv2code.designpatterns.structural.adapter;

import java.math.BigDecimal;

/**
 * Demo Client (MainApp)
 *
 * Demonstrates the Adapter pattern by processing payments
 * using Demo, Stripe and PayPal providers.
 *
 * Shows how new providers can be added without changing client code.
 */
public class MainApp {

    public static void main(String[] args) {

        PaymentService paymentService = new PaymentService();

        // Demo ... no adapter needed
        PaymentProcessor demo = new DemoPaymentProcessor();
        paymentService.processPayment(demo, new BigDecimal("100.00"));

        System.out.println();

        // PayPal (BigDecimal + currency)
        PaymentProcessor payPal = new PayPalAdapter(new PayPalSDK());
        paymentService.processPayment(payPal, new BigDecimal("125.00"));

        System.out.println();

        // Stripe (BigDecimal -> cents)
        PaymentProcessor stripe = new StripeAdapter(new StripeSDK());
        paymentService.processPayment(stripe, new BigDecimal("150.00"));
    }
}








