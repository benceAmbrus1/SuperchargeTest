package com.Supercharge.Test.model;

import java.util.Date;

public class UserHistory {

    public enum EventTypo { DEPOSIT, WITHDRAW, TRANSFERGET, TRANSFERSENT}

    private Date eventDate;
    private EventTypo eventType;
    private double balance;

    public UserHistory(Date eventDate, EventTypo eventType, double balance) {
        this.eventDate = eventDate;
        this.eventType = eventType;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Date getEventDate() {
        return eventDate;
    }

    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }

    public EventTypo getEventType() {
        return eventType;
    }

    public void setEventType(EventTypo eventType) {
        this.eventType = eventType;
    }
}
