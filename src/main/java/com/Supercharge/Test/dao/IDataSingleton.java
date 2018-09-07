package com.Supercharge.Test.dao;

public interface IDataSingleton {

    boolean isUserExist(String user);
    boolean isEnoughBalance(String user);
    void withdrawMoneyFromUser(double withdraw, String accountName);
}
