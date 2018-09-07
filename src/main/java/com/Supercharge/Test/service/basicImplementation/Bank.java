package com.Supercharge.Test.service.basicImplementation;

import com.Supercharge.Test.dao.DataSingleton;
import com.Supercharge.Test.exceptions.NotEnoughMoneyOnBalance;
import com.Supercharge.Test.model.User;
import com.Supercharge.Test.service.IBank;

public class Bank implements IBank {

    private DataSingleton bankDB;

    public Bank(DataSingleton bankDB) {
        this.bankDB = bankDB;
    }

    @Override
    public void Deposit(double deposit, User user) {
        try{

        } catch (){

        }
    }

    @Override
    public void Withdraw(double withdraw, User user) {
        try{
            withdrawMoneyFromUser(withdraw, user);
        } catch (NotEnoughMoneyOnBalance e){
            System.out.println(e.getMessage());
        }
    }

    private void withdrawMoneyFromUser(double withdraw, User user) throws NotEnoughMoneyOnBalance{
        if(user.getBalance() > withdraw){

        }else{
            throw new NotEnoughMoneyOnBalance("There is no enough money on your account");
        }
    }

    @Override
    public void Transfer(double transfer, User sender, User getter) {
        try{

        }catch(){

        }
    }

}
