package main.de.ait.wallet;

import main.de.ait.wallet.controller.Wallet;
import main.de.ait.wallet.service.Money;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class WalletSpringAppl {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Money money = context.getBean("pay_1", Money.class);

        Wallet wallet = new Wallet(money);
        wallet.pay();

        Wallet wallet2 = context.getBean("wallet_2", Wallet.class);
        wallet2.pay();

        Wallet wallet3 = context.getBean("wallet_3", Wallet.class);
        wallet3.pay();


    }
}
