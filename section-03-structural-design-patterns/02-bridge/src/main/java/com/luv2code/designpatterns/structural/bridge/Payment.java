package com.luv2code.designpatterns.structural.bridge;

import java.math.BigDecimal;

/**
 * The Abstraction in the Bridge pattern. Defines the high-level payment
 * interface and maintains a reference to an Implementor object.
 */
public abstract class Payment {

    // The "Implementor" - this is the bridge to the underlying implementation
    protected CurrencyProcessor currencyProcessor;

    public Payment(CurrencyProcessor currencyProcessor) {
        this.currencyProcessor = currencyProcessor;
    }

    // High-level operation defined by the abstraction
    public abstract void pay(BigDecimal amount);

}
