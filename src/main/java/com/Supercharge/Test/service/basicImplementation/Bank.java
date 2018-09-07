package com.Supercharge.Test.service.basicImplementation;

import com.Supercharge.Test.dao.basicDaoImplementation.DataSingleton;
import com.Supercharge.Test.exceptions.NotEnoughMoneyOnBalance;
import com.Supercharge.Test.exceptions.UserNotExist;
import com.Supercharge.Test.model.UserHistory;
import com.Supercharge.Test.service.IBank;

import java.util.ArrayList;
import java.util.List;

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
    public void Transfer(double transfer, String senderName, String receiverName) throws NotEnoughMoneyOnBalance,UserNotExist {
        if (bankDB.isUserExist(senderName) && bankDB.isUserExist(receiverName)){
            if(bankDB.isEnoughBalance(senderName, transfer)){
                bankDB.transferMoney(transfer, senderName, receiverName);
            }else{
                throw new NotEnoughMoneyOnBalance("Not enough money on " + senderName + " balance.");
            }
        }else{
            throw new UserNotExist("One of the user not exist");
        }
    }

    @Override
    public void PrintHistory(String userName) throws UserNotExist {
        if(bankDB.isUserExist(userName)){
            for( UserHistory history : bankDB.returnUserHistory(userName)){
                System.out.println(history);
            }
        }else{
            throw new UserNotExist("User not Exist");
        }
    }

    @Override
    public void PrintFilterByEventTypeHistory(String userName, UserHistory.EventTypo type) throws UserNotExist {
        if(bankDB.isUserExist(userName)){
            List<UserHistory> historyList = bankDB.returnUserHistory(userName);
            for( UserHistory history : FilterByType(historyList, type)){
                System.out.println(history);
            }
        }else{
            throw new UserNotExist("User not Exist");
        }
    }

    private List<UserHistory> FilterByType(List<UserHistory> historyList, UserHistory.EventTypo type){
        List<UserHistory> filteredList = new ArrayList<>();
        for(UserHistory history: historyList){
            if(history.getEventType() == type){
                filteredList.add(history);
            }
        }
        return filteredList;
    }
}
