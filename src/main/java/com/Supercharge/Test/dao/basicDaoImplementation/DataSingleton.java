package com.Supercharge.Test.dao.basicDaoImplementation;

import com.Supercharge.Test.dao.IDataSingleton;

public class DataSingleton implements IDataSingleton {
    private static DataSingleton ourInstance = new DataSingleton();

    public static DataSingleton getInstance() {
        return ourInstance;
    }

    private DataSingleton() {

    }

    @Override
    public boolean isUserExist(String user) {
        return false;
    }

    @Override
    public boolean isEnoughBalance(String user) {
        return false;
    }

    @Override
    public void withdrawMoneyFromUser(double withdraw, String accountName) {

    }
}
