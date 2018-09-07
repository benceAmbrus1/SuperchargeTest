package com.Supercharge.Test.Model;

import java.util.ArrayList;
import java.util.Collection;

public class User {

    private int Id;
    private String fName;
    private String lName;
    private double balance;
    private int accountNumber;
    private Collection<UserHistory> history;

    public User(int id, String fName, String lName, double balance, int accountNumber) {
        Id = id;
        this.fName = fName;
        this.lName = lName;
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.history = new ArrayList<>();
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Collection<UserHistory> getHistory() {
        return history;
    }

    public void setHistory(Collection<UserHistory> history) {
        this.history = history;
    }
}
