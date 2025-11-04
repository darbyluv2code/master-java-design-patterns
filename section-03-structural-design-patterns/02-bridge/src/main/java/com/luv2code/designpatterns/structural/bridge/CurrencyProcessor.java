package com.luv2code.designpatterns.structural.bridge;

import java.math.BigDecimal;

/**
 * Defines the Implementor interface for processing a payment
 * in a specific currency
 */
public interface CurrencyProcessor {

    // Low-level operation to be defined by all concrete implementors
    void pay(BigDecimal amount);

}
