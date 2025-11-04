package com.luv2code.designpatterns.structural.bridge;

import java.math.BigDecimal;

/**
 * A Refined Abstraction for handling net banking payments
 */
public class NetBankingPayment extends Payment {

    public NetBankingPayment(CurrencyProcessor currencyProcessor) {
        super(currencyProcessor);
    }

    /**
     * A helper method to handle logic specific to the NetBankingPayment abstraction.
     * In a real-world scenario, this would contain code to establish a secure connection
     * with the user's bank server.
     */
    private void connectToBankApi() {

        System.out.println("[NetBankingPayment] Establishing secure connection to bank API ...");

        // Simulate a delay for connection
        try {
            Thread.sleep(1000); // 1 second delay
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("[NetBankingPayment] Connection successful.");
    }

    @Override
    public void pay(BigDecimal amount) {

        System.out.println("--- BEGIN: Net Banking Transaction ---");

        // 1. Handle the abstraction-specific logic first
        connectToBankApi();

        // 2. Delegate to the implementation-specific logic to the CurrencyProcessor
        //    This is the "bridge" in action
        currencyProcessor.pay(amount);

        System.out.println("--- END: Net Banking Transaction ---");

    }

}








