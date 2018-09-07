package com.Supercharge.Test.dao;

public class DataSingleton {
    private static DataSingleton ourInstance = new DataSingleton();

    public static DataSingleton getInstance() {
        return ourInstance;
    }

    private DataSingleton() {

    }
}
