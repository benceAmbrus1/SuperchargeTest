package com.Supercharge.Test.dao.basicDaoImplementation;

import com.Supercharge.Test.dao.IDataSingleton;
import com.Supercharge.Test.exceptions.UserNotExist;
import com.Supercharge.Test.model.User;
import com.Supercharge.Test.model.UserHistory;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

public class DataSingleton implements IDataSingleton {

    private static DataSingleton ourInstance = new DataSingleton();
    private Collection<User> users;

    public static DataSingleton getInstance() {
        return ourInstance;
    }

    public DataSingleton() {
        users = new ArrayList<>();
        users.add(new User(1, "TempUser1", 200.00));
        users.add(new User(2, "TempUser2", 300.00));
        users.add(new User(3, "TempUser3", 400.00));
    }

    @Override
    public boolean isUserExist(String userName) {
        return getUser(userName) != null;
    }

    @Override
    public boolean isEnoughBalance(String userName, double withdraw) throws UserNotExist {
        User user = getUser(userName);
        if (user != null) {
            return user.getBalance() > withdraw;
        }
        throw new UserNotExist();
    }

    @Override
    public void withdrawMoneyFromUser(double withdraw, String accountName) throws UserNotExist {
        User user = getUser(accountName);
        if (user != null) {
            user.Withdraw(withdraw);
            user.getHistory().add(new UserHistory(new Date(), UserHistory.EventTypo.WITHDRAW, withdraw));
        }else{
            throw new UserNotExist();
        }
    }
    @Override
    public void depositMoneyToUser(String userName, double deposit) throws UserNotExist {
        User user = getUser(userName);
        if (user != null) {
            user.Deposit(deposit);
            user.getHistory().add(new UserHistory(new Date(), UserHistory.EventTypo.DEPOSIT, deposit));
        }else{
            throw new UserNotExist();
        }
    }

    @Override
    public void transferMoney(double transfer, String sender, String receiver) throws UserNotExist {
        User senderUser = getUser(sender);
        User receiverUser = getUser(receiver);

        if (senderUser != null) {
            senderUser.Withdraw(transfer);
            senderUser.getHistory().add(new UserHistory(new Date(), UserHistory.EventTypo.TRANSFERSENT, transfer));
        }else{
            throw new UserNotExist();
        }
        if (receiverUser != null) {
            receiverUser.Deposit(transfer);
            senderUser.getHistory().add(new UserHistory(new Date(), UserHistory.EventTypo.TRANSFERGET, transfer));
        }else{
            throw new UserNotExist();
        }
    }

    @Override
    public List<UserHistory> returnUserHistory(String userName) throws UserNotExist {
        User user = getUser(userName);
        if (user != null) {
            return user.getHistory();
        }else{
            throw new UserNotExist();
        }
    }

    private User getUser(String name){
        for (User user: users) {
            if (user.getAccountName().equals(name)){
                return user;
            }
        }
        return null;
    }
}
