package com.Supercharge.Test.Service;

import com.Supercharge.Test.Model.User;

public interface IBank {

    void Deposit (double deposit, User user);
    void Withdraw (double deposit, User user);
    void Transfer (double deposit, User sender, User getter);
}
