package com.eteration.simplebanking.model;


// This class is a place holder you can change the complete implementation
public class WithdrawalTransaction extends Transaction{

    public double amount;
    public WithdrawalTransaction(double d) {

super(d);
this.amount = d;

    }






    public String getDate() {
        return "";
    }



    @Override
    void Transaction(double d) {
        // TODO Auto-generated method stub

        this.amount = d;
        throw new UnsupportedOperationException("Unimplemented method 'Transaction'");
    }
}


