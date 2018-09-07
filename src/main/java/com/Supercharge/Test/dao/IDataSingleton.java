package com.Supercharge.Test.dao;

import com.Supercharge.Test.exceptions.UserNotExist;

public interface IDataSingleton {

    boolean isUserExist(String user);
    boolean isEnoughBalance(String user, double withdraw) throws UserNotExist;
    void depositMoneyToUser(String user, double deposit) throws UserNotExist;
    void withdrawMoneyFromUser(double withdraw, String accountName) throws UserNotExist;
    void transferMoney(double transfer, String sender, String receiver) throws UserNotExist;
}
