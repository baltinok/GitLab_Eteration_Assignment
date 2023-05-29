package com.eteration.simplebanking.model;

import java.util.List;

// This class is a place holder you can change the complete implementation

public class Account {

private String name;
private String number;
private int balance;
    public Account(String name,String number) {
this.name = name;
this.number = number;

    }



public String getOwner() {
    return "";
}


public String getAccountNumber() {
    return "0";
}

    public String findAccount() {
        return "";


    }


    public double getBalance() {
        return balance;
    }


    public void deposit(int number) {

        balance += number;
    }


    public void withdraw(int number) {

     balance -= number;



    }
public List <Transaction>  getTransactions() {

    return null;
}



public void post(DepositTransaction d) {

}


public void post(WithdrawalTransaction w) {

}
}
