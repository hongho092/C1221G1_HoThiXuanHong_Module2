package oop_review.bank;

import java.text.NumberFormat;
import java.util.Locale;

public class TestAccount {
    public static void main(String[] args) {
        Account acc = new Account(123, "Hong", 345000000);
        System.out.println(acc);
        Account acc1 = new Account(234, "Mai");
        System.out.println(acc1.addMoneyToAccount(0));
        System.out.println(acc1.withdrawalsFromBank(600000));
        System.out.println(acc.sendMoney(234, 50000));
        System.out.println(acc1.expire(0));

    }
}
