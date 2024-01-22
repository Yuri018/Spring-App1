package main.de.ait.wallet.service.impl;

import main.de.ait.wallet.service.Money;

public class PayByCardImpl implements Money {
    @Override
    public String payment() {
        return " Pay by card";
    }
}
