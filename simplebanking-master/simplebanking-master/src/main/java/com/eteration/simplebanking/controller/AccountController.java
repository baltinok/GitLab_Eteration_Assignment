package com.eteration.simplebanking.controller;
import org.springframework.http.ResponseEntity;

import com.eteration.simplebanking.model.Account;
import com.eteration.simplebanking.model.DepositTransaction;
import com.eteration.simplebanking.model.InsufficientBalanceException;
import com.eteration.simplebanking.model.WithdrawalTransaction;
import com.eteration.simplebanking.services.AccountService;

// This class is a place holder you can change the complete implementation
public class AccountController {
    ResponseEntity<TransactionStatus> a;
    private int times = 0; 
    AccountService s = new AccountService();

    public ResponseEntity<Account> getAccount(String s) {
        return null;
    }

    
    public ResponseEntity<TransactionStatus> credit(String number, DepositTransaction d) throws Exception {
        times+=1;

         s.findAccount(number);
         s.times+=1;
        return a;
    }
    public ResponseEntity<TransactionStatus> debit(String number,WithdrawalTransaction w) {
        return null;
	}
}