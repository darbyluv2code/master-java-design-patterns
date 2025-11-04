package com.luv2code.designpatterns.structural.bridge;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

/**
 * A Concrete Implementor for processing payments in USD
 */
public class UsdCurrencyProcessor implements CurrencyProcessor {

    @Override
    public void pay(BigDecimal amount) {

        NumberFormat f = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println("USD payment of " + f.format(amount));

    }
}
