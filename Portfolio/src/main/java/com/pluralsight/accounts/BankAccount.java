package com.pluralsight.accounts;

import com.pluralsight.model.Valuable;

public class BankAccount implements Valuable {

    private String name;
    private int accountNumber;
    private double balance;

    public BankAccount(String name, double balance, int accountNumber) {
        this.name = name;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public void deposit(double amount) {
        // vvv this is "this.balance = this.balance + amount"
         this.balance += amount;
    }

    public void withdraw(double amount) {
        this.balance -= amount;
    }
    @Override
    public double getValue() {
        return 0;
    }
}
