package com.Supercharge.Test.service.basicImplementation;

import com.Supercharge.Test.dao.basicDaoImplementation.DataSingleton;
import com.Supercharge.Test.exceptions.NotEnoughMoneyOnBalance;
import com.Supercharge.Test.exceptions.UserNotExist;
import com.Supercharge.Test.service.IBank;

public class Bank implements IBank {

    private DataSingleton bankDB;

    public Bank(DataSingleton bankDB) {
        this.bankDB = bankDB;
    }

    @Override
    public void Deposit(double deposit, String accountName) throws UserNotExist {
        if(bankDB.isUserExist(accountName)){
            bankDB.depositMoneyToUser(accountName, deposit);
        }else{
            throw new UserNotExist("User not Exist");
        }
    }

    @Override
    public void Withdraw(double withdraw, String accountName) throws NotEnoughMoneyOnBalance, UserNotExist{
        if(bankDB.isUserExist(accountName)){
            if(bankDB.isEnoughBalance(accountName, withdraw)){
                bankDB.withdrawMoneyFromUser(withdraw, accountName);
            }else {
                throw new NotEnoughMoneyOnBalance("Not enough money on " + accountName + " balance.");
            }
        }else{
            throw new UserNotExist("User not Exist");
        }
    }


    @Override
    public void Transfer(double transfer, String senderName, String getterName) {

    }

}
