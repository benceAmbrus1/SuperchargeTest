package com.Supercharge.Test.dao;

import com.Supercharge.Test.exceptions.UserNotExist;
import com.Supercharge.Test.model.UserHistory;
import java.util.List;

public interface IDataSingleton {

    boolean isUserExist(String user);
    boolean isEnoughBalance(String user, double withdraw) throws UserNotExist;
    void depositMoneyToUser(String user, double deposit) throws UserNotExist;
    void withdrawMoneyFromUser(double withdraw, String accountName) throws UserNotExist;
    void transferMoney(double transfer, String sender, String receiver) throws UserNotExist;
    List<UserHistory> returnUserHistory(String user) throws UserNotExist;
}
