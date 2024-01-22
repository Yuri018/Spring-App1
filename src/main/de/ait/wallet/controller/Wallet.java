package main.de.ait.wallet.controller;

import main.de.ait.wallet.service.Money;

public class Wallet {
    private Money money;
    private int sum;

    public Wallet(Money money) {
        this.money = money;
    }

    public Money getMoney() {
        return money;
    }

    public void setMoney(Money money) {
        this.money = money;
    }

    public void pay() {
        System.out.println("Payment method: " + money.payment());
    }
}
