package com.Supercharge.Test.Model;

import java.util.Date;

public class UserHistory {

    enum EventType { DEPOSIT, WITHDRAW, TRANSFER}

    private Date eventDate;
    private EventType eventType;

    public UserHistory(Date eventDate, EventType eventType) {
        this.eventDate = eventDate;
        this.eventType = eventType;
    }

    public Date getEventDate() {
        return eventDate;
    }

    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }

    public EventType getEventType() {
        return eventType;
    }

    public void setEventType(EventType eventType) {
        this.eventType = eventType;
    }
}
