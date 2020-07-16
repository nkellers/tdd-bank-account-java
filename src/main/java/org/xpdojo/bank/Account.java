package org.xpdojo.bank;

public class Account {

    private int balance;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void deposit(int amount) {
        setBalance(this.getBalance() + amount);
    }

    public void withdraw(int amount) {
        setBalance(this.getBalance()-amount);
    }
}
