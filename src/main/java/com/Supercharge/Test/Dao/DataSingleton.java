package com.Supercharge.Test.Dao;

public class DataSingleton {
    private static DataSingleton ourInstance = new DataSingleton();

    public static DataSingleton getInstance() {
        return ourInstance;
    }

    private DataSingleton() {
    }
}
