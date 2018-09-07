package com.Supercharge.Test.service;

import com.Supercharge.Test.model.User;

public interface IBank {

    void Deposit (double deposit, User user);
    void Withdraw (double withdraw, User user);
    void Transfer (double transfer, User sender, User getter);
}
