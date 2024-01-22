package main.de.ait.wallet.service.impl;

import main.de.ait.wallet.service.Money;

public class BankTransferImpl implements Money {
    @Override
    public String payment() {
        return " Make a bank transfer";
    }
}
