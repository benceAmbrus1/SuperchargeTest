package com.Supercharge.Test.model;

import java.util.Date;

public class UserHistory {

    public enum EventTypo { DEPOSIT, WITHDRAW, TRANSFER}

    private Date eventDate;
    private EventTypo eventType;

    public UserHistory(Date eventDate, EventTypo eventType) {
        this.eventDate = eventDate;
        this.eventType = eventType;
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
