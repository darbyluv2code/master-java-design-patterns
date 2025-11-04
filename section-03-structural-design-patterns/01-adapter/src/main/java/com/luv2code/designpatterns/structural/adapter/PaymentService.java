package com.luv2code.designpatterns.structural.adapter;

import java.math.BigDecimal;

/**
 * Client (PaymentService)
 *
 * Uses the PaymentProcessor interface to process payments
 * It is unaware of the underlying payment process or adapter.
 */
public class PaymentService {

    public void processPayment(PaymentProcessor paymentProcessor, BigDecimal amount) {
        paymentProcessor.pay(amount);
    }

}
