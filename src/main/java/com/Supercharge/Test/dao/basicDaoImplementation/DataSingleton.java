package com.Supercharge.Test.dao.basicDaoImplementation;

import com.Supercharge.Test.dao.IDataSingleton;
import com.Supercharge.Test.model.User;

import java.util.ArrayList;
import java.util.Collection;

public class DataSingleton implements IDataSingleton {
    private static DataSingleton ourInstance = new DataSingleton();
    private Collection<User> users;

    public static DataSingleton getInstance() {
        return ourInstance;
    }

    private DataSingleton() {
        users = new ArrayList<>();
        //add users later

    }

    @Override
    public boolean isUserExist(String userName) {
        return getUser(userName) != null;
    }

    @Override
    public boolean isEnoughBalance(String userName, double withdraw) {
        User user = getUser(userName);
        return user.getBalance() > withdraw;
    }

    @Override
    public void withdrawMoneyFromUser(double withdraw, String accountName) {
        User user = getUser(accountName);
        user.setBalance(user.getBalance()-withdraw);
    }
    @Override
    public void depositMoneyToUser(String userName, double deposit){
        User user = getUser(userName);
        user.setBalance(user.getBalance()+deposit);
    }

    @Override
    public void transferMoney(double transfer, String sender, String receiver) {
        User senderUser = getUser(sender);
        User recieverUser = getUser(receiver);

        senderUser.setBalance(senderUser.getBalance()-transfer);
        recieverUser.setBalance(recieverUser.getBalance() + transfer);
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
