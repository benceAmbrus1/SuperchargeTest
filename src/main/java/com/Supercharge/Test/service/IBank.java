package com.Supercharge.Test.service;

import com.Supercharge.Test.exceptions.NotEnoughMoneyOnBalance;
import com.Supercharge.Test.exceptions.UserNotExist;

public interface IBank {

    void Deposit (double deposit, String user) throws UserNotExist;
    void Withdraw (double withdraw, String user) throws NotEnoughMoneyOnBalance, UserNotExist;
    void Transfer (double transfer, String sender, String getter);
}
