package com.app.model;

import com.app.model.enums.AccType;

public class Account {
    private String accountName;
    private Double balance;
    private AccType type;

    public Account(String accountName, Double balance, AccType type) {
        this.accountName = accountName;
        this.balance = balance;
        this.type = type;
    }
    
    public String getAccountName() {
        return accountName;
    }
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }
    public Double getBalance() {
        return balance;
    }
    public AccType getType() {
        return type;
    }
    public void setType(AccType type) {
        this.type = type;
    }

    // Methods withdraw/deposit

    public boolean deposit(Double amount){
        if(amount > 0){
            this.balance += amount;
            return true;
        } else {
            System.out.println("Valor inválido: número negativo");
            return false;
        }
    }

    public boolean withdraw(Double amount){
        if(amount > 0 && amount <= this.balance){
            this.balance -= amount;
            return true;
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
            return false;
        }
    }
}
