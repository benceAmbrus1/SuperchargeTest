package com.Supercharge.Test.dao;

public interface IDataSingleton {

    boolean isUserExist(String user);
    boolean isEnoughBalance(String user, double withdraw);
    void depositMoneyToUser(String user, double deposit);
    void withdrawMoneyFromUser(double withdraw, String accountName);
}
