package org.xpdojo.bank;

import Exceptions.AmountException;

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

    public void trasferAmoutTo(Account recipient, int amount) {
        if(this.getBalance() > 0){
            recipient.deposit(amount);
            this.withdraw(amount);
        } else{
            throw new AmountException("Sorry you have not enough money for that transaction");
        }
    }
}
