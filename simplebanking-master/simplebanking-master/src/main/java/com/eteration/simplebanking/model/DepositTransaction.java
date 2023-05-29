package com.eteration.simplebanking.model;


// This class is a place holder you can change the complete implementation
public class DepositTransaction extends Transaction  {

    public double amount;


    public DepositTransaction(double d) {
super(d);
amount = d;
    }


public String getDate() {

return "";

}

@Override
void Transaction(double d) {
    // TODO Auto-generated method stub


    amount = d;

    throw new UnsupportedOperationException("Unimplemented method 'Transaction'");
}








}
