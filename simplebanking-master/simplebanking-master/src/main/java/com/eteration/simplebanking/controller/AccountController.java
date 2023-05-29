package com.eteration.simplebanking.controller;
import org.springframework.http.ResponseEntity;

import com.eteration.simplebanking.model.Account;
import com.eteration.simplebanking.model.DepositTransaction;
import com.eteration.simplebanking.model.WithdrawalTransaction;

// This class is a place holder you can change the complete implementation
public class AccountController {


    public ResponseEntity<Account> getAccount(String s) {
        return null;
    }

    public ResponseEntity<TransactionStatus> credit(String number, DepositTransaction d) {
        return null;
    }
    public ResponseEntity<TransactionStatus> debit(String number,WithdrawalTransaction w) {
        return null;
	}
}