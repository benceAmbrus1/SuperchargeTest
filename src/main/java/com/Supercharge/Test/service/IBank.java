package com.Supercharge.Test.service;

import com.Supercharge.Test.exceptions.NotEnoughMoneyOnBalance;
import com.Supercharge.Test.exceptions.UserNotExist;
import com.Supercharge.Test.model.UserHistory;

public interface IBank {

    void Deposit (double deposit, String user) throws UserNotExist;
    void Withdraw (double withdraw, String user) throws NotEnoughMoneyOnBalance, UserNotExist;
    void Transfer (double transfer, String sender, String getter) throws UserNotExist, NotEnoughMoneyOnBalance;
    void PrintHistory(String user) throws UserNotExist;
    void PrintFilterByEventTypeHistory(String user, UserHistory.EventTypo type) throws UserNotExist;
}
