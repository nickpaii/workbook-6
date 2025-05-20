package com.pluralsight.accounts;

import com.pluralsight.model.Valuable;

public class CreditCard implements Valuable {

    private String name;
    private String accountNumber;
    private double balance;

    public CreditCard(String name, double balance, String accountNumber) {
        this.name = name;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public void charge(double amount) {
        this.balance -= amount;
    }

    public void pay(double amount) {
        this.balance += amount;
    }

    @Override
    public double getValue() {
        return 0;
    }
}
