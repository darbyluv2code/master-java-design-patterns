package com.luv2code.designpatterns.structural.adapter;

import java.math.BigDecimal;

/**
 * Target Interface (PaymentProcessor)
 *
 * Defines the standard interface expected by the client (PaymentService)
 * All adapters will implement this interface to make compatible APIs work
 */
public interface PaymentProcessor {

    void pay(BigDecimal amount);

}
