package oop_review.bank;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Account {
    Scanner sca = new Scanner(System.in);
    private long numberAccount;
    private String nameAccount;
    private double moneyInAccount;
    private double interestRate = 0.035;

    public Account() {
    }

    public Account(long numberAccount, String nameAccount, double moneyInAccount) {
        this.numberAccount = numberAccount;
        this.nameAccount = nameAccount;
        this.moneyInAccount = moneyInAccount;
    }

    public Account(long numberAccount, String nameAccount) {
        this.numberAccount = numberAccount;
        this.nameAccount = nameAccount;
        this.moneyInAccount = 50;
    }

    public long getNumberAccount() {
        return numberAccount;
    }

    public void setNumberAccount(long numberAccount) {
        this.numberAccount = numberAccount;
    }

    public String getNameAccount() {
        return nameAccount;
    }

    public void setNameAccount(String nameAccount) {
        this.nameAccount = nameAccount;
    }

    public double getMoneyInAccount() {
        return moneyInAccount;
    }

    public void setMoneyInAccount(double moneyInAccount) {
        this.moneyInAccount = moneyInAccount;
    }

    @Override
    public String toString() {
        Locale localeVN = new Locale("vi", "VN");
        NumberFormat currencyVN = NumberFormat.getCurrencyInstance(localeVN);
        String str1 = currencyVN.format(moneyInAccount);
        return "Account{" +
                "numberAccount=" + numberAccount +
                ", nameAccount='" + nameAccount + '\'' +
                ", moneyInAccount=" + str1 +
                '}';
    }

    public String addMoneyToAccount(double money) {
        while (money <= 0) {
            System.out.print("So tien nap "+money+" khong hop le, hay nhap lai: ");
            money = sca.nextInt();
        }
        setMoneyInAccount(this.moneyInAccount = getMoneyInAccount() + money);
        return "Tong so tien ban co = " + moneyInAccount;
    }

    public String withdrawalsFromBank(double money) {
        int withdrawalFee = 5000;
        double moneyCheck = money + withdrawalFee;
        while (moneyCheck > moneyInAccount) {
            System.out.print("So tien rut "+money+" khong hop le, hay nhap lai: ");
            money = sca.nextInt();
            moneyCheck = money + withdrawalFee;
        }
        setMoneyInAccount(this.moneyInAccount = getMoneyInAccount() - moneyCheck);
        return "Ban da rut so tien: "+money+" voi phi rut la: "+withdrawalFee+". So tien con lai trong tai khoan: "+getMoneyInAccount();
    }

    public String sendMoney(long numberAccount, double money) {
        while (this.moneyInAccount < money) {
            System.out.print("So tien ban co: "+getMoneyInAccount()+" va so tien ban chuyen: "+money+" khong hop le. Hay nhap lai: ");
            money = sca.nextInt();
        }
        System.out.println("Da chuyen "+money+" den STK "+numberAccount);
        setMoneyInAccount(this.moneyInAccount -= money);
        return "So tien con lai trong STK "+getNumberAccount()+" la: "+getMoneyInAccount();
    }

    public double expire(int i) {
        if (i > 1) {
            setMoneyInAccount(this.moneyInAccount * interestRate * i + this.moneyInAccount);
            System.out.print("So tien ban co sau "+i+" thang la: ");
            return getMoneyInAccount();
        } else {
            System.out.println("Chua the dao han");
            System.out.print("So tien cua ban la: ");
            return getMoneyInAccount();
        }
    }


}
