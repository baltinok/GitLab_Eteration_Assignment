package com.eteration.simplebanking.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;

// This class is a place holder you can change the complete implementation

public class Account  {

private String name;
private String number;
private int balance;
private String owner;
private List <Transaction> t = new ArrayList<>();
    public Account(String name,String number) throws Exception  {
this.name = name;
this.number = number;
this.balance = 0;


    }



public String getOwner() throws InsufficientBalanceException {
    return name;
}


public String getAccountNumber() throws InsufficientBalanceException {
    return number;
}

    public String findAccount(String number) throws InsufficientBalanceException {
        return number;


    }


    public double getBalance() throws InsufficientBalanceException {
        return this.balance;
    }


    public void deposit(int number) throws InsufficientBalanceException {

        this.balance += number;
        DepositTransaction deposit = new DepositTransaction(number);

    }


    public void withdraw(int number) throws Exception {

     this.balance -= number;



    }
public List <Transaction>  getTransactions() throws InsufficientBalanceException,NullPointerException {

    
    return (List<Transaction>) t;

    
}



public void post(DepositTransaction d) throws InsufficientBalanceException{

this.balance+= d.amount;
t.add(d);


}
public void post(WithdrawalTransaction d) throws InsufficientBalanceException{
this.balance -= d.amount;
t.add(d);
}

public void credit(double d) {

}
public void debit(double d) {

}
}
