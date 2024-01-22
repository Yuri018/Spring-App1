package main.de.ait.wallet.service.impl;

import main.de.ait.wallet.service.Money;

public class CashPaymentImpl implements Money {
    @Override
    public String payment() {
        return " Pay in cash";
    }
}
