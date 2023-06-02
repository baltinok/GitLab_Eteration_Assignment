package com.eteration.simplebanking.services;

import java.util.ArrayList;

import com.eteration.simplebanking.controller.AccountController;
import com.eteration.simplebanking.model.Account;


// This class is a place holder you can change the complete implementation
public class AccountService {

    public int times = 0;

    public AccountController c = new AccountController();

    public ArrayList<Account> ac = new ArrayList<Account>();
   


   

    public Account findAccount(String number) throws Exception {
  
        Account ac = new Account("service",number);

        return ac;
     

    }

    




   
}
