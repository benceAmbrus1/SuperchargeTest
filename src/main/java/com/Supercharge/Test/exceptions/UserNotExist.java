package com.Supercharge.Test.exceptions;

public class UserNotExist extends Exception{
    public UserNotExist() {
        super();
    }

    public UserNotExist(String message) {
        super(message);
    }

    public UserNotExist(String message, Throwable cause) {
        super(message, cause);
    }

    public UserNotExist(Throwable cause) {
        super(cause);
    }

    protected UserNotExist(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
