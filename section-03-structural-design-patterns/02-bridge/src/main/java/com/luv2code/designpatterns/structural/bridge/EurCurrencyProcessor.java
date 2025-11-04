package com.luv2code.designpatterns.structural.bridge;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

/**
 * A Concrete Implementor for processing payments in EUR currency
 */
public class EurCurrencyProcessor implements CurrencyProcessor {

    @Override
    public void pay(BigDecimal amount) {

        NumberFormat f = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        System.out.println("EUR payment of " + f.format(amount));

    }

}
