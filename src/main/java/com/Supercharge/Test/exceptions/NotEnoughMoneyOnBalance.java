package com.Supercharge.Test.exceptions;

public class NotEnoughMoneyOnBalance extends Exception {
    public NotEnoughMoneyOnBalance() {
        super();
    }

    public NotEnoughMoneyOnBalance(String message) {
        super(message);
    }

    public NotEnoughMoneyOnBalance(String message, Throwable cause) {
        super(message, cause);
    }

    public NotEnoughMoneyOnBalance(Throwable cause) {
        super(cause);
    }

    protected NotEnoughMoneyOnBalance(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
