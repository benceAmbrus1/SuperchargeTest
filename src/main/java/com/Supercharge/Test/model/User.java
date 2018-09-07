package com.Supercharge.Test.model;

import java.util.ArrayList;
import java.util.List;

public class User {

    private int Id;
    private String accountName;
    private double balance;
    private List<UserHistory> history;

    public User(int id, String accountName, double balance) {
        Id = id;
        this.accountName = accountName;
        this.balance = balance;
        this.history = new ArrayList<>();
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public List<UserHistory> getHistory() {
        return history;
    }

    public void setHistory(List<UserHistory> history) {
        this.history = history;
    }
}
